package DSAQuestions.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class BuyTicket {
    public static void main(String[] args) {
//        int [] input = {2 ,3 ,2 ,2 ,4};
        int [] input = {3,9,4};
        int k=2;
        System.out.println(Solution.buyTicket(input,k));
    }
}

class Pair {
    int value;
    int index;

    public Pair(int value, int index) {
        this.value = value;
        this.index = index;
    }
}

class ValueComparator implements Comparator<Pair>{
    @Override
    public int compare(Pair o1, Pair o2) {
        return o2.value - o1.value; // max pq
    }
}
class Solution {

    public static int buyTicket(int input[], int k) {
        ValueComparator valueComparator = new ValueComparator();
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(valueComparator);
        int i=0;
        while( i < input.length){
            pq.add(new Pair(input[i],i)); i++;
        }
        int index = -1; int ans =0;

        while(index!=k){
            Pair top = pq.remove();
            System.out.println("val:"+top.value + " indx:" + top.index);
            ans +=1;
            if(top.index==k){
                break;
            }
        }
        return ans;
    }
}