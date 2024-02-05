class Solution {
    public int firstUniqChar(String s) {
        int temp[]=new int[26];
        int j;
        for(int i=0;i<s.length();i++){
            temp[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(temp[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
