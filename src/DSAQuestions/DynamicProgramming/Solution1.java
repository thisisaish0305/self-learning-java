package DSAQuestions.DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        map.put(3,30);

        map.entrySet().forEach(entry -> {System.out.println("key "+ entry.getKey());
            System.out.println("value "+ entry.getValue());
        });
        //map iteration using Java 8 lambda and foreach loop.


        return true;
    }

    public static void main(String[] args) {
         subsetSumToK(5,2,new int[]{1,2,3,4});
    }
}
