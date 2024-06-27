class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<Integer> l = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        f(0,nums,new ArrayList<>(),used);
        return res;
    }
    public void f(int start,int nums[],List<Integer>l,boolean[] used){
        if(l.size() == nums.length){
            res.add(new ArrayList<>(l));
            return;
        }else{
            for(int i=0 ; i<nums.length;i++){
                if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) continue;  // Skip duplicates
                used[i]=true;
                l.add(nums[i]);
                f(i+1,nums,l,used);
                used[i]=false;
                l.remove(l.size()-1);
            }
        }
    }
}
