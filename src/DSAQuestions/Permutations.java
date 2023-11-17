package DSAQuestions;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    static List<String> getPermutations(String str){
        if(str.length()==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(str);
            return list;
        }

        List<String> ans = new ArrayList<>();
        for(int i=0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String smallStr = str.substring(0,i);

            if(i+1 < str.length()){
                smallStr += str.substring(i+1);
            }
            List<String>smallAns = getPermutations(smallStr);

            for(int j=0; j< smallAns.size(); j++){
                    String s = smallAns.get(j);
                    String onePermutation = "" + ch;
                    onePermutation += s;
                    ans.add(onePermutation);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        List<String> ans = getPermutations("abc");
        for(String s: ans){
            System.out.println(s +" ");
        }
    }
}
