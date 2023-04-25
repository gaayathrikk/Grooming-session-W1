package designpatterns.state;

public interface MobileAlertState {
    public void alert(AlertStateContext ctx);
}

class Vibration implements MobileAlertState {
	@Override public void alert(AlertStateContext ctx)
	{
		System.out.println(" vibration...");
	}
}

class Silent implements MobileAlertState {
	@Override public void alert(AlertStateContext ctx)
	{
		System.out.println(" silent...");
	}
}