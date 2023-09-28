package DSAQuestions;

import java.util.HashMap;

public class TwoSum {

        public int[] twoSum(int[] nums, int target) {

            HashMap<Integer,Integer> frequencyMap = new HashMap<>();
            for(int i=0; i< nums.length;i++){
                frequencyMap.put(nums[i],i);
            }

            for(int i=0; i< nums.length;i++) {
                if(frequencyMap.containsKey(target -nums[i])){
                    return new int[]{i, frequencyMap.get(target-nums[i])};
                }
            }

            return new int[]{};
        }

}
