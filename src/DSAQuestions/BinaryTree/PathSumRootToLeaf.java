package DSAQuestions.BinaryTree;

import java.util.ArrayList;

public class PathSumRootToLeaf {

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

        private static void helper(BinaryTreeNode<Integer>root, int k, ArrayList<Integer> path) {
            if(root==null) {
                return;
            }
            path.add(root.data);

            if(root.left==null && root.right==null) {
                if(k==root.data) {
                    for(int i=0; i<path.size(); i++){
                        System.out.print(path.get(i)+" ");
                    }
                    System.out.println();
                } else {
                    if(path.size()>1)
                        path.remove(path.size()-1);
                }
            }

            helper(root.left, k-root.data, path);
            helper(root.right, k-root.data, path);
            if(path.size()>1)
                path.remove(path.size()-1);
            return;
        }

        public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {

            ArrayList<Integer> path = new ArrayList<>();
            helper(root,k,path);
        }

}

