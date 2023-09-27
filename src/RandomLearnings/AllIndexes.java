package RandomLearnings;


public class AllIndexes {

    private static int[] helper(int [] input, int si, int x) {

        if(si==input.length) {
            return new int[0];
        }

        int smallRes[]=helper(input, si+1,x);

        int result[] = null;

        if(input[si]==x) {
            result = new int[smallRes.length+1];
            result[0]=si; int k=1;
            for(int i=0;i<smallRes.length;i++) {
                result[k++]= smallRes[i];
            }
        } else{
            result = smallRes;
        }
        return result;

    }

    public static int[] allIndexes(int input[], int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */


        return helper(input,0,x);

    }

    public static void main(String[] args) {
        int [] arr = {9,8,0,8,8};
        int [] ans = allIndexes(arr,8);
        for(int a:ans){
            System.out.println(a);
        }
    }

}
