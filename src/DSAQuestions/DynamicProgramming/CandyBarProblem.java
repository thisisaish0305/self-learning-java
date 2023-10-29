package DSAQuestions.DynamicProgramming;

public class CandyBarProblem {

    private static int numOfWays (int length) {
        int arr[] = new int[length+1];
        arr[0]=1;
        arr[1]=1;
        arr[2]=2;

        for(int i=3; i<=length;i++){
            int a= arr[i-1], b = arr[i-2], c = arr[i-3];
            int d = a+b+c;
            arr[i]=d;
        }
        return arr[length];
    }

    public static void main(String[] args) {
        System.out.println(numOfWays(5));
    }
}
