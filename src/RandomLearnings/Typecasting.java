package RandomLearnings;

public class Typecasting {

    public static void main(String[] args) {
//        int i=1;
//        char ch = (char) (i +'0');
//        System.out.println(ch);

        String str = "";
        for(int i=1; i<5; i++){
            char ch = (char) (i+'0');
            str+= ch;
        }
        System.out.println("String is "+str);

        //String to int
        String num = "576";
        int no = 0;
        for(int i=0; i < num.length(); i++) {
            char ch = num.charAt(i);
            int n = ch-'0';
            System.out.println(n);
            no = (no * 10) + n;
        }
        System.out.println("Number is "+ no);


    }
}
