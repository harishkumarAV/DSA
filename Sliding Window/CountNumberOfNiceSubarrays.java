class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return find(nums , k) - find(nums , k-1);
    }
    public int find(int[] nums , int k){
        int ans = 0;
        for(int i=0,j=0;j<nums.length;j++){
            if(nums[j] % 2 == 1){
                k--;
            }
            while(k<0){
                if(nums[i]%2 == 1){
                    k++;
                }
                i++;
            }
            ans+= j - i + 1;
        }
        return ans;
    }
}
