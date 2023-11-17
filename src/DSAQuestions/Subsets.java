package DSAQuestions;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    private static ArrayList<ArrayList<Integer>> subsets(List<Integer> nums){
        if(nums.size() == 1){
            ArrayList<Integer> res = new ArrayList<>();
            res.add(nums.get(0));
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();
            result.add(res);
            return result;
        }

        int element = nums.get(0);
        ArrayList<ArrayList<Integer>> smallResult = subsets(nums.subList(1, nums.size()));

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=0; i< smallResult.size(); i++){
            ArrayList<Integer> innerList = smallResult.get(i);
            result.add(innerList);
            ArrayList<Integer> newList = new ArrayList<>();
            newList.add(element);
            newList.addAll(innerList);
            result.add(newList);
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3);

        ArrayList<ArrayList<Integer>> res = subsets(list);
        for(int i=0; i< res.size();i++){
            for(int j=0; j< res.get(i).size(); j++){
                System.out.print(res.get(i).get(j) +" ");
            }
            System.out.println();
        }
    }
}
