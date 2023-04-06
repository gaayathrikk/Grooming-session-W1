package Thread;

class InterruptThread extends Thread{
    public void run()
    {
        try {
            Thread.sleep(2000);
            System.out.println("Hello World!!");
        }
        catch (InterruptedException e) {
            throw new RuntimeException("Thread " +
                                    "interrupted");
        }
    }
    public static void main(String args[])
    {
        InterruptThread t1 = new InterruptThread();
        t1.start();
        try {
            t1.interrupt();
        }
        catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}
