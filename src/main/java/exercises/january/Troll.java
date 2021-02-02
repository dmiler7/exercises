package exercises.january;

/**
 * @author Dorim
 * codewars:kata 5 (level 7)
 * @Date: 31.01.2021
 * <p>
 * Trolls are attacking your comment section!
 * <p>
 * A common way to deal with this situation is to remove
 * all of the vowels from the trolls' comments, neutralizing the threat.
 * <p>
 * Your task is to write a function that takes a string
 * and return a new string with all vowels removed.
 * <p>
 * For example, the string "This website is for losers LOL!"
 * would become "Ths wbst s fr lsrs LL!".
 * <p>
 * Note: for this kata y isn't considered a vowel.
 * <p>
 * original:
 * public class Troll {
 * public static String disemvowel(String str) {
 * // Code away...
 * }
 * }
 */

public class Troll {

    public static void main(String[] args) {
        String test = "No offense but,\\nYour writing is among the worst I've ever read";
        System.out.println(disemvowel3(test));
    }

    /**
     * disemvowel() returns String after vowels are removed.
     *
     * @param str The sequence of characters from which a,e,i,o,u vowels are to be removed.
     * @return str.replaceAll - String without named vowels.
     */
    public static String disemvowel1(String str) {
        return str.replaceAll("(?i)[a,e,i,o,u]", ""); //(?i) indicating case sensitivity
    }

    /**
     * for loop utilizing str.charAt(i)
     *
     * @param str
     * @return newStr
     */
    public static String disemvowel2(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a'
                    && str.charAt(i) != 'A'
                    && str.charAt(i) != 'e'
                    && str.charAt(i) != 'E'
                    && str.charAt(i) != 'i'
                    && str.charAt(i) != 'I'
                    && str.charAt(i) != 'o'
                    && str.charAt(i) != 'O'
                    && str.charAt(i) != 'u'
                    && str.charAt(i) != 'U') {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }


    /**
     * utilizing StringBuffer & switch statement
     * @param str
     * @return strb.toString()
     */
    public static String disemvowel3(String str) {
        StringBuffer strb = new StringBuffer();
        for (char character : str.toCharArray()) {
            switch (character) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    break;
                default:
                    strb.append(character);
            }
        }return strb.toString();
    }
}