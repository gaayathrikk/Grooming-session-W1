package Thread;

public class ClassLevelLock implements Runnable {

    public void run() { Lock(); }
 
    public static synchronized void Lock()
    {
        System.out.println(
            Thread.currentThread().getName());
 
        // class level lock
        synchronized (ClassLevelLock.class)
        {
            System.out.println(
                "in block "
                + Thread.currentThread().getName());
            System.out.println(
                "in block "
                + Thread.currentThread().getName()
                + " end");
        }
    }
 
    public static void main(String[] args)
    {
        ClassLevelLock g1 = new ClassLevelLock();
        
        Thread t1 = new Thread(g1);
 
        ClassLevelLock g2 = new ClassLevelLock();

        Thread t2 = new Thread(g1); 
 
        t1.setName("t1");
        t2.setName("t2");
 
        t1.start();
        t2.start();
    }
}
