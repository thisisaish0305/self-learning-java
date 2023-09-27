package Interview;

/*
* [1:05 PM] Abhishek Saxena

Given an array of strings strs , group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
*  typically using all the original letters exactly once.

Input: strs = ["Eat","Tea","Tan","ate","nat","bat"]
Output: [["bat"],["nat","Tan"],["ate","Eat","Tea"]]
*
* */
import java.util.*;

public class Test {

    private static String process(String word){

        String lowerCaseWord = word.toLowerCase();

        char[] lowerCaseWordCharArray = lowerCaseWord.toCharArray();
        int n = lowerCaseWord.length();

        Arrays.sort(lowerCaseWordCharArray);
        String key = "";

        for(char ch: lowerCaseWordCharArray){
            key+=ch;
        }
        return key;

    }
    private static List<List<String>> groupAnagrams(String[] words){

        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String word: words){
            String sortedWord = process(word);

            if(map.containsKey(sortedWord)){
                List<String> list = map.get(sortedWord);
                list.add(word);
                map.put(sortedWord,list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(sortedWord,list);
            }
        }

        for(String key:map.keySet()){
            result.add(map.get(key));
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println("Hi");

        String [] strs = {"Eat","Tea","Tan","ate","nat","bat"};
        List<List<String>> result =groupAnagrams(strs);
        System.out.println(result.size());

        for(int i=0; i< result.size();i++){
            List<String> innerList = result.get(i);
            for(int j=0 ; j<innerList.size();j++){
                System.out.print(innerList.get(j)+" ");
            }
            System.out.println();
        }


    }
}
