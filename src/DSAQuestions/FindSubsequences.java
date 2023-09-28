package DSAQuestions;

/*
* I/P: "xyz" // n length string.
* O/P: ["", "x","xy","xz","xyz","y","yz","z"]
*
* Number of subsequences - 2^n ,just like power set.
* */

public class FindSubsequences {

    private static String[] findSubsequences(String str){
        if(str.length()==0){
            return new String[]{""};
        }

        String smallAns[] = findSubsequences(str.substring(1));
        String ans[] = new String[smallAns.length * 2];

        int k=0;
        for(int i=0; i< smallAns.length; i++){
            ans[k++]=smallAns[i];
        }
        for (int i=0; i< smallAns.length; i++){
            String subsequence = str.charAt(0) + smallAns[i];
            ans[k++]= subsequence;
        }
        return ans;
    }

    public static void main(String[] args) {
        String result[] = findSubsequences("xyz");
        for(String r:result){
            System.out.println(r);
        }
    }
}
