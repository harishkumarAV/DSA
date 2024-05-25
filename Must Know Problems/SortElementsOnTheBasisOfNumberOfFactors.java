// You are using Java
import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {5, 11, 10, 20, 9, 16, 23};
        List<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            int temp = arr[i];
            int count = count_factor(temp);
            hm.put(arr[i] , count);
        }
        for(int i:arr){
            l.add(i);
        }
        Collections.sort(l,new Comparator<Integer>(){
           public  int compare(Integer s1,Integer s2){
               return hm.get(s2) - hm.get(s1);
           } 
        });
        for(int i:l){
            System.out.print(i + " ");
        }
    }
    public static int count_factor(int val){
        int count=0;
        for(int i=1;i<val;i++){
            if(val % i ==0){
                count++;
            }
        }
        return count;
    }
}
