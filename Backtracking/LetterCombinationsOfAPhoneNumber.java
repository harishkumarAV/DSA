class Solution {
    List<String> res;
    public List<String> letterCombinations(String digits) {
        res = new ArrayList<>();
        if(digits.length()==0){
            return res;
        }
        String phn[] = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        f(0,digits,new StringBuilder(),phn);
        return res;
    }
    public void f(int length  , String digits , StringBuilder temp,String[] phn){
        if(length == digits.length()){
            res.add(temp.toString());
            return;
        }
        String phn_no = phn[digits.charAt(length) - '0'];
        for(char c : phn_no.toCharArray()){
            temp.append(c);
            f(length+1 , digits , temp , phn);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}
