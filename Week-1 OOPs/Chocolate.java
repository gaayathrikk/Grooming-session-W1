enum Chocolate{
    DAIRYMILK(10,75.5), KITKAT(15,20.0), TOBLERONE(30,110.0),  SNICKER(20,40.0);
    private int count;
    private Double price;

    public int getCount(){
        return this.count;
    }

    public Double getPrice(){
        return this.price;
    }
    // private constructor with 2 arguments
    private Chocolate(int count,Double price){
        this.count = count;
        this.price = price;
    }
}

class Enummain{
    public static void main(String[] args) {
        Chocolate[] chocolates = Chocolate.values();

        for(Chocolate chocolate : chocolates){
            System.out.println("The shop stocks " + chocolate.getCount() +" "+chocolate.name() +" which costs " + chocolate.getPrice());
        }
    }
}