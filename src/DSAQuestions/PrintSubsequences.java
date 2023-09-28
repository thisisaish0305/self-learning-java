package DSAQuestions;

public class PrintSubsequences {


    private static void printSubsequences(String input, String outputSoFar) {
        if(input.length()==0){
            System.out.println(outputSoFar);
            return;
        }

        printSubsequences(input.substring(1),outputSoFar);
        printSubsequences(input.substring(1),outputSoFar+input.charAt(0));
    }

    private static void printSubsequences(String str){
        printSubsequences(str,"");
    }


    public static void main(String[] args) {
        printSubsequences("xyz");
    }
}


