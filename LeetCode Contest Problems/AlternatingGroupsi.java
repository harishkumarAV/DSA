class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int sum=0;
        for(int i=1;i<colors.length-1;i++){
            if(colors[i-1]!=colors[i] && colors[i] != colors[i+1]){
                sum++;
            }
        }
        int n = colors.length;
        if(colors[n-2]!=colors[n-1] && colors[n-1] != colors[0]){
            sum++;
        }
        if(colors[n-1]!=colors[0] && colors[1] != colors[0]){
            sum++;
        }
        return sum;
    }
}
