class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l =new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        find(l,nums,temp);
        return l;
    }
    public void find(List<List<Integer>> l ,int nums[],List<Integer> temp){
        if(temp.size()==nums.length){
            l.add(new ArrayList<>(temp));
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(temp.contains(nums[i])){
                    continue;
                }
                else{
                    temp.add(nums[i]);
                    find(l,nums,temp);
                    temp.remove(temp.size()-1);
                }
            }
        }
    }
}
