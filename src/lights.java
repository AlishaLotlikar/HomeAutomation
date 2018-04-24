
public class lights {
	int onFlag=1;
	
	public void turnOnLights(){
		onFlag=0;
		System.out.println("Light is Turned On");
	}
	public void turnOffLights(){
		onFlag=1;
		System.out.println("Light is Turned Off");
	}
			
}
