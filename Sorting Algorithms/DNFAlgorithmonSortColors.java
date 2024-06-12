class Solution {
    public void sortColors(int[] nums) {
        int left =0;
        int n = nums.length;
        int right = n-1;
        int mid = 0;
        while(mid <= right){
            switch(nums[mid]){
                case 0:
                    int temp = nums[left];
                    nums[left] = nums[mid];
                    nums[mid] = temp;
                    left++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp2 = nums[right];
                    nums[right] = nums[mid];
                    nums[mid] = temp2;
                    right--;
                    break;
            }
        }
    }
}
