package DSAQuestions.BinaryTree;

import java.util.ArrayList;

public class checkBalancedBinaryTree {


    public static Pair checkBalancedBinaryTreeOptimised(BinaryTreeNode<Integer> root) {
        if(root==null){
            return new Pair(0,true);
        }

        if(root.left==null && root.right==null){
            return new Pair(1,true);
        }

        Pair leftAns = checkBalancedBinaryTreeOptimised(root.left);
        Pair rightAns = checkBalancedBinaryTreeOptimised(root.right);

        if(leftAns.isBalanced==false || rightAns.isBalanced==false){
            return new Pair(-1, false);
        }

        int leftSubtreeHeight = leftAns.height;
        int rightSubtreeHeight = rightAns.height;

        if(Math.abs(leftSubtreeHeight-rightSubtreeHeight)>1){
            return new Pair(Math.max(leftSubtreeHeight,rightSubtreeHeight)+1, false);
        } else {
            return new Pair(Math.max(leftSubtreeHeight,rightSubtreeHeight)+1, true);
        }
    }


    int height(BinaryTreeNode<Integer> root){
        //logic
        return 1;
    }

    public Boolean checkBalancedBinaryTree(BinaryTreeNode<Integer> root){
        if(root==null){
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(leftHeight-rightHeight) > 1){
            return false;
        }

        Boolean isLeftBal = checkBalancedBinaryTree(root.left);
        Boolean isRightBal = checkBalancedBinaryTree(root.right);

        return isLeftBal && isRightBal;
    }

    public static void main(String[] args) {
        ArrayList<Integer> path = new ArrayList<>();
        path.add(1);

        //Pair ans = checkBalancedBinaryTreeOptimised();
    }
}
