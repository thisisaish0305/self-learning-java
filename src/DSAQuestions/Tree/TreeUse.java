package DSAQuestions.Tree;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class TreeUse {

  public static TreeNode<Integer> takeInput(Scanner sc) {
      System.out.println("Enter next node data: ");

      int rootData = sc.nextInt();
      TreeNode<Integer> root = new TreeNode<>(rootData);
      System.out.println("Enter number of children of "+ rootData+": ");
      int noc = sc.nextInt();
      for(int i=0; i<noc; i++){
          TreeNode<Integer> child = takeInput(sc);
          root.children.add(child);
      }
      return root;
  }

  public static void print(TreeNode<Integer> root){
      String s = root.data+ ": ";
      for(int i=0 ; i<root.children.size(); i++){
          s+= root.children.get(i).data + ", ";
      }
      System.out.println(s);
      for(int i=0 ; i<root.children.size(); i++){
          print(root.children.get(i));
      }

  }

    public static void main(String[] args) {
        //Pair<TreeNode, Pair<Integer,Integer>> p = new Pair<TreeNode,Pair<Integer,Integer>>();
        Scanner s = new Scanner(System.in);
        TreeNode<Integer> root = takeInput(s);
        System.out.println();
        print(root);
    }
}
