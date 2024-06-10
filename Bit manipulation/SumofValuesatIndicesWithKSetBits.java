class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int n = nums.size();
        int sum = 0;
        for(int i=0;i<n ; i++){
            if(findset(i) == k){
                sum += nums.get(i);
            }
        }
        return sum;
    }
    public static int findset(int n){
        int count = 0;
        while(n>0){
            count += n&1;
            n>>=1;
        }
        return count;
    }
}
