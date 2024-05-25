class Solution {
    public String reverse(String str) {
        char[] reversedAlphaNumeric = new char[str.length()];
        int alphaIndex = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isLetterOrDigit(str.charAt(i))) {
                reversedAlphaNumeric[alphaIndex++] = str.charAt(i);
            }
        }
        char[] result = new char[str.length()];
        alphaIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isLetterOrDigit(currentChar)) {
                result[i] = reversedAlphaNumeric[alphaIndex++];
            } else {
                result[i] = currentChar;
            }
        }
        return new String(result);
    }
}
