package designpatterns.template;

abstract class Order{
	public boolean isSubscriber;
	public abstract void doSelect();
	public abstract void doPayment();

	public final void Subscriber(){
		try{
			System.out.println("You are a Subscriber");
		}
		catch (Exception e){
			System.out.println("Please undergo the following process to subscribe the platform");
		}
	}

	public abstract void doDelivery();

	public final void processOrder(boolean isSubscriber){
		doSelect();
		doPayment();
		if (isSubscriber) {
			Subscriber();
		}
		doDelivery();
	}
}


class OrderInIndia extends Order{
	@Override
	public void doSelect(){
		System.out.println("Add items to cart");
	}

	@Override
	public void doPayment(){
		System.out.println("Payment successfull");
	}

	@Override
	public void doDelivery(){
		System.out.println("Will be delivered within 10 days. If you are a subscriber within 5days");
	}
}

class InterNationalOrder extends Order{
	@Override
	public void doSelect(){
		System.out.println("Add items to cart");
	}

	@Override
	public void doPayment(){
		System.out.println("Payment along with additional charges");
	}

	@Override
	public void doDelivery(){
		System.out.println("Will be delivered within 15 days. If you are a subscriber within 7 days");
	}
}