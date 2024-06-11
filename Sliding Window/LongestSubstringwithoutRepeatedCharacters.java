class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n==0){
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int left = 0;
        int max = Integer.MIN_VALUE;
        for(int right =0;right<n;right++){
            if(set.contains(s.charAt(right))){
                while(left < right &&  set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            set.add(s.charAt(right));
            max = Math.max(max , right - left + 1);
        }
        return max;
    }
}
