import java.util.*;
public class Solution {
    public static void selectionSort(int[] arr) {
        f(arr,arr.length);
    }
    public static void f(int a[] , int n){
        for(int i =0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(a[min] > a[j]){
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
}
