package DSAQuestions.PriorityQueue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargestElement {

    public static ArrayList<Integer> kLargest(int input[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0;
        ArrayList<Integer> result = new ArrayList<>();

        while(i < k){
            pq.add(input[i++]);
        }

        while(i < input.length){
            if(input[i] > pq.peek()){ // this checking is very important to do!
                pq.remove(); // at max k size pq is maintained
                pq.add(input[i]);
            }
            i++;
        }

        while(!pq.isEmpty()){
            result.add(pq.remove());
        }

        for(int a:result){
            System.out.println(a);
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {2,4,2,90,10, 3,20,16,0};
        kLargest(arr,3);
    }
}
