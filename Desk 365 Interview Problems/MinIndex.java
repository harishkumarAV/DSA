// Given a string str1 and str2 . find the minimum index of the character in str1 that is also present in str2.
// example input : 
// str1 : beekeeper, str2 : set
// output : 1
public class Main {
    public static void main(String[] args) {
        String str1 = "beekeeper";
        String str2 = "set";
        System.out.println("Minimum index: " + findMinIndex(str1, str2));
    }
    public static int findMinIndex(String str1, String str2) {
        Set<Character> set2 = new HashSet<>();
        for (char c : str2.toCharArray()) {
            set2.add(c);
        }
        for (int i = 0; i < str1.length(); i++) {
            if (set2.contains(str1.charAt(i))) {
                return i; 
            }
        }
        return -1;
    }
}
