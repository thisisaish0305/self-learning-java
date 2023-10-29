package DSAQuestions.stack;

import java.util.Stack;

public class IsBalanced {

    public static boolean isBalanced(String expression) {
        //Your code goes here

        Stack<Character> stack = new Stack<>();
        int n = expression.length();

        int i=0;
        while(i<expression.length()){

            if(expression.charAt(i)=='('){
                stack.push('(');
                i++;
            }
            else if(expression.charAt(i)==')'){
                if(stack.isEmpty()){
                    break;
                }
                while(i<n &&  expression.charAt(i)==')' &&  !stack.isEmpty() && stack.peek()=='(' ){
                    stack.pop();
                    i++;
                }
            }
        }
        if(i==n && stack.isEmpty()){
            return true;
        } else
            return false;
    }


    public static void main(String[] args) {
        System.out.println(isBalanced("(("));
    }
}
