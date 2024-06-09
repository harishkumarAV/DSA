// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int num = 5;
        if(num == 0){
            System.out.print("No");
        }
        if((num & (num - 1)) == 0){
            System.out.print("Power of 2");
        }else{
            System.out.print("No");
        }
    }
}
