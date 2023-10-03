package DSAQuestions.LinkedList;

public class NodeUse {

    private static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head.data = head.data +1;
            head=head.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(10);
//        System.out.println(node1);
//        System.out.println(node1.data);
//        System.out.println(node1.next);

        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);
        Node<Integer> node4 = new Node<>(40);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;

        print(node1);
        System.out.println();
        print(node1);

    }
}
