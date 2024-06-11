class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int left  = 0;
        int n = nums.length;
        int sum =0;
        for(int right=0;right<n;right++){
            sum += nums[right];
            while(sum >= target){
                min = Math.min(right - left +1 , min);
                sum-=nums[left];
                left++;
            }
        }
        if(min == Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}
