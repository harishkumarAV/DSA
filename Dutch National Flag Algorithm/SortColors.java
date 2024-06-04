class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int temp = 0;
        int mid =0;
        while(mid <= right){
            switch(nums[mid]){
                case 0:{
                    temp = nums[left];
                    nums[left] = nums[mid];
                    nums[mid] = temp;
                    left++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp = nums[right];
                    nums[right] = nums[mid];
                    nums[mid] = temp;
                    right--;
                    break;
                }
            }
        }
    }
}
