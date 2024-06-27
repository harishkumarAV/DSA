class Solution {
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        f(0,0,new StringBuilder(),n);
        return res;
    }
    public void f(int open,int close,StringBuilder sb,int n){
        if(sb.length() == 2*n){
            res.add(sb.toString());
            return;
        }
        if(open < n){
            f(open+1,close,sb.append("("),n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close < open){
            f(open,close+1,sb.append(")"),n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
