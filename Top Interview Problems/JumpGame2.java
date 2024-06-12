class Solution {
    public int jump(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int temp = 0;
        int count =0;
        for(int i=0;i<n-1;i++){
            max = Math.max(max , i + nums[i]);
            if(temp == i){
                count++;
                temp = max;
            }
        }
        return count;
    }
}
