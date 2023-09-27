package RandomLearnings;

import java.util.HashMap;

public class Solution {


        public char findTheDifference(String s, String t) {
            HashMap<Character,Integer> freqMap = new HashMap<>();

            for(int i=0; i<s.length();i++){
                freqMap.put(s.charAt(i),freqMap.getOrDefault(s.charAt(i),0)+1);
            }

            for(int i=0; i<t.length();i++){
                if(freqMap.containsKey(t.charAt(i)) && freqMap.get(t.charAt(i))!=0){

                    int freq = freqMap.get(t.charAt(i));
                    freqMap.put(t.charAt(i), freq-1);

                } else {
                    return t.charAt(i);
                }
            }
            return t.charAt(0);
        }





    public static void print(int n) {
        //Write your code here
        if(n==0){
            return;
        }

        print(n-1);
        System.out.print(n+" ");
    }



}