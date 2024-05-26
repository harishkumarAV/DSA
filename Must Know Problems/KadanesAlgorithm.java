
class Solution{
    long maxSubarraySum(int nums[], int n){
        // Your code here
        long max = Integer.MIN_VALUE;
        long sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            max = Math.max(max,sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
