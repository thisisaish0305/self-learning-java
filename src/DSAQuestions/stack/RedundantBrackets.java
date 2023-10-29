package DSAQuestions.stack;

import java.util.Scanner;
import java.util.Stack;

public class RedundantBrackets {
    // ((a+b))
    // (a+b)
    public static boolean checkRedundantBrackets(String expression) {
        //Your code goes here
        int n = expression.length();int i=0;
        Stack<Character> stack = new Stack<>();
        Boolean ans = true;

        while(i<n){
            char ch = expression.charAt(i);
            if(ch!=')'){
                stack.push(ch);
                i++;
            }
            else if(ch==')'){
                ans = true;
                while(!stack.isEmpty() && stack.peek()!='('){
                   char poppedChar= stack.pop();
                   if(poppedChar=='+' || poppedChar=='-' || poppedChar=='*' || poppedChar=='/'){
                       ans = false;
                   }
                }
                stack.pop();i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.next();
        System.out.println(checkRedundantBrackets(exp));
    }
}
