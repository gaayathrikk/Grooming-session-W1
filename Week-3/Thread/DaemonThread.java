package Thread;

public class DaemonThread extends Thread{
    public DaemonThread(String name){
        super(name);
    }

    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println(getName() +" is Daemon thread");
        }else{
            System.out.println(getName() +" is User thread");
        }
    }

    public static void main(String[] args) {
        DaemonThread dth1 = new DaemonThread("thread-dth1");
        DaemonThread dth2 = new DaemonThread("thread-dth2");

        dth1.setDaemon(true);
        dth1.start();
        dth2.start();
    }
}
