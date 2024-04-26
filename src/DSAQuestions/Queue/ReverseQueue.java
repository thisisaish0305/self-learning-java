package DSAQuestions.Queue;

import java.util.*;

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

        List<Integer> l= new ArrayList<Integer>();
        l.add(10); l.add(20);l.add(30);
//        l.remove(l.size()-1);
        l.remove(l.get(l.size()-1));
        for(int a:l)
            System.out.println(a);
        int[][] dp = new int[5][6];
        for(int[] row: dp) {
            Arrays.fill(row, -1);
        }

        //Solution.reverseQueue(new LinkedList<>());
    }
}
