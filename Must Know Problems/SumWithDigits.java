// You are using Java
import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 2875;
        int digit = 4;
        String num = Integer.toString(n);
        StringBuilder result = new StringBuilder();
        for(char ch : num.toCharArray()){
            int curr = Character.getNumericValue(ch);
            int newdigit = curr+digit;
            result.append(newdigit);
        }
        System.out.print(result.toString());
    }
}
