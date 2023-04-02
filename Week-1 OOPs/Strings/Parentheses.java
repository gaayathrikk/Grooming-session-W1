package Strings;

import java.util.Stack;

public class Parentheses {

    public static boolean isValid(String s) {
        Stack<Character> open = new Stack<>();
        
        for (char c : s.toCharArray()) {
            
            if (c == '(' || c == '{' || c == '[') {
                open.push(c);
            }
            
            else if (c == ')' && !open.isEmpty() && open.peek() == '(') {
                open.pop();
            } else if (c == '}' && !open.isEmpty() && open.peek() == '{') {
                open.pop();
            } else if (c == ']' && !open.isEmpty() && open.peek() == '[') {
                open.pop();
            }
            
            else {
                return false;
            }
        }
        return open.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(){}";
        System.out.println(isValid(s));
    }
}
