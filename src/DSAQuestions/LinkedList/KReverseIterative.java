package DSAQuestions.LinkedList;

public class KReverseIterative {
}

/*

    Following is the Node class already written for the Linked List

    class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

*/


class Solution {

    static class Pair{
        public Node first;
        public Node second;
        Pair(){
        }
    }
    private static Pair reverse(Node<Integer> head){
        Pair headTail = new Pair();
        Node<Integer> prev=null,curr,next=null;
        curr = head;
        Node<Integer> tail = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev=curr;
            if(tail ==null){
                tail = prev;
            }
            curr = next;
        }
        headTail.first = prev; //first has head
        headTail.second = tail; // pair second has tail.
        return headTail;
    }

    public static Node<Integer> kReverse(Node<Integer> head, int k) {
        //Your code goes here
        Node<Integer> newHead= null;
        Node<Integer> newTail = newHead;

        Node<Integer> innerHead, innerTail =null;
        int i=1;
        Node<Integer>curr = head;

        while(curr!=null) {
            innerHead =curr;
            innerTail=curr;
            i=1;

            while(curr.next!=null && i<k) {
                curr = curr.next;
                innerTail =curr;
                i++;
            }
            if(curr!=null)
                curr = curr.next;
            innerTail.next =null;
            Pair headTail = reverse(innerHead);
            Node<Integer> h = headTail.first;
            Node<Integer> t = headTail.second;

            //setting new Head
            if(newHead==null){
                newHead = h;
                newTail = h;
            }
            else{
                newTail.next = h;
                newTail = t;
            }
        }
        return newHead;
    }

    public static void main(String[] args) {
        reverse(null);
        Pair p = new Pair();
    }

}
