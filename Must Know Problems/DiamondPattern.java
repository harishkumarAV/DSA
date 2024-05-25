// You are using Java
import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j=n;
        int k=n;
        int val=1;
        for(int i=0;i<n;i++){
            for(int temp=0;temp<j;temp++){
                System.out.print(" ");
            }
            for(int p=0;p<=i;p++){
                System.out.print("* ");
            }
            j--;
            System.out.println();
        }
        int rev = n;
        for(int i=0;i<n;i++){
            for(int temp=0;temp<i;temp++){
                System.out.print(" ");
            }
            for(int p=0;p<rev;p++){
                System.out.print(" *");
            }
            rev--;
            System.out.println();
        }
        
    }
}
