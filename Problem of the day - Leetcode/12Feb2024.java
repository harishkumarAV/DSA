class Solution {
    public int majorityElement(int[] nums) {
        int count=nums.length/2;
        Arrays.sort(nums);
        int temp=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                temp++;
                if(temp > count){
                    return nums[i];
                }
            }
            else{
                temp=1;
            }
        }
        return nums[0];
    }
}
