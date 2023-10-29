package multithreading;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Runnable thread = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<5;i++){
                    System.out.println("count: "+i);
                }
            }
        };


            Thread t = new Thread(thread);
            t.start();

        Thread t1 = new Thread(thread);
        t1.start();

    }
}
