package exercises.january.ex1;

import java.util.Arrays;

/**
 * @author Dorim
 * codewars:kata 8
 * Given an array of integers, find the one that appears an odd number of times.
 * <p>
 * There will always be only one integer that appears an odd number of times.
 * @Date: 18.01.2021 - 20.01.2021
 * <p>
 * original: public class FindOdd {
 * public static int findIt(int[] a){
 * return odd
 * }
 * }
 */

public class FindOdd {

    //    public static int findIt(int[] a) {
    public static void main(String[] args) {

        int[] testTable = {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};

        System.out.println(FindOdd.findIt(testTable));
    }

//    // * chosen solution
    public static int findIt(int[] a) {
        Arrays.sort(a);
        int i;
        int loopCounter = 1;

        for (i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                loopCounter++;
            } else if (loopCounter % 2 != 0) {
                return a[i];
            } else {
                loopCounter = 1;
            }
        }
        int odd = a[i];
        return odd;
    }
}

////// 1st cleanest solution:
////
////        int length = tab.length;
////
////        for (int i = 0, j = 1; i < length; i++) {
////            if (tab[i] == tab[j] && j < length) {
////                i++;
////                j = j + 2;
////            } else {
////                System.out.println(tab[i]);
////            }
////        }
////    }
////}

////// 2nd original solution
////
////    public static int findIt(int[] a) {
////
////        Arrays.sort(a);
////
////        int loopCounter = 1;
////        for (int i = 0; i < a.length - 1; i++) {
////            if (a[i] == a[i + 1]) {
////                loopCounter++;
////            } else if (loopCounter % 2 == 0) {
////                loopCounter = 1;
////            } else {
////                System.out.println(a[i]);
////            }
////        }
////    }
////}

////        // 3rd solution basing on 2nd solution as inspiration
////        int counter = 1;
////        for (int i = 0; i < tab.length; i++) {
////            if (tab[i] == tab[i + 1]) {
////                counter++;
////            } else if (counter % 2 != 0) {
////                System.out.println(tab[i]);
////                break;
////            } else {
////                counter = 1;
////
////            }
////        }
////    }
////}

//////  trials:
////        for (int i = 0; i < tab.length; i++) {
////            int count = 1;
////            for (int k = i + 1; k < tab.length; k++) {
////                if (tab[i] == tab[k]) {
////                    count++;
////                    System.out.println(count);
//////                    System.out.println(tab[i] + " is the same with " + tab[k]);
//////                    System.out.println("Count= " + count);
////                }
////            }
////            System.out.println(tab[i]);
////            System.out.println(count);
//////            if (count % 2 == 1) {
//////                System.out.println("the searched number:" + tab[i]);
//////                System.out.println(count);
//////            }
//

////    4th solution: XOR exclusive or utilization; xor cancels out everytime xor is used with the same numbers, fex 1^1=0, 1^1^1=1
//    // thus every pair of the same numbers would be canceled leaving out the odd number
//    public static int findIt(int[] a) {
//        int odd = 0;
//        for (int element : a) {
//            odd = odd ^ element;
//        }
//        return odd;
//    }
//}