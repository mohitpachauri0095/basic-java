import java.util.*;

public class main {
    public static int isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
  
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            
            else {
                if (stack.isEmpty()) return 0;

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return 0;
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isValid(s)); // 1 (correct)
    }
}