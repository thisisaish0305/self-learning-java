package DSAQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

class Solution {
    public static int[] productExceptSelf(int[] nums) {

        ArrayList<ArrayList<Integer>> prefix = new ArrayList<>();
        ArrayList<ArrayList<Integer>> suffix = new ArrayList<>();
        ArrayList<Integer> prevList = new ArrayList<Integer>();
        int[] result = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            ArrayList<Integer> currList = new ArrayList<Integer>();
            currList.addAll(prevList);
            currList.add(nums[i]);
            prevList = currList;
            prefix.add(currList);
        }

        prevList = new ArrayList<>();
        for(int i= nums.length-1; i >=0; i--){
            ArrayList<Integer> currList = new ArrayList<Integer>();
            currList.addAll(prevList);
            currList.add(nums[i]);
            prevList=currList;
            suffix.add(currList);
        }

        Collections.reverse(suffix);
        int index =0;

        for(int i=0; i<nums.length; i++){

            int curr = nums[i]; int product =1;

            for(int k=0; k < prefix.get(i).size(); k++){
                if(prefix.get(i).get(k)!=curr){
                    product *= prefix.get(i).get(k);
                }
            }

            for(int k=0; k < suffix.get(i).size(); k++){
                if(suffix.get(i).get(k)!=curr){
                    product *= suffix.get(i).get(k);
                }
            }
            result[index++] = product;
            System.out.println(product);

        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        productExceptSelf(nums);
    }
}