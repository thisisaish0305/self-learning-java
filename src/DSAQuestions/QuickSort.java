package DSAQuestions;

import static java.util.Collections.swap;

public class QuickSort {

        private static void swap(int si, int ei,int[] input) {
            int temp = input[si];
            input[si] = input[ei];
            input[ei] = temp;
        }
        private static int partition(int[] input, int si, int ei){

            int pivot = input[si];
            int cnt =0;
            for(int i=si+1; i<=ei;i++){ // was mistake here, I was starting loop from si. so wrong count.
                if(input[i]<=pivot){
                    cnt++;
                }
            }

            int pivotPosition = cnt+si;
            swap(si,pivotPosition, input);
            int i=si, j=ei;

            while(i<pivotPosition && j>pivotPosition) {
                if(input[i]<=pivot){
                    i++;
                } else {
                    if(input[j]<=pivot){
                        swap(i,j,input);
                        i++;
                    }
                    j--;
                }
            }
            return pivotPosition;
        }
        public static void quickSort(int[] input,int startIndex, int endIndex) {
            if(startIndex<endIndex) {
                int pivotPosition = partition(input, startIndex, endIndex);
                quickSort(input, startIndex, pivotPosition - 1);
                quickSort(input, pivotPosition + 1, endIndex);
            }
        }

    public static void main(String[] args) {
            int[] input ={10,18,19,9,2,6,11};
    /*    int i=0, j=input.length-1, pivotPosition =3,pivot=input[i];
        swap(i,pivotPosition, input);

        while(i<pivotPosition && j>pivotPosition) {
            if(input[i]<=pivot){
                i++;
            } else {
                if(input[j]<=pivot){
                    swap(i,j,input);
                    i++;
                }
                j--;
            }
        } */

            quickSort(input,0, input.length-1);
            for(int in:input){
                System.out.println(in);
            }


    }
}
