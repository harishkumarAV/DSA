import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0){
		    int size= sc.nextInt();
		    Integer a[] = new Integer[size];
		    for(int i=0;i<size;i++){
		        a[i] = sc.nextInt();
		    }
		    Arrays.sort(a);
		    List<Integer> l = Arrays.asList(a);
		    find(l,a);
		    n--;
		}
	}
		public static void find(List<Integer>l , Integer a[]){
		    int n = a.length;
		    HashMap<Integer,Integer> count = new HashMap<>();
		    HashMap<Integer,Integer> index = new HashMap<>();
		    
		    for(int i=0;i<n;i++){
		        if(count.containsKey(a[i])){
		            count.put(a[i] , count.get(a[i]) +1);
		        }else{
		            count.put(a[i] , 1);
		            index.put(a[i] , i);
		        }
		    }
		    Collections.sort(l, new Comparator<Integer>(){
		        public int compare(Integer n1,Integer n2){
		            int fre1 = count.get(n1);
		            int fre2 = count.get(n2);
		            if(fre1 != fre2){
		                return fre2-fre1;
		            }
		            else{
		                return index.get(n1) - index.get(n2);
		            }
		        }
		    });
		    for(int i : l){
		        System.out.print(i + " ");
		    }
		    System.out.println();
		}
}
