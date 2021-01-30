package exercises.january;

/**
 * @author Dorim
 * codewars:kata 6
 * @Date: 29.01.2021
 * Write a function that accepts an array of 10
 * integers (between 0 and 9), that returns a
 * string of those numbers in the form of a
 * phone number.
 * <p>
 * Example:
 * Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0})
 * // => returns "(123) 456-7890"
 * The returned format must be correct in order to complete this challenge.
 * Don't forget the space after the closing parentheses!
 * <p>
 * original:
 * <p>
 * public class Kata {
 * public static String createPhoneNumber(int[] numbers) {
 * // Your code here!
 * }
 * }
 */

public class CreatePhoneNumber {

    public static void main(String[] args) {

        int[] test = {0, 5, 8, 3, 2, 0, 6, 5, 6, 7};
        System.out.println(CreatePhoneNumber.createPhoneNumber1(test));
    }

//   1st attempt:
//    public static String createPhoneNumber1(int[] numbers) {
//        // Your code here!
//        String stringPhone1="";
//        for(int i=0; i<3;i++){
//            for (int element:numbers){
//                stringPhone1+=Integer.toString(i);
//            }
//        }return stringPhone1;
//
//        String stringPhone2="";
//        for(int i=0; i<3;i++){
//            for (int element:numbers){
//                stringPhone2+=Integer.toString(i);
//            }
//        }
//        return stringPhone2;
//
//        String stringPhone3="";
//        for(int i=0; i<4;i++){
//            for (int element:numbers){
//                stringPhone3+=Integer.toString(i);
//            }
//        }return stringPhone3;
//    }

    // 2nd successful attempt:
    public static String createPhoneNumber1(int[] numbers) {
        String[] strArray = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strArray[i] = String.valueOf(numbers[i]);
        }
        String str1 = "(" + String.join("", strArray[0], strArray[1], strArray[2]) + ") ";
        String str2 = String.join("", strArray[3], strArray[4], strArray[5]);
        String str3 = "-" + String.join("", strArray[6], strArray[7], strArray[8]) + " ";
        return str1 + str2 + str3;
    }
}