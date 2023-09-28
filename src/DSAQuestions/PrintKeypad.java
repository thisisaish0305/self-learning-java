package DSAQuestions;

public class PrintKeypad {

    private static String helper(int n){
        String[] s = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return s[n];
    }
    private static void printKeypad(int input, String output) {
        if(input==0){
            System.out.println(output);
            return;
        }

        int curr = input % 10;
        String key = helper(curr);

        for(int i=0; i<key.length();i++){
            char ch = key.charAt(i);
            printKeypad(input/10, ch+output);
        }
    }

    public static void printKeypad(int input){
        // Write your code here
        printKeypad(input,"");

    }

    public static void main(String[] args) {
        printKeypad(23);
    }
}
