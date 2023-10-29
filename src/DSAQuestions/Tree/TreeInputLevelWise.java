package DSAQuestions.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeInputLevelWise {
//1 2 2 3 2 4 5 0 0 0
    public static void printNodeAtDepthK(TreeNode<Integer> root, int k){
        if(k<0){
            return;
        }
        if(k==0){
            System.out.println(root.data);
            return;
        }

        for(int i=0; i<root.children.size();i++){
            printNodeAtDepthK(root.children.get(i),k-1 );
        }
    }

    public static void printLevelWise(TreeNode<Integer> root){

        Queue<TreeNode<Integer>> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int n = q.size();

            for(int i=0; i<n;i++){
                TreeNode<Integer> front = q.remove();
                if(i==n-1){
                    System.out.print(front.data);
                } else{
                    System.out.print(front.data+" ");
                }

                for(int j=0; j<front.children.size();j++){
                    q.add(front.children.get(j));
                }
            }
            System.out.println();
        }
    }


    public static TreeNode<Integer>inputLevelWise(){
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        System.out.println("Enter root data: ");
        Scanner sc = new Scanner(System.in);
        TreeNode<Integer> root = new TreeNode<>(sc.nextInt());
        q.add(root);

        while(!q.isEmpty()){
            TreeNode<Integer> front = q.remove();
            System.out.println("Enter no. of children for: "+front.data);
            int noc=sc.nextInt();
            for(int i=0; i<noc;i++){
                System.out.println("Enter data for "+i + "th children of "+front.data);
                int data = sc.nextInt();
                TreeNode<Integer> child = new TreeNode<>(data);
                front.children.add(child);
                q.add(child);
            }
        }
        return root;

    }

    public static int sumOfAllNode(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int sum=root.data;
        for(int i=0; i<root.children.size();i++){
            sum += sumOfAllNode(root.children.get(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = inputLevelWise();
        printLevelWise(root);
        System.out.println();
        TreeUse.print(root);
        System.out.println();
        printNodeAtDepthK(root,2);
    }

    //
}
