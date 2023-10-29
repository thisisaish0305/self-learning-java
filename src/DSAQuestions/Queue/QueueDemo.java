package DSAQuestions.Queue;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.size());
        System.out.println(q.poll());
        System.out.println("Front of queue is now "+q.peek());



    }
}
