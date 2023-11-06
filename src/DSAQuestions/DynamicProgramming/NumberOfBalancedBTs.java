package DSAQuestions.DynamicProgramming;

public class NumberOfBalancedBTs {
    public static final int mod = (int)Math.pow(10,9) +7;
        public static long balancedBTs(long n){
            if(n<0){
                return 0;
            }
            if(n==1|| n==0) {
                return 1;
            }
            long ans1 = balancedBTs(n-1) * balancedBTs(n-1);
            long ans2 = balancedBTs(n-1) * balancedBTs(n-2);
            long ans3 = balancedBTs(n-2) * balancedBTs(n-1);
            return ans1+ans2 + ans3;
        }

        //memoized
    private static int balancedBTsM(int n, int[] arr){
        if(n<0){
            return 0;
        }

        if(arr[n]!=0){
            return arr[n];
        }

        int ans1 = balancedBTsM(n-1,arr);
        int ans2 = balancedBTsM(n-2,arr);
        int actualAns1 = ans1 * ans1;
        int actualAns2 = ans1 * ans2;

        arr[n] = actualAns1 + (2 * actualAns2);
        return arr[n];
    }


    //bottom up DP
    private static long balancedBTsDp(int n){
            if(n<0){
                return 0;
            }

            long[] arr = new long[n+1];
            arr[0]=1; arr[1]=1;

            for(int i=2; i<=n; i++){
                long ans1 = arr[i-1];
                long ans2 = arr[i-2];
                long actualAns1 = ans1 * ans1;
                long actualAns2 = ans1 * ans2;
                arr[i] = ( actualAns1 + (2* actualAns2) )%1000000007;
            }
            return arr[n];
    }

    private static int balancedBTsDp2(int n){
        if(n<0){
            return 0;
        }

        int[] arr = new int[n+1];
        arr[0]=1; arr[1]=1;

        for(int i=2; i<=n; i++){
            int ans1 = arr[i-1];
            int ans2 = arr[i-2];

            long longAns1 = ((long)ans1 * ans1) % mod;
            long longAns2 = ((long)ans1 * ans2 *2) % mod ;


            int actualAns1 = (int) longAns1 ;
            int actualAns2 = (int) longAns2 ;

            arr[i] = ( actualAns1 + actualAns2 )% mod;
        }
        return arr[n];
    }


        //function call optimised, non dp = TC - 2^n. s.c - N
        private static long optimisedBalancedBTs(long n){
                if(n<0){
                    return 0;
                }
                if(n==1|| n==0) {
                    return 1;
                }

                long ans1 = balancedBTs(n-1);
                long ans2 = balancedBTs(n-2);

                long actualAns1 = ans1 * ans1;
                long actualAns2 = ans1 * ans2;

                return (actualAns1+ (2*actualAns2) )% (1000000007);
        }



    public static void main(String[] args) {
            int n=100000;
            int[] arr = new int[n+1];
            arr[0]=1; arr[1]=1;

        System.out.println(balancedBTsDp(n));
        //System.out.println(balancedBTsM(n,arr));
        //System.out.println(balancedBTs(n));
    }
}
