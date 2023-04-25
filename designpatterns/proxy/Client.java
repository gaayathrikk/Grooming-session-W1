package designpatterns.proxy;

public class Client {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("abcd.org");
            internet.connectTo("xyz.com");
            internet.connectTo("abc.com");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
