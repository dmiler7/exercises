package exercises.february.notes;

import java.util.Stack;

import static exercises.february.notes.StackEx.createStack;

public class Main {

    public static void main(String[]args){
        Stack stk=createStack();
        System.out.println("Check if stk is empty: "+stk.isEmpty());
    }
}
