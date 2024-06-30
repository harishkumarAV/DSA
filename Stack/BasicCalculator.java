class Solution {
    public int calculate(String s) {
        int res = 0;
        int n = 0;
        int si = 1;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                n = 10*n + (int)(ch - '0');
            }
            else if(ch == '+'){
                res += si*n;
                n=0;
                si=1;
            }
            else if(ch == '-'){
                res += si*n;
                n=0;
                si=-1;
            }
            else if(ch == '('){
                stack.push(res);
                stack.push(si);
                si=1;
                res=0;
            }
            else if(ch == ')'){
                res += si*n;
                n=0;
                res*=stack.pop();
                res+=stack.pop();

            }
        }
        if(n!=0){
            res+=si*n;
        }
        return res;
    }
}
