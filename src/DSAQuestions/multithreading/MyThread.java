package DSAQuestions.multithreading;

public class MyThread extends Thread {

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("In the run of :"+ Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            dbProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("In the end of :"+ Thread.currentThread().getName());
    }

    private void dbProcessing() throws InterruptedException {
        Thread.sleep(2000);
    }
}
