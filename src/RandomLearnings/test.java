package RandomLearnings;

public interface test {
    void print();
    class inner {
        int x=10, y=10;

        private inner(){
            this(5);
        }
        private inner(int x){
            this(x,10);
        }

        private inner(int x, int y){
            System.out.println("x: "+x +" y:"+y);
        }
    }

    public static void main(String[] args) {
        inner obj = new inner();
    }

}
