package DSAQuestions.DynamicProgramming;

import java.util.Scanner;

public class MinCountOfSquares {

    public static int minCount(int n, int ans) {
        //Your code goes here
        if(n==0 || n==1){
            return n;
        }

        for(int i=1; i<=n/2; i++) {
            if(i*i <= n){
                int count = minCount(n- (i*i), ans) +1;
                ans = Math.min(ans, count);
            }
        }
        return ans;
    }
    private static int minCountM(int n, int ans, int []arr) {
        if(n==0 || n==1){
            arr[n]=n;
        }
        if(arr[n]!=-1){
            return arr[n];
        }
        for(int i=1; i<=n/2; i++) {
            if(i*i <= n){
                int count = minCountM(n- (i*i), ans,arr) +1;
                ans = Math.min(ans, count);
            }
        }
        arr[n]=ans;
        return arr[n];
    }

    private static int minCountDp(int n){
        if(n==0 || n==1){
            return n;
        }
        int[] arr = new int[n+1];
        for(int i=0; i<=n;i++){
            arr[i]=-1;
        }

        arr[0]=0; arr[1]=1;
        for(int i=2; i<=n; i++){
            int min = Integer.MAX_VALUE;
            for(int j=1; j*j <= i; j++){
                min = Math.min(arr[i - j*j], min);
            }
            arr[i] = min +1;
        }
        return arr[n];
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();

        int [] arr = new int[n+1];
        for(int i=0; i<=n ; i++){
            arr[i] = -1;
        }

        System.out.println("Dp solution:"+minCountDp(n));
        System.out.println(minCountM(n,Integer.MAX_VALUE, arr));

        System.out.println("Ans:"+minCount(n, Integer.MAX_VALUE));
    }
}
