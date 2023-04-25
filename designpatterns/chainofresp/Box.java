package designpatterns.chainofresp;

abstract class Box {
    private Box nextBox;
    int number;

    public Box(Box nextBox) {
        this.nextBox = nextBox;
    };

    public void process(int num) {
        this.number = num;
        if (nextBox != null)
            nextBox.process(num);
    };
}

class NegativeBox extends Box {
    public NegativeBox(Box nextBox) {
        super(nextBox);

    }

    public void process(int num) {
        if (num < 0) {
            System.out.println("NegativeBox : " + num);
        } else {
            super.process(num);
        }
    }
}

class ZeroBox extends Box {
    public ZeroBox(Box nextBox) {
        super(nextBox);
    }

    public void process(int num) {
        if (num == 0) {
            System.out.println("ZeroBox : " + num);
        } else {
            super.process(num);
        }
    }
}

class PositiveBox extends Box {

    public PositiveBox(Box nextBox) {
        super(nextBox);
    }

    public void process(int num) {
        if (num > 0) {
            System.out.println("PositiveBox : " + num);
        } else {
            super.process(num);
        }
    }
}

