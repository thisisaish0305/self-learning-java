package RandomLearnings;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer data : ");
        int x = sc.nextInt();
        System.out.println(x);
        System.out.println("Enter the string : ");
        //sc.nextLine(); // This line you have to add (It consumes the   \n character)
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println("Enter the second string : ");
        String str2 = sc.nextLine();
        System.out.println(str2);
    }
}