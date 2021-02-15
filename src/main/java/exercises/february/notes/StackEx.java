package exercises.february.notes;

import java.util.Stack;

public class StackEx {

    public static Stack createStack() {
        Stack stk = new Stack();
        return stk;
    }

    public static boolean isStackEmpty(Stack stk) {
        return stk.isEmpty();
    }

    public static Stack returnElements(Stack stk) {
        return stk;
    }

    public static void pushElement(Stack stk, int x) {
        stk.push(x);
        System.out.println("push -> " + x);
    }

    public static void popElement(Stack stk) {
        System.out.print("pop -> ");
        int x = (Integer) stk.pop();
        System.out.println(x);
    }
}
