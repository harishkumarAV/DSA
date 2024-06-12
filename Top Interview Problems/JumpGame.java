class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        for(int i=1;i<n;i++){
            if(max <1){
                return false;
            }
            max = Math.max(max-1 , nums[i]);
        }
        return true;
    }
}
