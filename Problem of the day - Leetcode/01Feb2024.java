class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int [][]result = new int[0][0];
        for(int i=0;i<nums.length;i++){
            if(i % 3 == 0){
                if(nums[i + 2] - nums[i] <= k){
                    int[] triplet = {nums[i] , nums[i+1] ,nums[i+2]};
                    result = Arrays.copyOf(result , result.length + 1);
                    result[result.length - 1] = triplet;
                }
                else{
                    return new int[0][0];
                }
            }
        }
        return result;
    }
}
