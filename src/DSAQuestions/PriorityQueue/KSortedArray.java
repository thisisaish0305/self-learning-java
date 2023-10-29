package DSAQuestions.PriorityQueue;

import java.util.PriorityQueue;

public class KSortedArray {

private static void kSortedArray(int[] arr, int k){

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int i=0;
    for(; i < k; i++) {
        pq.add(arr[i]);
    }
    int startIndex = 0;
    while(i < arr.length) {
        arr[startIndex] = pq.remove();
        startIndex++;
        pq.add(arr[i]);
        i++;
    }

    while (!pq.isEmpty()) {
        arr[startIndex] = pq.remove();
        startIndex++;
    }
}

    public static void main(String[] args) {

        int arr[] = {2,4,1,9,6,8};
        kSortedArray(arr,3);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
