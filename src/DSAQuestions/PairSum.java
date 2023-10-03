package DSAQuestions;

import java.util.Arrays;

public class PairSum {

    public static int pairSum(int[] arr, int target) {
        //Your code goes here
        Arrays.sort(arr);
        int s=0, e= arr.length-1,count=0,cnt1=1,cnt2=1,cnt3=0;


        while(s<e){
            System.out.println("s "+s +"e "+e);
            int sum = arr[s] + arr[e];

            if(sum<target){
                s++;
            } else if(sum>target){
                e--;
            } else {

                cnt1=1;cnt2=1;cnt3=0;

                if(arr[s]==arr[e]){

                    while(s<e && arr[s]==arr[e]){
                        s++;e--; cnt3+=2;
                    }
                    if(s==e){ // odd number of equal elements
                        cnt3++;
                    }
                    System.out.println("cnt3 "+cnt3);
                    count  =count+ ((cnt3*(cnt3-1))/2);

                } else {

                    while(s<e && s+1<arr.length && arr[s]==arr[s+1]){
                        s++;cnt1++;
                    }
                    s++;

                    while(e>s && e-1>=0 && arr[e]==arr[e-1]){
                        e--; cnt2++;
                    }
                    e--;



                    count += cnt1 * cnt2;
                }

            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] arr = {2,2,4,4,4};
        int[] arr2 = {1, 3, 6, 2, 5, 4, 3, 2, 4};
        int[] arr3 = {2, 8, 10, 5, -2, 5};
        System.out.println(pairSum(arr2,10));
    }
}