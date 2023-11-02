package DSAQuestions.HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LongestConsecutive {

    //can do better by using map as value is actually not needed.
    public int longestConsecutive(int[] nums) {
        TreeMap<Integer, Boolean> map = new TreeMap<>();
        for(int num: nums){
            map.put(num, true);
        }

        int length =0, ans =0;

        for(int key: map.keySet()){
            length =0;
            while(map.containsKey(key)==true && map.get(key)==true){
                map.put(key,false);
                key++;
                length++;
            }
            ans = Math.max(ans,length);
        }
        return ans;
    }

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(1); set.add(10);
        for(int a: set){
            System.out.println(a);
        }
    }
}
