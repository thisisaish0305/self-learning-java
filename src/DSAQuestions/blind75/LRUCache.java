package DSAQuestions.blind75;

import java.util.HashMap;

class Node{
    int key;
    int value;
    Node next;
    Node prev;

    public Node(int key,int value, Node prev, Node next){
        this.key= key;
        this.value = value;
        this.prev = prev;
        this.next = next;
    }

    public Node(){
        this.prev = null;
        this.next = null;
        this.value = Integer.MAX_VALUE;
        this.key = Integer.MAX_VALUE;
    }
}

public class LRUCache {
    HashMap<Integer, Node> map;
    int capacity =0;
    Node head, tail = null;

    public LRUCache(int capacity) {
        this.map = new HashMap<Integer, Node>(capacity);
        this.capacity = capacity;
        this.head = new Node();
        this.tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        System.out.println("In get");
        int val =-1;
        Node currNode;
        if(map.containsKey(key)){
            currNode = map.get(key);
        }else {
            return -1;
        }

        val = currNode.value;
        Node previous = currNode.prev;
        Node nextNode = currNode.next;
        previous.next = nextNode;
        nextNode.prev = previous;

        currNode.prev= head;
        currNode.next = head.next;
        head.next.prev = currNode;
        head.next = currNode;

        return val;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            //update map and doubly LL
            System.out.println("In update");
            Node currNode = map.get(key);
            currNode.value = value;

            Node previous = currNode.prev;
            Node nextNode = currNode.next;
            previous.next = nextNode;
            nextNode.prev = previous;

            //put currNode in front i.e.next of head
            nextNode = head.next;
            head.next = currNode;
            currNode.prev= head;
            currNode.next = nextNode;
            nextNode.prev = currNode;

        } else {
            // check capacity
            if(map.size()==capacity){
                //evict from tail
                System.out.println("In eviction and then will insert.");
                Node oldestNode = tail.prev;
                map.remove(oldestNode.key);

                //remove from doubly ll
                Node previous = oldestNode.prev;
                previous.next = tail;
                tail.prev = previous;

                //insert in map
                Node newNode = new Node(key,value,head,head.next);
                head.next.prev = newNode;
                head.next= newNode;
                map.put(key, newNode);

            } else if(map.size() < capacity) {
                //put in map and front of doubly ll.
                System.out.println("In put");
                Node newNode = new Node(key,value,head,head.next);
                head.next.prev = newNode;
                head.next= newNode;
                map.put(key, newNode);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */