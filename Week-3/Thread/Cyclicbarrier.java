package Thread;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;

public class Cyclicbarrier {
    public static void main(String args[]) {
        
        CyclicBarrier cb = new CyclicBarrier(3, new Action());
        
        Thread t1 = new Thread(new Computation("thread-1", "file-1", cb));
        Thread t2 = new Thread(new Computation("thread-2", "file-2", cb));
        Thread t3 = new Thread(new Computation("thread-3", "file-3", cb));
       
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Done ");
    }
}

class Computation implements Runnable {
    private String threadName;
    private String fileName;
    private CyclicBarrier cb;

    Computation(String threadName, String fileName, CyclicBarrier cb) {
        this.threadName = threadName;
        this.fileName = fileName;
        this.cb = cb;
    }

    @Override
    public void run() {
        System.out.println("Reading file " + fileName + " thread " + threadName);
        try {
            // calling await() so the current thread may suspends
            cb.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        } catch (BrokenBarrierException e) {
            System.out.println(e);
        }
    }
}

class Action implements Runnable {
    @Override
    public void run() {
        System.out.println("In action class, start further processing as all files are read");
    }
}