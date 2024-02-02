class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> l =new ArrayList<>();
        for(int i=1;i<=9;i++){
            int num = i;
            int dig = i + 1;
            while(num <= high && dig <= 9){
                num = num*10 + dig;
                if(low <= num && num <= high){
                    l.add(num);
                }
                ++dig;
            }
        }        
        Collections.sort(l);
        return l;
    }
}
