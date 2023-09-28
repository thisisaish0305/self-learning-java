package DSAQuestions;

public class ReturnKeypadCode {

    private static String returnKeys (int number) {
        String [] keys = {"","","abc", "def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return keys[number];
    }

    // Return a string array that contains all the possible strings
    public static String[] keypad(int n){
        // Write your code here
        if(n==0){
            return new String[]{""};
        }

        String [] smallAns = keypad(n/10);
        int length = smallAns.length;
        int lastDigit = n%10;
        String str = returnKeys(lastDigit);

        String[] result = new String[length * str.length()];
        int k=0;

        for(int i=0; i<length; i++) {
            for(int j=0; j<str.length();j++){
                result[k++] =  smallAns[i] + str.charAt(j);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String result[] = keypad(234);

        for(String r: result){
            System.out.println(r);
        }
    }
}
