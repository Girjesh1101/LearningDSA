package StringPractices;

import java.util.Stack;

public class ValidParentheses {


    public static boolean isValid(String s){

        Stack<Character> stack = new Stack<>();

        for(char c :s.toCharArray()){

            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()){

                    return false;
                }

                char top = stack.peek();
                if((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')){
                    
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        
        String input ="()[]{}";

        System.out.println("ValidParentheses : "+isValid(input));
    }
    
}
