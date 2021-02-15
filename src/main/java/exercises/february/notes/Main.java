package exercises.february.notes;

import java.util.Stack;

import static exercises.february.notes.StackEx.*;

public class Main {

    public static void main(String[] args) {
        Stack stk = createStack();
        System.out.println("Check if stk is empty: " + isStackEmpty(stk));
        System.out.println("Print Stack's elements: " + returnElements(stk));
        System.out.println("Check ifnow stk is empty: " + isStackEmpty(stk));
    }
}
