package Interface;
public class BoyFriend implements Girlfriend  {
	public static void main(String[] args) {
		Girlfriend Gf = new BoyFriend();//Dynamic Binding
		Gf.spendTime();
		Gf.voiceCall();
		Gf.shopping();
		Gf.moralSupport();
		Girlfriend.staticMethod();
	}	
	@Override
	public void spendTime() {
		System.out.println("Minimum spending time 2 hours daily");		
	}
	@Override
	public void voiceCall() {
		System.out.println("Twice a week for a hour");		
	}
	@Override
	public void shopping() {
		System.out.println("Twice a month");		
	}
	@Override
	public void moralSupport() {
		System.out.println("when if needed");		
	}
}
