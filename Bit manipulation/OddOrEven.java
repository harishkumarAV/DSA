// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int n = 9;
        int lsb = n&1;
        if(lsb == 1){
            System.out.print("ODD");
        }else{
            System.out.print("EVEN");
        }
    }
}
