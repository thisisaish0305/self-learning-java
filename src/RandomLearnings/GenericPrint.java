package RandomLearnings;

public class GenericPrint {

    private static<T> void print(T a[]){
        for(int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4};
        print(arr);

        String[] strs = {"abc", "def", "ghi"};
        print(strs);

    }
}
