package DSAQuestions;

public class StringPermutations {

    private static int factorial(int num){
        int res =1;
        for(int i=1; i<=num;i++){
            res = res * i;
        }
        return res;
    }
        public static String[] permutationOfString(String input) {
            // Write your code here
            if(input.length()==0) {
                return new String[]{""};
            }

            String[] ans = new String[factorial(input.length())]; //  factorial
            int k=0;
            for(int i=0; i<input.length();i++){  //abc
                String first = input.substring(0,i);
                String second = input.substring(i+1);
                String[] smallAns = permutationOfString(first + second);
                char currChar = input.charAt(i);

                for(int j=0; j< smallAns.length; j++){
                    ans[k] = currChar + smallAns[j];
                    k++;
                }
            }
            return ans;
        }

    public static void main(String[] args) {
        String s ="abc";
        System.out.println(s.substring(0,0));
        String[] ans = permutationOfString("abc");
        for(String a : ans){
            System.out.println(a);
        }
    }


}
