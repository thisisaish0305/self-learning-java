package RandomLearnings;

import java.util.StringTokenizer;

public class MainClassForRandomChecking {

    private static void increment(int[]arr){
        for(int i=0; i<arr.length;i++){
            arr[i]+=1;
        }
    }

    private static void modify(String s){
        s+=" Aish";
        System.out.println(s);
    }

    public static void main(String[] args) {
        int [] arr ={10,20,30,40};
        increment(arr);
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

        String s = "hey";
        modify(s);
        System.out.println(s);
    }
}
