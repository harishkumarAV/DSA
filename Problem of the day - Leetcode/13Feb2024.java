class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(isPal(words[i]) == true){
                return words[i];
            }
        }
        return "";
    }
    public boolean isPal(String temp){
        String s= "";
        for(int i=temp.length()-1;i>=0;i--){
            s+=temp.charAt(i);
        }
        if(s.equals(temp)){
            return true;
        }
        return false;
    }
}
