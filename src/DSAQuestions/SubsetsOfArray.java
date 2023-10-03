package DSAQuestions;

public class SubsetsOfArray {

        private  static int[][] subsets2(int input[], int si){
           /* if(si==input.length){
                int[][]res = new int[1][0];
                return res;
            }
            only this base condition also works */


           if(input.length==0){
                int[][]res = new int[1][1];
                res[0]= new int[0];
                return res;
            }

            if(si+1==input.length){
                int[][] result = new int[2][];
                result[0] = new int[0];
                result[1] = new int[1];
                result[1][0] = input[si];
                return result;
            }


            int[][] smallOutput = subsets2(input,si+1);
            int n = smallOutput.length;
            int curr = input[si];
            int[][] result = new int[2*n][];
            int row =0;
            int k=0;

            for(int i=0; i<n; i++){
                int colSize = smallOutput[i].length;
                result[row] = new int[colSize];
                k=0;
                for(int j=0; j<colSize; j++){
                    result[row][k++] = smallOutput[i][j];
                }
                row++;
            }

            for(int i=0; i<n; i++){
                int colSize = smallOutput[i].length;
                result[row] = new int[colSize+1];
                k=0;
                result[row][k]=curr;
                k++;

                for(int j=0; j<colSize; j++){
                    result[row][k++] = smallOutput[i][j];
                }
                row++;
            }
            return result;
        }

        // Return a 2D array that contains all the subsets
        public static int[][] subsets(int input[]) {
            // Write your code here
            return subsets2(input,0);

        }

    public static void main(String[] args) {
       int[][] op= new int[][]{};
        System.out.println(op.length);
        //System.out.println(op[0].length); //exception

       int[][] output = new int[1][0]; // base case for 2d array
        System.out.println(output[0].length);



        int input[] = {1,2,3,4,5,6};
        int [][]ans = subsets(input);
        System.out.println(ans.length);

        for(int i=0; i<ans.length;i++){
            for(int j=0; j<ans[i].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

    }




}
