package DSAQuestions.exceptionHandling;

public class ExceptionDemo {

    public static void helperCheck(String s) {
        try {
            checkLetter(s);
        } catch (Exception e) {
            System.out.println("executing smoothly");
            //System.exit(0);
        } finally {
            System.out.println("in the finally. I m always executed. but obvio not if u close the JVM duh");
        }
    }
    public static void checkLetter(String s) {
        if(s.contains("a")) {
            System.out.println("a found. throwing exception but also catching it.");
           throw new LetterNotFoundException("a found");
        }
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        helperCheck("abcde");
    }
}
