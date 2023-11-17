package DSAQuestions.DynamicProgramming;

import java.util.HashMap;

public class ByteLandian {

    private static long helper(long n){
        if(n==0 || n==1){
            return n;
        }

        long ans1 = helper(n/2);
        long ans2 = helper(n/3);
        long ans3 = helper(n/4);

        long ans =0;
        long sum = ans1+ ans2 + ans3;
        if(sum > n){
            ans = sum;
        } else {
            ans =n;
        }
        return ans;
    }

//    private static long helperM(long n, long[] arr){
//        if(arr[n]!=-1){
//            return arr[n];
//        }
//
//        long ans1 = helperM(n/2, arr);
//        long ans2 = helperM(n/3, arr);
//        long ans3 = helperM(n/4, arr);
//
//        long ans =0;
//        long sum = ans1+ ans2 + ans3;
//        if(sum > n){
//            ans = sum;
//        } else {
//            ans =n;
//        }
//
//        arr[n] = ans;
//        return arr[n];
//
//    }

    private static long helperM(long n, HashMap<Long, Long> memo){
        if(memo.containsKey(n)){
            return memo.get(n);
        }

        long ans1 = helperM(n/2, memo);
        long ans2 = helperM(n/3, memo);
        long ans3 = helperM(n/4, memo);

        long ans =0;
        long sum = ans1+ ans2 + ans3;
        if(sum > n){
            ans = sum;
        } else {
            ans =n;
        }

        memo.put(n, ans);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(helper(40));
        HashMap<Long,Long> memo = new HashMap<>();
        memo.put(0l, 0l);
        memo.put(1l, 1l);
        System.out.println(helperM(40, memo));
    }
}
