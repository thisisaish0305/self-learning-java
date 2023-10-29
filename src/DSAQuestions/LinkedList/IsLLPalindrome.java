package DSAQuestions.LinkedList;

public class IsLLPalindrome {

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

    private static Node<Integer> reverse(Node head){
        Node<Integer> curr=head;
        Node<Integer> prev = null, next=null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev =curr;
            curr = next;
        }

        return prev;
    }

    private static Node<Integer> findMid(Node head){
        Node<Integer> slow = head, fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }


    private static int getLength(Node<Integer>head){
        if(head==null){
            return 0;
        }

        int i=0;
        while(head!=null){
            i++;
            head=head.next;
        }

        return i;
    }

    public static boolean isPalindromeWithSpaceN(Node<Integer> root) {
        //Your code goes here
        int  l = getLength(root);
        if(l==0){
            return true;
        }

        int arr[] = new int[l];
        int i=0;

        while(root!=null){
            arr[i] = root.data;
            i++;
            root=root.next;
        }

        int s=0, e= l-1;
        while(s<e){
            if(arr[s]!=arr[e]){
                return false;
            }
            s++; e--;
        }

        return true;

    }

    public static boolean isPalindrome(Node<Integer> root) {

        if(root==null || root.next==null){
            return true;
        }

        Node<Integer> mid = findMid(root);
        Node<Integer> secondHead = mid.next;
        mid.next = null;

        Node<Integer> firstHead = root;

        secondHead = reverse(secondHead);

        while(secondHead!=null && firstHead!=null){
            if(firstHead.data != secondHead.data){
                return false;
            }
            secondHead = secondHead.next;
            firstHead = firstHead.next;
        }

        return true;
    }

}