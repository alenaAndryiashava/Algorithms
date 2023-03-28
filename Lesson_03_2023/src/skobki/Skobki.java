package skobki;

import java.util.Stack;

public class Skobki {
    /**
     * ()(()())
     * )()(
     */

    private static boolean pars(String s) {
        int check = 0;
        for (int i = 0; i < s.length(); i++) {
            if (check < 0) {
                return false;
            }
            String oneSymbol = s.substring(i, i + 1);
            if ("(".equals(oneSymbol)) {
                check++;
            } else {
                check--;
            }
        }
        return check == 0;
    }

    // 1. Implement the previous task «check parentheses» based on the fact
//    that brackets can be of different types: () [] {}

    public static boolean isParenthesesCorrect(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case '(', '{', '[' -> stack.push(ch);
                case ')' -> {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        return false;
                    }
                    stack.pop();
                }
                case '}' -> {
                    if (stack.isEmpty() || stack.peek() != '{') {
                        return false;
                    }
                    stack.pop();
                }
                case ']' -> {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        return false;
                    }
                    stack.pop();
                }
            }

        }
        return stack.isEmpty();


    }

    //    1a. Implement the previous task «check parentheses» based on the fact
    //    that brackets can be of different types: () [] {}
    public static boolean checkParentheses(String str,char[] openBrackets, char[] closeBrackets){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int bracketIndex= getIndexOfBracket(ch,openBrackets);
            if(bracketIndex!=-1){
                sb.append(closeBrackets[bracketIndex]);
                continue;
            }
            bracketIndex= getIndexOfBracket(ch,closeBrackets);
            if(bracketIndex!=-1){
                if (sb.length()==0 || sb.charAt(sb.length()-1)!= closeBrackets[bracketIndex]){
                    return false;
                } else {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }

        return sb.length()==0;
    }
    public static int getIndexOfBracket(char ch, char[] brackets){
        for (int i = 0; i < brackets.length ; i++) {
            if (ch==brackets[i]) return i;
        }
        return -1;
    }



    public static void main(String[] args) {

        System.out.println(pars(")("));

        System.out.println("**************Task 1");
        System.out.println(isParenthesesCorrect("[{9*(8+3)}-((9+1)5)]"));//true
        System.out.println(isParenthesesCorrect("[9(8+3)- ({9+1})5)"));//false
        System.out.println(isParenthesesCorrect("(98+3)}-( (9+1)*5"));//false
        System.out.println(isParenthesesCorrect("(98+3)]-[(9+1)*5("));//false

        System.out.println("***************Task 1a");
        String str = "[1(2)3]";//"{ ([(98+3)-) }]( (9+1)*5)";
        char[] openBrackets = {'(', '[', '{'};
        char[] closeBrackets = {')', ']', '}'};
        System.out.println(checkParentheses(str,openBrackets,closeBrackets));
    }
}
