class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int right =0;right<n;right++){
            if(nums[right] == 0){
                nums[right] =1;
                count++;
                if(right < n-2){
                    nums[right+1] = nums[right+1]==0?1:0;
                    nums[right+2] = nums[right+2]==0?1:0;
                }else{
                    return -1;
                }
            }
        }
        return count;
    }
}
