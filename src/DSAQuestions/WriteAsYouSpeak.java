package DSAQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class WriteAsYouSpeak {

        public static String writeAsYouSpeak(int n)
        {
            // Write your code here.
            int count = 1;
            int iteration=1;
            String res = ""; // count + digit
            String ans = ""; int i=0;
            res += count ;
            if(n==1){
                return "1";
            }

            while(iteration<n) {

                int j=0; System.out.println("Before "+res);
                ans ="";
                while( j<res.length()) {

                    char ch = res.charAt(j);
                    count =1;
                    while(j+1<res.length() && res.charAt(j+1)==res.charAt(j)){
                        count++;  j++;
                    }
                    ans +=count ;
                    ans +=ch;
                    j++;
                }
                res = ans;
                System.out.println("After "+ res);


                iteration++;
            }

            return res;
        }

    public static void  fun(int[][] arr2d)
    {

        for(int i=0;i<arr2d.length;i++)
        {
            for(int j=0;j<arr2d[i].length;j++)
            {
                arr2d[i][j]=2*i+j;
            }
        }
    }

    public static void main(String[] args) {
//            int count =9;
//
//            String s ="";
//            char ch ='7';
//            s+= ch;
//            s+=count;
//        System.out.println(s);

      //  System.out.println("Ans " + writeAsYouSpeak(6));



        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        for(int i=1 ; i<=10;i++){
            System.out.println(x*i);
        }

        int[] arr = {1,2,0,-1,4,3};
        Arrays.sort(arr);


    }
}