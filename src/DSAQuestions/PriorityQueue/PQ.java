package DSAQuestions.PriorityQueue;
import java.util.ArrayList;


// implementing out own pq using arraylist internally for performing heap operations.
public class PQ {

    private ArrayList<Integer> heap;

    public PQ() {
        heap = new ArrayList<Integer>();
    }

    boolean isEmpty() {
        return heap.size() == 0;
    }

    int size() {
        return heap.size();
    }

    int getMin() throws PriorityQueueException {
        if (isEmpty()) {
            // Throw an exception
            throw new PriorityQueueException();
        }
        return heap.get(0);
    }

    void insert(int element) {
        heap.add(element);
        int childIndex = heap.size() - 1;
        int parentIndex = (childIndex - 1) / 2;

        while (childIndex > 0) {
            if (heap.get(childIndex) < heap.get(parentIndex)) {
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            } else {
                return;
            }
        }
    }

    int removeMin() throws PriorityQueueException{
        if(heap.isEmpty()){
            throw new PriorityQueueException();
        }

        int minimum = heap.get(0);
        int lastElement = heap.get(heap.size()-1);
        heap.set(0, lastElement);
        heap.remove(heap.size()-1);
        //down-heapify

        int parentIndex = 0;
        int childIndex1 = 1, childIndex2 =2;
        int minIndex = -1;


        while(childIndex1 < heap.size() ) {

            if(heap.get(childIndex1) < heap.get(parentIndex) && heap.get(childIndex2) < heap.get(parentIndex)) {
                if(heap.get(childIndex1)<heap.get(childIndex2)){
                    minIndex = childIndex1;
                } else {
                    minIndex = childIndex2;
                }
            } else if (heap.get(childIndex2) < heap.get(parentIndex)){
                minIndex = childIndex2;
            } else {
                minIndex = childIndex1;
            }

            int temp = heap.get(parentIndex);
            heap.set(parentIndex, heap.get(minIndex));
            heap.set(minIndex,temp);

            parentIndex = minIndex;
            childIndex1 = 2* parentIndex ;
            childIndex2 = (2* parentIndex) +1;

        }
        return minimum;

    }
}

class PriorityQueueException extends Exception {

}
