
public class lights {
	boolean flag;
	String response;

	public boolean SwitchOnOffLights(boolean flag){
		System.out.println("Turn lights on(y/n)?");
		if(response=="y") {
			System.out.println("lights are on");
			return flag=true;
		}
		else {
			System.out.println("lights are off");
			return flag=false;
		}
			
	}
}
