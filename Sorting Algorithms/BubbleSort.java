
public class Solution {
    public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}
