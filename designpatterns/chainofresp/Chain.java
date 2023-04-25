package designpatterns.chainofresp;

public class Chain {
    Box chain;

    public Chain() {
        buildChain();
    }

    private void buildChain() {
        chain = new NegativeBox(new ZeroBox(new PositiveBox(null)));
    }

    public void process(int num) {
        chain.process(num);
    }

}
