import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalanceTest {
    public static void main(String[] args) {
        String str="{}[]([])";
        System.out.println(isBalanced(str));
    }

    static boolean isBalanced(String str){

        final char openParenthesis='(';
        final char openCurlyBrace='{';
        final char openSquareBrace='[';
        final char closeParenthesis=')';
        final char closeCurlyBrace='}';
        final char closeSquareBrace=']';
        Map<Character,Character> map=new HashMap<>();
        map.put(openCurlyBrace,closeCurlyBrace);
        map.put(openParenthesis,closeParenthesis);
        map.put(openSquareBrace,closeSquareBrace);

        Stack<Character> stack=new Stack<>();
        for (int i=0; i<str.length();i++){

            switch (str.charAt(i)){
                case openParenthesis:
                case openCurlyBrace:
                case openSquareBrace: {
                    stack.push(str.charAt(i));
                    break;
                }
                case closeSquareBrace:
                case closeCurlyBrace:
                case closeParenthesis:{
                    if (!stack.isEmpty() && map.get(stack.peek()).equals(str.charAt(i))){
                        stack.pop();
                        break;
                    }
                    else return false;
                }
                default: break;
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
    }

}
