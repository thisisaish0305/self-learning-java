package DSAQuestions;

public class RotateCheck {


        public static int arrayRotateCheck(int[] arr){
            //Your code goes here
            int i=0;
            int k=0;

            while(i+1<arr.length && arr[i]<=arr[i+1]) {
                k++; i++;
            }

            if(k+1==arr.length){
                return 0;
            } else{
                return k+1;
            }
        }

    }
