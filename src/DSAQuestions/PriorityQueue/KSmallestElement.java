package DSAQuestions.PriorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KSmallestElement {
    public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
        // Write your code here
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> result = new ArrayList<>();
        int i=0;
        while (i<k){
            maxPQ.add(input[i++]);
        }

        while(i < input.length){
            if(input[i] < maxPQ.peek()){
                maxPQ.remove();
                maxPQ.add(input[i]);
            }
            i++;
        }

        while(!maxPQ.isEmpty()){
            result.add(maxPQ.remove());
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {2 ,12 ,9 ,16 ,10, 5, 3 ,20 ,25 ,11 ,1 ,8, 6 };
        ArrayList<Integer> res  = kSmallest(arr.length,arr,4);
        for(int a: res){
            System.out.println(a);
        }
    }
}
