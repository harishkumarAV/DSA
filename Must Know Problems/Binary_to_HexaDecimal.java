public class BinaryToHexadecimal {
    public static void main(String[] args) {
        String binaryNumber = "1101011011"; 

        int decimalNumber = Integer.parseInt(binaryNumber, 2);

        String hexadecimalNumber = Integer.toHexString(decimalNumber);

        System.out.println("Binary number: " + binaryNumber);
        System.out.println("Hexadecimal number: " + hexadecimalNumber);
    }
}




import java.math.BigInteger;

public class BinaryToHexadecimal {
    public static void main(String[] args) {
        String binaryNumber = "110101101100110111101111";  

        BigInteger decimalNumber = new BigInteger(binaryNumber, 2);

        String hexadecimalNumber = decimalNumber.toString(16);

        System.out.println("Binary number: " + binaryNumber);
        System.out.println("Hexadecimal number: " + hexadecimalNumber);
    }
}
