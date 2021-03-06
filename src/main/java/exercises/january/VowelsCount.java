package exercises.january;

/**
 * @author Dorim
 * codewars:kata 7
 * Return the number (count) of vowels in the given string.
 * <p>
 * We will consider a, e, i, o, u as vowels for this Kata (but not y).
 * <p>
 * The input string will only consist of lower case letters and/or spaces.
 * <p>
 * original:
 * <p>
 * public class Vowels {
 * public static int getCount(String str) {
 * int vowelsCount = 0;
 * // your code here
 * return vowelsCount;
 * }
 * }
 */

public class VowelsCount {

    public static void main(String[] args) {
        String test = "Homoge nizowany! ";
        System.out.println(VowelsCount.getCount(test));
    }

    public static int getCount(String str) {

        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
// check:
//        System.out.println(charArray);

        int vowelsCount = 0;
        for (char letter : charArray) {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

}
