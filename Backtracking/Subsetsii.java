class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res = new ArrayList<>();
        Arrays.sort(nums);
        f(0,nums,new ArrayList<>());
        return res;
    }
    public void f(int start,int[] nums,List<Integer> l){
        if(!res.contains(l)){
            res.add(new ArrayList<>(l));
        }
        for(int i=start;i<nums.length;i++){
            l.add(nums[i]);
            f(i+1,nums,l);
            l.remove(l.size()-1);
        }
    }
}
