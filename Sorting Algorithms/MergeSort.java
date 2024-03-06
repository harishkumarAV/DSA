public class Solution {

    public static void mergeSort(int[] arr, int low, int high){
        // Write your code here
        if(low < high){
            int mid = low + (high-low)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);

            merge(arr,low,mid,high);
        }
    }
    public static void merge(int arr[],int left,int mid,int right){

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int l1[] = new int[n1];
        int l2[] = new int[n2];

        for(int i=0;i<n1;i++){
            l1[i] = arr[left + i];
        }
        for(int j=0;j<n2;j++){
            l2[j] = arr[mid + 1 + j];
        }
        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(l1[i] <= l2[j]){
                arr[k] = l1[i];
                i++;
            }else{
                arr[k] = l2[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = l1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = l2[j];
            k++;
            j++;
        }
    }
}
