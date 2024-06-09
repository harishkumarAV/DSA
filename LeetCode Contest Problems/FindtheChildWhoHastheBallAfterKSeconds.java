class Solution {
    public int numberOfChild(int n, int k) {
        boolean flag = true;
        int ans = 0;
        while(k > 0){
            if(flag == true){
                ans++;
                if(ans == n-1){
                    flag = false;
                }
            }else{
                ans--;
                if(ans == 0){
                    flag = true;
                }
            }
            k--;
        }
        return ans;
    }
}
