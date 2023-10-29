package DSAQuestions.stack;

import java.util.*;
public class StockSpan {

    public static int[] stockSpan(int[] price) {
        //Your code goes here
        int[] ans = new int[price.length];
        ans[0]=1;
        Stack<Integer> stk = new Stack<>();
        stk.push(0);

        for(int i=1; i< price.length; i++) {
            int currElement = price[i];

            while(!stk.isEmpty() && currElement > price[stk.peek()]){
                stk.pop(); // the elemnt at the index of the stk is in it's span, popping it.
            }

            if(stk.isEmpty()){
                ans[i] = i+1;
            } else {
                ans[i] = i - stk.peek();
            }

            stk.push(i);

        }
        return ans;
    }

}