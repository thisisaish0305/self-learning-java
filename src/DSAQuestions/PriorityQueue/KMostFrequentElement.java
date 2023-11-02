package DSAQuestions.PriorityQueue;

import java.util.*;

public class KMostFrequentElement {

    public static void main(String[] args) {

        char ch[]= {'a','i','s','h'};
        String st = new String(ch);
        System.out.println(st.length());

        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((n1,n2) -> map.get(n2) - map.get(n1));

        //map.put(1,2);
        map.put(2,3);
        map.put(3,0);
        map.put(4,1);
        map.put(5,1);

        // k most frequent k=3 // 2, 1, 4

        for(Integer key : map.keySet()){
            pq.add(key);
        }
        System.out.println("Top k freq elements are:");
        while(!pq.isEmpty()){
            System.out.print(pq.remove()+" ");
        }
        System.out.println();
        System.out.println();
        String s = "Aishwarya";
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        groupAnagrams(strs);





    }

    public static void groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String s: strs) {
            char stringArray[] = s.toCharArray();
            Arrays.sort(stringArray);
            String key = "";
            for(char ch: stringArray){
                key += ch;
            }




          if(map.containsKey(key)){
              List<String>list=map.get(key);
              list.add(s);
          } else {
              List<String>list = new ArrayList<>();
              list.add(s);
              map.put(key, list);
          }



        }

        for(String s: map.keySet()){
            System.out.print(s+": ");
            for(String str : map.get(s)){
                System.out.println(str);
            }
            System.out.println();
        }
    }
}
