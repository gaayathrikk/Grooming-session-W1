package Thread;

class ThreadPriority extends Thread{
        public void run()
        {
            System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());
        }
        public static void main(String[] args)
        {
            ThreadClass th1 = new ThreadClass();
            th1.setPriority(Thread.MAX_PRIORITY);
            th1.start();
        }
    }    