package Thrd;

public class MyRunnable implements Runnable {
    public boolean doStop = false;
    @Override
    public void run() {
        while(keepRunning()){
            System.out.println("Running");
        }
        try{
           Thread.sleep(3L*1000L);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public synchronized void doStop(){
        this.doStop = true;
    }
    public synchronized boolean keepRunning(){
        return this.doStop == false;
    }
}
