class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i] <= 0){
                temp1.add(nums[i]);
            }
            else{
                temp2.add(nums[i]);
            }
        }

        int ind1=0,ind2=0;
        while(ind2 < nums.length/2){
            ans.add(temp2.get(ind2));
            ind2++;
            ans.add(temp1.get(ind1));
            ind1++;
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
