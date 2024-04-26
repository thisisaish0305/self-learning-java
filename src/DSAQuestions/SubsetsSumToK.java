package DSAQuestions;

import java.util.Scanner;

public class SubsetsSumToK {


    /*
    *
when you k==0 and si is equal to the length in that case result will have one row,
that is null subset

and when k is not 0 and si is equal to length it won't have any subset neither the null subset
 * */

       private static int[][] subsetsSumK(int input[], int si, int k){
           if(k==0 && si== input.length){
               int [][] result = new int[1][0];// null subset in a jagged array
               return result;
           }
           if(k!=0 && si== input.length){
               int [][] result = new int[0][0]; // no subset
               return result;
           }

           int[][] smallAns1 = subsetsSumK(input,si+1, k-input[si]);
           int[][] smallAns2 = subsetsSumK(input, si+1, k);

           int n = smallAns1.length;
           int m = smallAns2.length;
           int result[][] = new int[m+n][];
           int row =0,l;

           for(int i=0; i<n;i++){
               l=1;
               result[row] = new int[smallAns1[i].length+1];
               result[row][0]=input[si];
               for(int j=0; j< smallAns1[i].length; j++){
                   result[row][l++]= smallAns1[i][j];
               }
               row++;
           }

           for(int i=0; i<m; i++){
               result[row] = new int[smallAns2[i].length];
               for(int j=0; j<smallAns2[i].length;j++){
                   result[row][j]=smallAns2[i][j];
               }
               row++;
           }

           return result;
       }


       // Return a 2D array that contains all the subsets which sum to k
        public static int[][] subsetsSumK(int input[], int k) {
            // Write your code here
            return subsetsSumK(input,0,k);

        }

    public static void main(String[] args) {
        int input[] = {-3,-2,-5,-1,-4,-6};
        int k=-8;

        int res[][] = subsetsSumK(input,k);
        for(int i=0; i<res.length;i++) {
            for(int j=0; j<res[i].length; j++){
                System.out.println(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
