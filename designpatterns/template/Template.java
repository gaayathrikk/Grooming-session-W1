package designpatterns.template;

public class Template {
    public static void main(String[] args){
		Order orderInIndia = new OrderInIndia();
		orderInIndia.processOrder(true);
		System.out.println();
		Order interNationalOrder = new InterNationalOrder();
		interNationalOrder.processOrder(false);
	}
}
