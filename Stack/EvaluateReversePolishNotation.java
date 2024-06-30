class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int n1 = stack.pop();
                int n2 = stack.pop();
                int sum = n1+n2;
                stack.push(sum);
            }
            else if(tokens[i].equals("-")){
                int n1 = -stack.pop();
                int n2 = +stack.pop();
                stack.push(n1+n2);

            }
            else if(tokens[i].equals("*")){
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(n1*n2);

            }
            else if(tokens[i].equals("/")){
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(n2/n1);

            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }
}
