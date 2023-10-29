package DSAQuestions.Queue;
/******************
 * Following is the main function we are using internally.
 * Refer this for completing the Dequeue class
 *

 public static void main(String[] args) {
 Scanner s = new Scanner(System.in);

 Dequeue dq = new Dequeue(10);

 while(true){
 int choice = s.nextInt(),input;
 switch (choice) {
 case 1:
 input = s.nextInt();
 dq.insertFront(input);
 break;
 case 2:
 input = s.nextInt();
 dq.insertRear(input);
 break;
 case 3:
 dq.deleteFront();
 break;
 case 4:
 dq.deleteRear();
 break;
 case 5:
 System.out.println(dq.getFront());
 break;
 case 6:
 System.out.println(dq.getRear());
 break;
 default:
 return ;
 }
 }
 }
 ******************/
import java.util.*;
public class Dequeue {
    // Complete this class
    Deque<Integer> dq;

    Dequeue(){
        dq = new ArrayDeque<Integer>(10);
    }


    void insertFront(int data){
        if(dq.size()==10){
            System.out.println("-1");
            return;
        } else {
            dq.addFirst(data);
        }
    }

    void insertRear(int data){
        if(dq.size()==10){
            System.out.println("-1");
            return;
        } else {
            dq.addLast(data);
        }
    }

    void deleteFront() {
        if(dq.isEmpty()){
            System.out.println("-1");
            return;
        }
        dq.removeFirst();
    }


    void deleteRear(){
        if(dq.isEmpty()){
            System.out.println("1");
            return;
        }
        dq.removeLast();
    }

    int getFront(){
        if(dq.isEmpty()){
            return -1;
        }
        return dq.getFirst();
    }

    int getRear(){
        if(dq.isEmpty()){
            return -1;
        }
        return dq.getLast();
    }
}