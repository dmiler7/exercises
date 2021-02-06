package exercises.february;

/**
 * Write a function that takes a string of braces,
 * and determines if the order of the braces is valid.
 * It should return true if the string is valid,
 * and false if it's invalid.
 * <p>
 * This Kata is similar to the Valid Parentheses Kata, but
 * introduces new characters: brackets [], and curly braces {}.
 * Thanks to @arnedag for the idea!
 * <p>
 * All input strings will be nonempty, and will only
 * consist of parentheses, brackets and curly braces: ()[]{}.
 * <p>
 * What is considered Valid?
 * A string of braces is considered valid if all braces
 * are matched with the correct brace.
 * <p>
 * <p>
 * Examples:
 * "(){}[]"   =>  True
 * "([{}])"   =>  True
 * "(}"       =>  False
 * "[(])"     =>  False
 * "[({})](]" =>  False
 * <p>
 * original:
 * public class BraceChecker {
 * public boolean isValid(String braces) {
 * // Add code here
 * }
 * }
 */

public class BraceChecker {

    public static void main(String[] args) {
        String test = "(";
        BraceChecker braceChecker = new BraceChecker();
        System.out.println(braceChecker.isValid("{}{}"));
    }

    public boolean isValid2(String braces) {

        String a = "()";
        String b = "{}";
        String c = "[]";
        String aaOne = "({})";
        String aaTwo = "([])";
        String bbOne = "{()}";
        String bbTwo = "{[]}";
        String ccOne = "[()]";
        String ccTwo = "[{}]";
        String aaaOne = "({[]})";
        String aaaTwo = "([{}])";
        String bbbOne = "{([])}";
        String bbbTwo = "{[()]}";
        String cccOne = "[{()}]";
        String cccTwo = "[({})]";
        String regex = "[(){}[]]({})([]){()}{[]}[()][{}]]({[]})([{}]){([])}{[()]}[{()}][({})]";
//        Pattern pattern=Pattern.compile(a+)
        if (!braces.contains(regex)) {
            return false;
        } else
            return true;
    }

    public boolean isValid(String braces) {
        if (braces == null || braces.length() % 2 != 0) {
            return false;
        } else if
        (!(braces.charAt(0) == '(' ||
                        braces.charAt(0) == '{' ||
                        braces.charAt(0) == '[')) {
            return false;
        }

        while (braces.contains("()") ||
                braces.contains("{}") ||
                braces.contains("[]")) {
            braces = braces.replaceAll("\\(\\)", "")
                    .replaceAll("\\{\\}", "")
                    .replaceAll("\\[\\]", "");
        }
        return braces.length() == 0;
    }

    public boolean isValid3(String braces) {
        int lengthOfBraces = braces.length();
        for(int i = 0; i < lengthOfBraces; i++){
            braces = braces.replace("{}", "").replace("[]", "").replace("()", "");
        }
        return braces.isEmpty();
    }
}


