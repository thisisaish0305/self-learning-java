package DSAQuestions.PriorityQueue;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

 class Solution2 {

    public static void findMedian(int input[])  {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int i=0;
        while( i < input.length){
            if(i==0){
                maxHeap.add(input[i]);
                System.out.print(input[i]+" ");
                i++;
                continue;
            }

            if(maxHeap.size() > 0 && input[i] < maxHeap.peek()) {
                //add in maxHeap
                maxHeap.add(input[i]);
            } else {
                //add in minHeap
                minHeap.add(input[i]);
            }

            if(Math.abs(minHeap.size() - maxHeap.size())>=2) {
                if(minHeap.size() > maxHeap.size()){
                    int element = minHeap.remove();
                    maxHeap.add(element);
                } else {
                    int element = maxHeap.remove();
                    minHeap.add(element);
                }
            }

            if((minHeap.size() + maxHeap.size()) % 2 ==0) {
                int median = (minHeap.peek() + maxHeap.peek() )/ 2;
                System.out.println(median+" ");
            } else {
                if(maxHeap.size() > minHeap.size()){
                    System.out.println(maxHeap.peek()+" ");
                } else {
                    System.out.println(minHeap.peek() + " ");
                }
            }

            i++;
        }

    }

}

public class RunningMedian {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
    }
}
