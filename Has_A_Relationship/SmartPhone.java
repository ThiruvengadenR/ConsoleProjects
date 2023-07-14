package Has_A_Relationship;

public class SmartPhone implements Mobile{
	
	static WhatsApp whatsObj ;
	
	SmartPhone()
	{
		System.out.println("Default constructor for SmartPhone");
	}
	
	SmartPhone(WhatsApp whatsObj)
	{
		SmartPhone.whatsObj = whatsObj;
	}

	public static void main(String[] args) {
		Mobile nokia = new SmartPhone(); // Dynamic binding 
		nokia.call();
		nokia.sendMsg();
		nokia.basisApp();
		SmartPhone vivo = new SmartPhone(new WhatsApp());
		vivo.whatsObj.viedoCall();
		
		
		

	}

	@Override
	public void call() {
		System.out.println("You can call any one Inside India");
	}

	@Override
	public void sendMsg() {
		System.out.println("You can send msg any one Inside India");
	}

	@Override
	public void basisApp() {
		System.out.println("Calculator , Alarm Clock are some Basic app");
		
	}
	
	void googleMap() {
		System.out.println("you can search any location using googleMaps");
	}

}
