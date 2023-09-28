package DSAQuestions;

public class TowerOfHanoi {
    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
            // Write your code here
            if(disks==0){
                return;
            }

            towerOfHanoi(disks-1, source, destination, auxiliary);
            System.out.println(source + " " + destination);
            towerOfHanoi(disks-1, auxiliary, source, destination);

    }

    public static void main(String[] args) {
        towerOfHanoi(2,'a','b','c');
    }
}

