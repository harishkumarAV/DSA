class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char ch[] = strs[i].toCharArray();
            Arrays.sort(ch);
            String temp = String.valueOf(ch);

            if(hm.containsKey(temp)){
                List<String> s = hm.get(temp);
                s.add(strs[i]);
                hm.put(temp , s);
            }
            else{
                List<String> s = new ArrayList<>();
                s.add(strs[i]);
                hm.put(temp , s);

            }
        }

        List<List<String>> st = new ArrayList<>();
        for(Map.Entry<String , List<String>> mapel : hm.entrySet()){
            st.add(mapel.getValue());
        }
        return st;
    }
}
