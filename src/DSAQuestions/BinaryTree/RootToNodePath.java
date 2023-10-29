package DSAQuestions.BinaryTree;

import java.util.ArrayList;

public class RootToNodePath {
    private static ArrayList<Integer> getRootToNodePath(BinaryTreeNode<Integer> root, int nodeVal){
        if(root==null){
            return null;
        }

        if(root.data == nodeVal){
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(root.data);
            return ans;
        }

        ArrayList<Integer> leftAns = getRootToNodePath(root.left, nodeVal);
        if(leftAns!=null){
            leftAns.add(root.data);
            return leftAns;
        }
        ArrayList<Integer> rightAns = getRootToNodePath(root.right, nodeVal);
        if(rightAns!=null){
            rightAns.add(root.data);
            return rightAns;
        }
        return null;
    }

}
