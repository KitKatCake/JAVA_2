package Thrd;

public class Main {
    public static void main(String[] args) {
//        Thread thread = new Thread(){
//            public void run(){
//                System.out.println("Thread Running");
//            }
//        };
   //     thread.run();



//        ThreadDemo threadDemo = new ThreadDemo();
//        threadDemo.start();



//      Runnable runnable = new Runnable() {
//          @Override
//          public void run() {
//              System.out.println("Thread2 running!");
//          }
//      };
//        runnable.run();






       // ThreadDemo2 threadDemo2 = new ThreadDemo2();

//        Runnable threadDemo2 = new ThreadDemo2();
//
//        Thread thread = new Thread(threadDemo2);




//        Thread thread = new Thread(new ThreadDemo2());
//
//        thread.run();
//
//        thread.start();





        Thread thread2 = new Thread("New Thread") {
            public void run(){
                System.out.println("run by: " + getName());
            }
        };


        thread2.start();

        System.out.println(thread2.getName());



        Runnable runnable2 = new ThreadDemo2();

        Thread thread3 = new Thread(runnable2,"Another Thread");


        thread3.start();

        System.out.println(thread3.getName());

        String threadName = Thread.currentThread().getName();

        System.out.println(threadName);









//        Runnable runnable = ()->{
//            System.out.println("Starting Thread!");
//        };
//        runnable.run();


    }
}
