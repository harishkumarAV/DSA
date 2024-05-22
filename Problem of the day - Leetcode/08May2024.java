class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int arr[] = new int[n];
        String ans[] = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = score[i];
        }
        Arrays.sort(arr);
        int j=0;
        int val[] = new int[n];
        for(int i=n-1;i>=0;i--){
            val[j] =  arr[i];
            j++;
        }
        for(int i=0;i<n;i++){
            int temp = score[i];
            int pos = find(val,temp);
            if(pos == 0){
                ans[i] = "Gold Medal";
            }
            else if(pos == 1){
                ans[i] = "Silver Medal";
            }
            else if(pos == 2){
                ans[i] = "Bronze Medal";
            }else{
                ans[i] = Integer.toString(pos+1);
            }
        }
        return ans;
    }
    public static int find(int arr[] , int temp){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == temp){
                return i;
            }
        }
        return 0;
    }
}
