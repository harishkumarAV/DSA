// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int num = 8;
        int k = 2;
        if((num & (1<< k)) != 0){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
}


Similarly,
For toggling the kth bit : x ^ (1<<k)
to set the kth bit : x | (1<<k)
to unset the kth bit : x & !(1<<k)
