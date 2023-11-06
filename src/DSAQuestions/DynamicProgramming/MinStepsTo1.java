package DSAQuestions.DynamicProgramming;

public class MinStepsTo1 {

    private static int minStepsDP(int n){
        int[] arr = new int[n+1];
        for(int i=0; i<n+1; i++){
            arr[i] =-1;
        }

        arr[1]=0;
        for(int i=2; i<=n; i++){
            int steps1= Integer.MAX_VALUE, steps2 = Integer.MAX_VALUE, steps3 = Integer.MAX_VALUE;
            if(i%2==0){
                steps2 = arr[i/2]+1;
            }
            if(i%3==0){
                steps3 = arr[i/3]+1;
            }

            steps1 = arr[i-1]+1;
            arr[i] = Math.min(steps1, Math.min(steps2,steps3));
        }
        return arr[n];
    }

    private static int getMinSteps(int num) {
        if(num<=0){
            return Integer.MAX_VALUE;
        }
        if(num==1){
            return 0;
        }

        int steps1=Integer.MAX_VALUE, steps2=Integer.MAX_VALUE, steps3=Integer.MAX_VALUE;
        if(num%2==0){
            steps2 = getMinSteps(num/2) ;
        }
        if(num%3==0){
            steps3 = getMinSteps(num/3);
        }
        steps1 = getMinSteps(num-1);
        int result = Math.min(Math.min(steps1, steps2), steps3)+1;
        return result;
    }

    //using memoization
    private static int helperMemoization(int n, int[] arr){
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 0;
        }

        if(arr[n]!=-1){
            return arr[n];
        }

        int steps2=Integer.MAX_VALUE,steps3=Integer.MAX_VALUE;
        if(n%2==0){
            steps2 = helperMemoization(n/2,arr)+1;
        }
        if(n%3==0){
            steps3 = helperMemoization(n/3, arr)+1;
        }
        int steps1 = helperMemoization(n-1,arr)+1;
        arr[n] = Math.min(steps1, Math.min(steps2, steps3));
        return arr[n];
    }
    public static int countMinStepsToOne(int n) {
        //Your code goes here
        int[] arr = new int[n+1];
        for(int i=0; i<=n;i++){
            arr[i]= -1;
        }
        arr[1]=0;
        return helperMemoization(n,arr);
    }

    public static void main(String[] args) {

        System.out.println(getMinSteps(0));
        System.out.println(minStepsDP(50001));
        //System.out.println(countMinStepsToOne(50001));
    }
}
