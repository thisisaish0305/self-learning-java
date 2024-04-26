package DSAQuestions.PriorityQueue;

public class L1 {

    static int getCapacityWays(int[] arr, int i , int k) {
        if(k==0)
            return 1;

        if(k<0)
            return 0;

        if(i>=arr.length)
            return 0;

        int a=0;
        a+=getCapacityWays(arr, i+1, k-arr[i]);
        a+=getCapacityWays(arr, i+1, k);

        return a;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7,7,4,2};

        int a = getCapacityWays(arr, 0, 7);
        System.out.println(a);
    }
}
