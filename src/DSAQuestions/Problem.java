package DSAQuestions;

/*
* [1:46 PM] Abhishek Saxena

Given an integer array of unique elements, return all possible subsets (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Input: nums = [0]
Output: [[],[0]]
*
* */

import java.util.ArrayList;
import java.util.List;

public class Problem {

    private static List<List<Integer>> returnSubsets(int[] numbers) {
        if(numbers.length==1){
            List<List<Integer>> twoDList = new ArrayList<>();
            List<Integer> l = new ArrayList<>();
            l.add(numbers[0]);
            twoDList.add(l);
            return twoDList;
        }

        int smallerNumbers[] = new int[numbers.length-1];
        int curr = numbers[0];
        for(int i=1; i<numbers.length;i++){
            smallerNumbers[i-1]= numbers[i];
        }

        List<List<Integer>> smallSubsets = returnSubsets(smallerNumbers);
        List<List<Integer>> subsets = new ArrayList<>();
        System.out.println(smallSubsets.size());

        for(int i=0; i<smallSubsets.size();i++){
            subsets.add(smallSubsets.get(i));
            List<Integer> innerList = smallSubsets.get(i);
            innerList.add(0,curr);
            subsets.add(innerList);
        }
        return subsets;
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,3};
        List<List<Integer>> subsets = returnSubsets(numbers);
        System.out.println(subsets.size());

        for(int i=0; i< subsets.size();i++){
            List<Integer> subset = subsets.get(i);
            for(int s:subset){
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
