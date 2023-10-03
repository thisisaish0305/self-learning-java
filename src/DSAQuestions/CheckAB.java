package DSAQuestions;

/*
* Base Cases:
End of String: Return true if input[startIndex] is '\0'.
Wrong Start: Return false if the first character is not 'a'.
Recursive Cases:
Following 'bb': If 'a' is followed by 'bb', recursively check the substring from startIndex + 3.
Following 'a' or End: Otherwise, recursively check the substring from startIndex + 1.
Function Call:
Start: In checkAB, initiate the recursive check from index 0.
By following these steps, your function will navigate through the string respecting the rules given.
*
* */


public class CheckAB {



    public static void main(String[] args) {

        int ans[][] = new int[2*10 + 2][];
        System.out.println(ans[0].length);
    }
}


