package RandomLearnings;

public class getNumbers {

    private static void getNumber(int sum, int numDigits, String number, int index) {
        if(index >= numDigits || sum < 0){
            return;
        }

        if(sum==0 && index == numDigits) {
            System.out.println(number);
            return;
        }

        for(int i=1; i<=9; i++){
            char ch = (char)(i + '0');
            number += ch;
            getNumber(sum - i, numDigits, number, index+1);
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        getNumber(15, 2, "", 0);
    }
}
