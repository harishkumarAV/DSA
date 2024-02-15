class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum=0;
        boolean isfalse=false;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]==0){
                isfalse=true;
            }
        }
        int min=Integer.MAX_VALUE;
        int currmin=0;
        for(int i=0;i<nums.length;i++){
            currmin += nums[i];
            min=Math.min(currmin,min);
            if(currmin>=0){
                currmin=0;
            }
        }
        int max=Integer.MIN_VALUE;
        int currmax=0;
        for(int i=0;i<nums.length;i++){
            currmax += nums[i];
            max=Math.max(max,currmax);
            if(currmax<0){
                currmax=0;
            }
        }
        if(sum==min && !isfalse){
            return max;
        }
        return Math.max(sum-min,max);
    }
}
