package DSAQuestions;

public class ReverseWord {

        private static void reverse(int si,int ei, char[]arr){
            while(si<ei){
                char temp = arr[si];
                arr[si] = arr[ei];
                arr[ei] = temp;
                si++; ei--;
            }
        }

        private static String makeString(char [] arr, int s, int e){
            String str = "";

            for(int i=s; i<=e;i++){
                str+= arr[i];
            }
            return str;
        }
        public static String reverseWordWise(String input) {
            // Write your code here
            char[] arr = input.toCharArray();
            reverse(0, arr.length - 1, arr);
            int si = 0, ei = 0;
            String result = "";

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == ' ') {
                    ei = i - 1;
                    reverse(si, ei,arr);
                    result += makeString(arr, si, ei);
                    result += " ";
                    si = i + 1;
                }
            }

            reverse(si, arr.length-1, arr);
            result += makeString(arr, si, arr.length-1);
            return result;

        }


    public static void main(String[] args) {
        System.out.println(reverseWordWise("Welcome to Coding Ninjas"));
        int i=10; int j=2;
        String s = "" ;
        s+= i + j;
        System.out.println(s);
    }

}
