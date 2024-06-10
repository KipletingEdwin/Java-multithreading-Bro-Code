//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        multithreading   =    Process of executing multiple threads simultaneously
        //                      Help maximum utilization of CPU
        //                      Threads are independent, they dont affect the execution of other threads
        //                      An exception in one thread will not interrupt other threads
        //                      Useful for serrving multiple clients, multiplayer games or other mutually independent tasks

        MyThread thread1 = new MyThread();

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.start();
        thread2.start();




    }
}