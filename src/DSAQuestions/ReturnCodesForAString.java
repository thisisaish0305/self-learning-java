package DSAQuestions;

public class ReturnCodesForAString {

        private static char getLetter(int num){ // TODO : convert return type to string.
                int a = 'a'+num-1;
                char letter = (char)a;
                return letter;
        }

        // Return a string array that contains all possible codes
        public static String[] getCode(String input) {
            // Write your code here
             if(input.length()==0){
                 String[] s= new String[1];
                 s[0]="";
                 return s;
             }

             if(input.length()==1){
                     int num = input.charAt(0) -'0';
                     char c = getLetter(num);
                     String s = ""+c;
                     String str[]= new String[1];
                     str[0] =s;
                     return str;
             }

             String[] smallAns1 = getCode(input.substring(1));
            int firstDigit = input.charAt(0) - '0';
            char letter = getLetter(firstDigit);
            for(int i=0; i<smallAns1.length;i++){
                smallAns1[i] = letter + smallAns1[i];
            }

            String[] smallAns2 = new String[0]; // important line - for initialization.

            if(input.length()>=2) {
                int secondDigit = input.charAt(1) - '0';
                int num = (firstDigit*10) + secondDigit;

                if(num>=10 && num<=26) {
                    char letter2 = getLetter(num);
                    String letterStr = "" + letter2;
                    smallAns2 = getCode(input.substring(2));
                    for(int i=0; i< smallAns2.length;i++){
                        smallAns2[i] = letterStr + smallAns2[i];
                    }
                }
             }

             String[] ans = new String[smallAns1.length + smallAns2.length];
             int k=0;
             for(int i=0; i< smallAns1.length;i++){
                 ans[k++]=smallAns1[i];
             }

             for(int i=0; i< smallAns2.length;i++){
                 ans[k++] = smallAns2[i];
             }

             return ans;
        }


        public static void main(String[] args) {
        /*   String[] s = new String[]{""};
            System.out.println(s.length);
            System.out.println(s[0].length());
            String a="test"+s[0];
            System.out.println(a.length());

            String[] st= new String[1];
            st[0]=""; String str = "abc";
            System.out.println(str+st[0]);
            System.out.println(st[0].length()); */

                String[] ans = getCode("789");
                for(String a:ans){
                        System.out.println(a);
                }

        }



}
