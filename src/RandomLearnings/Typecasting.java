package RandomLearnings;

import javafx.util.Pair;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Typecasting {

    public static void main(String[] args) {
//        int i=1;
//        char ch = (char) (i +'0');
//        System.out.println(ch);



        PriorityQueue<Pair<Integer, int[]>> pq = new PriorityQueue<Pair<Integer, int[]>>(new Comparator<Pair<Integer, int[]>>() {
            @Override
            public int compare(Pair<Integer, int[]> o1, Pair<Integer, int[]> o2) {
                return o2.getKey() - o1.getKey();
            }
        });



        String str = "";
        for(int i=1; i<5; i++){
            char ch = (char) (i+'0');
            str+= ch;
        }
        System.out.println("String is "+str);

        //String to int
        String num = "576";
        int no = 0;
        for(int i=0; i < num.length(); i++) {
            char ch = num.charAt(i);
            int n = ch-'0';
            System.out.println(n);
            no = (no * 10) + n;
        }
        System.out.println("Number is "+ no);


    }
}
