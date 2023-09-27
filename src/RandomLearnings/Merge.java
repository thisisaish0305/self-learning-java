package RandomLearnings;

public class Merge {

    public static void mergeSort(int[] input, int l, int r){
        // Write your code here

        if(l<r){
            int m = (l+r)/2;

            mergeSort(input, l, m);
            mergeSort(input, m+1, r);

            merge(input,l,m,r);
        }
    }
    public static void merge(int[] input, int l, int m, int r){
        int num1 = m-l+1;
        int num2 = r-m;

        int L[] = new int[num1];
        int R[] = new int[num2];

        for(int i = 0; i< num1;i++){
            L[i] = input[l+i];
        }
        for(int j=0;j<num2;j++){
            R[j] = input[m+1+j];
        }

        int i =0;
        int j=0;
        int k=l;

        while(i<num1 && j< num2){
            if(L[i] < R[j]){
                input[k] = L[i];
                i++;
            }
            else{
                input[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<num1){
            input[k] = L[i];
            i++;
            k++;
        }
        while(j<num2){
            input[k] = R[j];
            j++;
            k++;
        }
    }
}



