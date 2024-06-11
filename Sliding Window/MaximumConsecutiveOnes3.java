class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int n = nums.length;
        int count_zeros = 0;
        int max = 0;
        for(int right = 0;right<n;right++){
            if(nums[right] == 0){
                count_zeros ++;
            }
            while(count_zeros > k)
            {
                if(nums[left] == 0){
                    count_zeros--;
                }
                left++;
            }
            max = Math.max(max , right - left + 1);
        }
        return max;
    }
}
