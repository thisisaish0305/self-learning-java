package DSAQuestions.Queue;

import java.util.LinkedList;
import java.util.Queue;

class Solution {

    // recursion is coming to my mind
    public static void reverseQueue(Queue<Integer> queue) {
        //Your code goes here
        if(queue.size()==1){
            return;
        }

        int front = queue.peek();
        queue.remove();
        reverseQueue(queue);
        queue.add(front);
    }

}


public class ReverseQueue {
    public static void main(String[] args) {
        Solution.reverseQueue(new LinkedList<>());
    }
}
