package designpatterns.chainofresp;

public class Maain {
    public static void main(String[] args) {
        Chain chain = new Chain();
        chain.process(6);
        chain.process(-10);
        chain.process(0);
        chain.process(1);
    }
}
