class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            l.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            if(l.contains(nums1[i]) && !ans.contains(nums1[i])){
                ans.add(nums1[i]);
            }
        }
        int fin[] = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            fin[i] = ans.get(i);
        }
        return fin;
    }
}
