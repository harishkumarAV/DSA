class Solution {
    List<List<Integer>> ans;

    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        combinations(1, l, n, k);
        return ans;
    }

    public void combinations(int start, List<Integer> l, int n, int k) {
        if (l.size() == k) {
            ans.add(new ArrayList<>(l)); 
            return;
        }
        
        for (int i = start; i <= n; i++) {
            l.add(i);
            combinations(i + 1, l, n, k);
            l.remove(l.size() - 1); 
        }
    }
}
