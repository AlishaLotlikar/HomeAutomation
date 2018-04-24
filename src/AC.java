import java.util.Scanner;

public class AC {
	int onFlag=1;
	int temperature=30;
	
	public void turnOn(){
		onFlag=0;
		System.out.println("AC is Turned On");
	}
	public void turnOff(){
		onFlag=1;
		System.out.println("AC is Turned On");
	}
	public void tempIncrease(){
		temperature++;
		System.out.println("Temperature: "+temperature);
	}
	public void tempDecrease(){
		temperature--;
		System.out.println("Temperature: "+temperature);
	}

}
