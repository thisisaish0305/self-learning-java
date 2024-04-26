package DSAQuestions.DynamicProgramming;

import java.util.Arrays;
import java.util.*;
import java.io.*;
import java.lang.*;

public class knapsack01 {
}


class gfg
{

}


class Solution
{

    static int helper(int index, int W, int wt[], int val[], int n, int[][]dp){

        if(index>=n || W<=0) return 0;

        if(dp[index][W]!=-1) return dp[index][W];

        int pick=0, dont=0;
        //pick
        if(W-wt[index]>=0) // check is imp else val[i] ll be added in pick.
            pick = helper(index+1, W-wt[index],wt, val, n, dp) + val[index];

        //dont pick
        dont = helper(index+1, W, wt,val,n, dp);

        return dp[index][W]=Math.max(pick, dont);
    }

    static int helper(int W, int wt[], int val[], int n) {
        int dp[][] = new int[n][W+1];

        //initial condition
        for(int j = wt[0]; j<=W; j++)
            dp[0][j] = val[0];

        for(int i = 1; i<n ; i++) {
            for(int j = 0; j<= W; j++) {

                int exc = dp[i-1][j];
                int inc = Integer.MIN_VALUE;
                if(wt[i] <= j)
                    inc = val[i] + dp[i-1][j-wt[i]];
                dp[i][j] = Math.max(inc, exc);
            }
        }
        return dp[n-1][W];

    }

    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n)
    {
        // your code here
        int[][] dp = new int[n][W+1];
        for(int[] row: dp) {
            Arrays.fill(row, -1);
        }
        return helper(0, W, wt, val, n, dp);


//        Queue<Integer> q = new LinkedList<>();

    }
}


