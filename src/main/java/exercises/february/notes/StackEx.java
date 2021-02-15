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
        stk.push(78);
        stk.push(1);
        stk.push(4);
        return stk;
    }
}
