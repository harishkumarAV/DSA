public class Solution {
    public static void insertionSort(int[] arr, int size) {
        //Your code goes here
        for(int i=0;i<size;i++){
            int j = i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
