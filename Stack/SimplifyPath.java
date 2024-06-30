class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack();
        String p[] = path.split("/");
        for(int i=0;i<p.length;i++){
            if(!stack.empty() && p[i].equals("..")){
                stack.pop();
            }else if(!p[i].equals(".") && !p[i].equals("") && !p[i].equals("..")){
                stack.push(p[i]);
            }
        }
        List<String> l = new ArrayList<>(stack);
        return "/" + String.join("/" , l);
    }
}
