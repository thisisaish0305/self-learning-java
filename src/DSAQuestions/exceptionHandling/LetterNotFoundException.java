package DSAQuestions.exceptionHandling;

public class LetterNotFoundException extends RuntimeException{
    public LetterNotFoundException(String message) {
        super(message);
    }
}
