package DSAQuestions;

public class QuickSortTA {

    private static void swap(int si, int ei,int[] input){
        int temp = input[si];
        input[si] = input[ei];
        input[ei] = temp;
    }
    public static int partition(int input[],int sI,int eI)
    {
        int pivot=input[sI];
        int count=0;
        for(int i=sI+1;i<=eI;i++)
        {
            if(input[i]<=pivot)
                count++;
        }
        int pivotPos=sI+count;
        int temp=input[sI];
        input[sI]=input[pivotPos];
        input[pivotPos]=temp;
        int i=sI;
        int j=eI;
        while(i<pivotPos && j>pivotPos)
        {
            if(input[i]<=input[pivotPos])
                i++;
            else if(input[j]>input[pivotPos])
                j--;
            else
            {
                int temp_=input[i];
                input[i]=input[j];
                input[j]=temp_;
                i++;j--;

            }
        }
        return pivotPos;
    }

    public static void quickSort(int[] input,int startIndex, int endIndex) {
        if(startIndex<endIndex) {
            int pivotPosition = partition(input, startIndex, endIndex);
            quickSort(input, startIndex, pivotPosition - 1);
            quickSort(input, pivotPosition + 1, endIndex);
        }
    }

}