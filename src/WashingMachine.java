import java.util.Scanner;

public class WashingMachine {
	int onFlag=1;
	int washer=0;
	int drier=0;
	
	public void turnOnWM(){
		onFlag=0;
		System.out.println("Washing Machine is Turned On");
	}
	public void turnOffWM(){
		onFlag=1;
		System.out.println("Washing Machine is Turned On");
	}
	public void washerOn(){
		washer=1;
		System.out.println("Washer is on");
	}
	public void washeroff(){
		washer=0;
		System.out.println("Washer is off");
	}
	public void drierOn(){
		drier=1;
		System.out.println("Drier is on");
	}
	public void drierOff(){
		drier=1;
		System.out.println("Drier is off");
	}

}
