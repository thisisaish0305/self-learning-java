package DSAQuestions.BinarySearchTree;

/*
 * Binary Tree Node class
 *
 * class BinaryTreeNode<T> {
 * 		T data;
 * 		BinaryTreeNode<T> left;
 * 		BinaryTreeNode<T> right;
 * 		public BinaryTreeNode(T data)
 * 		{
 * 			this.data = data;
 * 		}
 * }
 */

/*
 * Main Method being used internally
 *	public static void main(String[] args) throws IOException {
 *		BinarySearchTree bst = new BinarySearchTree();
 *		int choice, input;
 *		int q = Integer.parseInt(br.readLine());
 *		while (q-- > 0) {
 *			st = new StringTokenizer(br.readLine());
 *			choice = Integer.parseInt(st.nextToken());
 *			switch (choice) {
 *			case 1:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.insert(input);
 *				break;
 *				case 2:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.remove(input);
 *				break;
 *			case 3:
 *				input = Integer.parseInt(st.nextToken());
 *				System.out.println(bst.search(input));
 *				break;
 *			default:
 *				bst.printTree();
 *				break;
 *			}
 *		}
 *	}
 */

import DSAQuestions.BinaryTree.BinaryTreeNode;

import java.util.ArrayList;

public class BinarySearchTree {

    private BinaryTreeNode<Integer> root;


    public BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int data) {
        if(root==null){
            root = new BinaryTreeNode<>(data);
            return root;
        }

        if(data > root.data){
            root.right = insertHelper(root.right,data);
        } else {
            root.left = insertHelper(root.left, data);
        }
        return root;
    }

    public void insert(int data) {
        //Implement the insert() function
       root = insertHelper(root, data);
    }

    public void remove(int data) {
        //Implement the remove() function
    }

    public void printTree() {
        //Implement the printTree() function
    }

    public boolean search(int data) {
        //Implement the search() function
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(2); list.add(3);
        list.remove(list.size()-1);
        System.out.println(list.size());

        String s= "";
        BinaryTreeNode <Integer> root = new BinaryTreeNode<>(10);
        int sum = 100;
        s += root.data  +" "+ (sum-root.data);
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(20);
        bst.insert(30);
    }

}