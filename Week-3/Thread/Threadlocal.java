package Thread;

public class Threadlocal {
	public static void main(String[] args)
	{
		ThreadLocal<Number> tc1 = new ThreadLocal<Number>();
		ThreadLocal<String> tc2 = new ThreadLocal<String>();

		tc1.set(100);
		System.out.println("value = " + tc1.get());
		tc1.set(90);
		System.out.println("value = " + tc1.get());
		tc1.set(88.45);
		System.out.println("value = " + tc1.get());

		tc2.set("Hello");
		System.out.println("value = " + tc2.get());

        tc1.remove();
        System.out.println("value = " + tc1.get());
	}
}

