package exercises.february.notes;

import java.util.Stack;

import static exercises.february.notes.StackEx.*;

public class Main {

    public static void main(String[] args) {
        Stack stk = createStack();
        System.out.println("Check if stk is empty: " + isStackEmpty(stk));

        pushElement(stk, 5);
        pushElement(stk, 89);
        pushElement(stk, 14);
        pushElement(stk, 1);

        System.out.println("Print Stack's elements: " + returnElements(stk));
        System.out.println("Check if now stk is empty: " + isStackEmpty(stk));

        popElement(stk);
        popElement(stk);

        System.out.println("Print Stack's elements: " + returnElements(stk));
    }
}