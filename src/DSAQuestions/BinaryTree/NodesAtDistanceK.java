package DSAQuestions.BinaryTree;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class NodesAtDistanceK {
}


class Solution1 {

    private static BinaryTreeNode<Integer> findTarget(BinaryTreeNode<Integer> root, int nodeValue){
        if(root==null || root.data==nodeValue){
            return root;
        }

        BinaryTreeNode<Integer> leftAns = findTarget(root.left, nodeValue);
        BinaryTreeNode<Integer> rightAns = findTarget(root.right, nodeValue);

        if(leftAns!=null)
            return leftAns;
        else
            return rightAns;
    }
    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
        //Your code goes here
        //BFS traversal and create Parent pointers map.
        HashMap<BinaryTreeNode<Integer>, BinaryTreeNode<Integer>> map = new HashMap<>();
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            BinaryTreeNode<Integer> front = q.remove();
            if(front.left!=null){
                map.put(front.left, front);
                q.add(front.left);
            }
            if(front.right!=null){
                map.put(front.right,front);
                q.add(front.right);
            }
        }
        // q is emptied now.
        HashSet<BinaryTreeNode> visited = new HashSet<>();
        //find the target node
        BinaryTreeNode<Integer> target = findTarget(root, node);

        int d=0;
        visited.add(target);
        BinaryTreeNode<Integer> front = null;
        BinaryTreeNode<Integer> parent, leftChild, rightChild = null;
        q.add(target);

        while(!q.isEmpty()){
            int size= q.size();
            if(d==k){
                break;
            }
            for(int i=0; i<size; i++){
                front = q.remove();
                if(map.containsKey(front) && !visited.contains(front)){
                    parent = map.get(front);
                    q.add(parent);
                    visited.add(parent);
                }
                if(front.left!=null && !visited.contains(front)){
                    leftChild = front.left;
                    q.add(leftChild);
                    visited.add(leftChild);
                }
                if(front.right!=null && !visited.contains(front)){
                    rightChild = front.right;
                    visited.add(rightChild);
                }
            }
            d++;
        }

        //at this pont whatever is in queue, are the nodes at distance k from target
        while(!q.isEmpty()){
            System.out.print(q.remove().data + " ");
        }
    }

}