class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        int n = nums.length;
        List<Integer> l = new ArrayList<>();
        f(n,0,l,nums);
        return res;
    }
    public void f(int n , int index , List<Integer> l ,int[] nums){
        res.add(new ArrayList<>(l));
        for(int i=index;i<n;i++){
            l.add(nums[i]);
            f(n,i+1,l,nums);
            l.remove(l.size()-1);
        }
    }
}
