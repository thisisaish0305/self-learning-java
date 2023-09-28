package DSAQuestions;



public class RecursiveBinarySearch {

    private static int binarySearch(int si, int ei, int[] nums, int target) {
        if(si>ei){
            return -1;
        }

        int mid = (si+ei)/2;
        if(nums[mid]==target){
            return mid;
        }

        if(nums[mid]>target){
            return binarySearch(si,mid-1, nums, target);
        } else {
            return binarySearch(mid+1, ei, nums, target);
        }
    }
    public static int search(int []nums, int target) {
        // Write your code here.
        return binarySearch(0,nums.length-1,nums,target);
    }

    public static void main(String[] args) {
        int [] nums = {1, 3 ,7 ,9, 11, 12 ,45};
        System.out.println(search(nums, 7));
    }
}