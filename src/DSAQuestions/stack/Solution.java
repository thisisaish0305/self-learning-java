package DSAQuestions.stack;


import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static int countBracketReversals(String input) {
        //Your code goes here

        // odd length ,can't be balanced
        if(input.length()%2!=0) {
            return -1;
        }

        int i=0; int cnt =0;
        Stack<Character> stack = new Stack<>();

        while(i < input.length()){
            char ch = input.charAt(i);

            if(ch=='{'){
                stack.push(ch);
            }
            else if(ch=='}'){
                if(stack.isEmpty()){
                    stack.push(ch);
                }
                else{
                    if(stack.peek()=='{'){
                        stack.pop();
                    } else if(stack.peek()!='{'){
                        stack.push('}');
                    }
                }
            }
            i++;
        }

        while(!stack.isEmpty()){
            char c1=stack.pop();
            char c2=' ';
            if(stack.size()>0){
                c2 = stack.pop();
            }

            if(c1==c2){
                cnt++;
            } else {
                cnt+=2;
            }
        }
        return cnt;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        System.out.println(countBracketReversals(str));
    }

}