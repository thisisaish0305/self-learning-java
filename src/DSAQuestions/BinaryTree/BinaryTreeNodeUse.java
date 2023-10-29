package DSAQuestions.BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class BinaryTreeNodeUse {

    public static BinaryTreeNode<Integer> takeInput(Scanner s){
        System.out.println("Enter root data :");
        int data = s.nextInt();
        if(data==-1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);

        root.left = takeInput(s);
        root.right = takeInput(s);
        return root;
    }

    public static void print(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }

        String s = root.data + ": ";
        if(root.left!=null){
            s += root.left.data+", ";
        }

        if(root.right!=null){
            s += root.right.data;
        }
        System.out.println(s);
        print(root.left);
        print(root.right);
    }

    public static void printNodesAtDepthK(BinaryTreeNode<Integer> root, int k){
        if(root==null){
            return;
        }

        if(k==0){
            System.out.println(root.data);
            return;
        }

        printNodesAtDepthK(root.left, k-1);
        printNodesAtDepthK(root.right,k-1);
    }

    public static void main(String[] args) {
        HashMap<Integer,Integer> frequencyMap = new HashMap<>();

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        result.add(inner);
        System.out.println(result);

        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(sc);
        print(root);
    }
}
