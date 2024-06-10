class Solution {
    public int minimumChairs(String s) {
        int n = s.length();
        int min_chair = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == 'E'){
                min_chair++;
            }else{
                min_chair--;
            }
            max = Math.max(min_chair , max);
        }
        return max;
    }
}
