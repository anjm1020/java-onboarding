package onboarding;

import java.util.Stack;
import java.util.stream.Collectors;

public class Problem2 {
    public static String solution(String cryptogram) {
        Stack stack = generateResultStack(cryptogram);
        return makeAnswerFromStack(stack);
    }

    private static String makeAnswerFromStack(Stack stack) {
        String res = "";
        while (!stack.isEmpty()) {
            res = stack.pop() + res;
        }
        return res;
    }


    public static Stack<Character> generateResultStack(String target) {
        Stack<Character> stack = new Stack<>();

        for (char c : target.toCharArray()) {
            if(stack.empty()) stack.push(c);
            else {
                char top = stack.peek();
                if(top == c) stack.pop();
                else stack.push(c);
            }
        }
        return stack;
    }
}
