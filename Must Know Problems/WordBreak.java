class Solution
{
    public static int wordBreak(int n, String s, ArrayList<String> dictionary )
    {
        //code here
        Set<String> set = new HashSet<>(dictionary);
        return find(0,s,set)?1:0;
    }
    public static boolean find(int i,String s,Set<String> set){
        if( i == s.length()){
            return true;
        }
        for(int j=i+1;j<=s.length();j++){
            String str = s.substring(i,j);
            if(set.contains(str) && find(j,s,set)){
                return true;
            }
        }
        return false;
    }
}
