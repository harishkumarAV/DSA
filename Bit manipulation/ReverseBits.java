public class Solution {
    public int reverseBits(int n) {
        int result=0;
        for(int i=0 ;i<32;i++){
            int bit = n & 1;
            result = (result << 1) | bit;
            n = n >> 1;
        }
        return result;
    }
}



