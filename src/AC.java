import java.util.Scanner;

public class AC {
	boolean flag;
	int temperature;
	Scanner res= new Scanner(System.in);
	String response=res.nextLine();
	public boolean switchOnOffAC() {
		System.out.println("Turn AC on (y/n)?");
		
		if(response=="y") {
			System.out.println("Ac is on");
			return flag=true;
		}
			
		else {
			System.out.println("Ac is off");
			return flag=false;
		}
		 
	 }
	
	public int changeTemperature(int temperature) {
		System.out.println("Change temperature up? (y/n)?");
		if(response=="y") {
			temperature++;
			return temperature;
		}
		else {
			temperature--;
			return temperature;
		}
			
	}
}
