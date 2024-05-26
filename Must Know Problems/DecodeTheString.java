class Solution{
    static String decodedString(String s){
        // code here
        Stack<String> st = new Stack<>();
        char ch[] = s.toCharArray();
        int n = ch.length;
        for(int i=0;i<n;){
            if(ch[i] == '['){
                st.push("[");
                i++;
            }else if(ch[i] == ']'){
                String str = "";
                while(st.peek().charAt(0) != '['){
                    str = st.pop()+str;
                }
                st.pop();
                int times = Integer.parseInt(st.pop());
                String spare = str;
                while(times-- >1){
                    str += spare;
                }
                st.push(str);
                i++;
            }
            else if(ch[i] >= '0' && ch[i] <= '9'){
                String str="";
                while(i<n && ch[i] >= '0' && ch[i] <='9'){
                    str += ch[i];
                    i++;
                }
                st.push(str);
            }
            else{
                String str="";
                while(i<n && ch[i] >= 'a' && ch[i] <='z'){
                    str += ch[i];
                    i++;
                }
                st.push(str);
            }
        }
        String res="";
        while(!st.isEmpty()){
            res = st.pop() + res;
        }
        return res;
    }
}
