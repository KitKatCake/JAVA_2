package Thrd;

public class MyRunnableMain {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();

        try{
            Thread.sleep(1L*1000L);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        MyRunnable myRunnable = null;
        myRunnable.doStop();

    }
}
