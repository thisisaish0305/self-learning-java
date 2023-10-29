package DSAQuestions.LinkedList;

public class RemoveDuplicates {

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
        public static Node<Integer> removeDuplicates(Node<Integer> head) {
            //Your code goes here

            if(head==null || head.next==null){
                return head;
            }

            Node<Integer> currHead = head;
            Node<Integer> tempHead = head;

            while(currHead!=null){

                tempHead = currHead;
                while(tempHead!=null && tempHead.next!=null &&
                        tempHead.data.equals(tempHead.next.data)){ //PAY ATTENTION TO WHY .equals is used!

                    tempHead = tempHead.next;
                }

                currHead.next = tempHead.next; //#check once
                currHead = currHead.next;

            }

            return head;
        }

}




