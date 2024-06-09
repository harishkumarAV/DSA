class Solution {
    private static final int mod = 1000000007;

    public int valueAfterKSeconds(int n, int k) {
        int a[] = new int[n];
        Arrays.fill(a,1);
        while(k>0){
            sum(a);
            k--;
        }
        return a[n-1];
    }
    public void sum(int a[]){
        for(int i=1;i<a.length;i++){
            a[i] = (a[i] + a[i-1])%mod;
        }
    }
}
