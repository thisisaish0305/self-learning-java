package DSAQuestions.DynamicProgramming;

public class Fibonacci {

    private static int fib(int n) {
        if(n==0 || n==1){
            return n;
        }

        int result = fib(n-1) + fib(n-2);
        return result;
    }

    private static int fibMemoized(int n, int[] storage){
        if(n==0|| n==1){
            storage[n] = n;
            return storage[n];
        }

        if(storage[n]!=-1){
            return storage[n];
        }

        int result = fibMemoized(n-1, storage) + fibMemoized(n-2,storage);
        storage[n]=result;
        return storage[n];
    }
    private static int fibMemoized(int n){
        int storage[] = new int[n+1];
        for(int i=0; i< storage.length; i++){
            storage[i] = -1;
        }
        return fibMemoized(n, storage);
    }

    private static int fibDP(int n){
        return 0;
    }

    public static void main(String[] args) {
        boolean ans = true;
        Boolean ansW = true;
        System.out.println(fibMemoized(50));
        System.out.println(fib(50));
    }
}
