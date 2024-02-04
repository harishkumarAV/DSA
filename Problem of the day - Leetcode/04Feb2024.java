class Solution {
    public String minWindow(String s, String t) {
        int map[] = new int[128];
        int start=0,end=0,minstart=0,minlength=Integer.MAX_VALUE,counter=t.length();
        for(char c : t.toCharArray()){
            map[c]++;
        }
        while(end < s.length()){
            final char c1=s.charAt(end);
            if(map[c1] > 0){
                counter--;
            }
            map[c1]--;
            end++;
            while(counter == 0){
                if(minlength > end-start){
                    minlength=end - start;
                    minstart=start;
                }
                final char c2=s.charAt(start);
                map[c2]++;
                if(map[c2]>0){
                    counter++;
                }
                start++;

            }
        }
        return minlength == Integer.MAX_VALUE ? "" : s.substring(minstart,minstart+minlength);
    }
}
