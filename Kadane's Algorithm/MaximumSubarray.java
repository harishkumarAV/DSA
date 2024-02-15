class Solution {
    public int maxSubArray(int[] nums) {
        int sum=Integer.MIN_VALUE,temp=0;
        for(int i=0;i<nums.length;i++){
            temp+=nums[i];
            sum = Math.max(sum,temp);
            if(temp<0){
                temp=0;
            }
        }
        return sum;
    }
}
