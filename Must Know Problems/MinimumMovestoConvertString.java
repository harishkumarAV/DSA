class Solution {
    public int minimumMoves(String s) {
        int i=0;
        int count=0;
        while(i < s.length()){
            if(s.charAt(i) == 'X'){
                count++;
                i+=3;
            }else{
                i++;
            }
        }
        return count;
    }
}
