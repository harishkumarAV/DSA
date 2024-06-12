class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k%=n;       
        help(nums,0,n-k-1);
        help(nums,n-k,n-1); 
        help(nums,0,n-1);
    }
    public void help(int nums[],int start,int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
