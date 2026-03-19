// question 1------ examming whether a pair and the orders of given an expression { ,},{,},{,} are correct in a return 0 if parantises sequensis in java
// import java.util.*;

// public class main {
//     public static int isValid(String str) {
//         Stack<Character> stack = new Stack<>();

//         for (char ch : str.toCharArray()) {
  
//             if (ch == '(' || ch == '{' || ch == '[') {
//                 stack.push(ch);
//             }
            
//             else {
//                 if (stack.isEmpty()) return 0;

//                 char top = stack.pop();

//                 if ((ch == ')' && top != '(') ||
//                     (ch == '}' && top != '{') ||
//                     (ch == ']' && top != '[')) {
//                     return 0;
//                 }
//             }
//         }
//         return stack.isEmpty() ? 1 : 0;
//     }

//     public static void main(String[] args) {
//         String s = "{[()]}";
//         System.out.println(isValid(s)); // 1 (correct)
//     }
// }



// question 2------ given streen a denoting a an expression it contanes the folloowing conataines +,-,*,/, check whether a as returnded braces or not note he will always valid express and will not contant any white spaces stack ki help se code karna hai in java

import java.util.*;

public class main {

    public static int hasRedundantBraces(String A) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);

            // closing bracket mila
            if (ch == ')') {
                char top = stack.peek();
                boolean isRedundant = true;

                // jab tak '(' na mile
                while (top != '(') {
                    // agar operator mila → not redundant
                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        isRedundant = false;
                    }
                    stack.pop();
                    top = stack.peek();
                }

                // '(' remove karo
                stack.pop();

                // agar operator nahi mila → redundant
                if (isRedundant) return 1;
            } else {
                stack.push(ch);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String s1 = "(a+b)";
        String s2 = "((a+b))";
        String s3 = "(a+(b)/c)";

        System.out.println(hasRedundantBraces(s1)); // 0
        System.out.println(hasRedundantBraces(s2)); // 1
        System.out.println(hasRedundantBraces(s3)); // 1
    }
}