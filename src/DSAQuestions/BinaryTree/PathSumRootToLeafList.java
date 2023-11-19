package DSAQuestions.BinaryTree;

import java.util.ArrayList;
public class PathSumRootToLeafList {
}



/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

 class Solution {
    private static void helper(BinaryTreeNode<Integer>root, int k, String path) {
        if(root==null) {
            return;
        }
        path += root.data + " ";

        if(root.left==null && root.right==null) {
            if(k==root.data) {
                System.out.println(path);
            }
        }

        helper(root.left, k-root.data, path);
        helper(root.right, k-root.data, path);

    }

    private static void helperList(BinaryTreeNode<Integer>root, int k, ArrayList<Integer> path){
        if(root==null){
            return;
        }

        path.add(root.data);
        if(root.left==null && root.right==null) {
            if(k==root.data) {
                //print list
                for(int p: path){
                    System.out.print(p + " ");
                }
                System.out.println();
            }
        }

        helperList(root.left, k-root.data, path);
        helperList(root.right, k-root.data, path);
        path.remove(path.size()-1);
    }

    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
        helperList(root,k, new ArrayList<>());
        //helper(root,k,"");
    }

}
