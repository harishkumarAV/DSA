class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++){
            count +=find(nums[i]);
        }
        return count;
    }
    public static int find(int val){
        boolean flag = true;
        int add=val;
        int sub= val;
        int count = 0;
        while(flag == true){
            if(add%3 == 0 || sub%3==0){
                flag = false;
            }else{
                add++;
                sub--;
                count++;
            }
        }
        return count;
    }
}
