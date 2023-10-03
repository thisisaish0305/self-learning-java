package DSAQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// https://leetcode.com/problems/find-the-difference-of-two-arrays/description/
class FindDifference {
    public List<List<Integer>> findDifferenceMethod(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer,Boolean> numsOneMap = new HashMap<>();
        HashMap<Integer,Boolean> numsTwoMap = new HashMap<>();

        for(int n:nums1){
            numsOneMap.put(n,true);
        }

        for(int n:nums2){
            numsTwoMap.put(n,true);
        }

        List<Integer> first = new ArrayList<>();
        for(Integer key: numsOneMap.keySet()){
            if(numsTwoMap.containsKey(key)==false){
                first.add(key);
            }
        }

        List<Integer> second = new ArrayList<>();
        for(Integer key: numsTwoMap.keySet()){
            if(numsOneMap.containsKey(key)==false){
                second.add(key);
            }
        }
        result.add(first); result.add(second);
        return result;
    }
}