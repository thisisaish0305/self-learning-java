import RandomLearnings.Solution;

import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Solution sol= new Solution();
        sol.print(10);

        HashMap<Character, Integer> myMap = new HashMap<>();

        String s  = "amit";
        int cnt =0;
        for(int i=0; i<s.length();i++){
            cnt += s.charAt(i);
        }

        System.out.println(cnt + "  "+ cnt%26);

        HashMap<String, Integer> map = new HashMap<>();

        map.put("abc",1);
        map.put("def",2);

        if(map.containsKey("abc")){
            System.out.println(map.get("abc"));
        }

        System.out.println(map.size());
        map.getOrDefault("xyz",0);


        System.out.println(map.containsKey("fgh"));

       Set<String> keys = map.keySet();
       for(String k : keys){
           System.out.println(k);
       }

       int r = map.remove("abc");
        System.out.println(r);
      // int removed = map.remove("de");// important point here, note why getting null pointer

        Integer a = 10;
        int i = a;
        System.out.println(a+" ,"+ i);

        Integer b = null;
       // int j = b;
      //  System.out.println(j);



    }
}