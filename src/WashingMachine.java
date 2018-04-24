import java.util.Scanner;

public class WashingMachine {
	boolean flag;
	String drier;
	String washer;
	Scanner res= new Scanner(System.in);
	public WashingMachine(boolean flag, String drier, String washer) {
		super();
		this.flag = flag;
		this.drier = drier;
		this.washer = washer;
	}
	String response=res.nextLine();
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getDrier() {
		return drier;
	}
	public void setDrier(String drier) {
		this.drier = drier;
	}
	public String getWasher() {
		return washer;
	}
	public void setWasher(String washer) {
		this.washer = washer;
	}
	
	public boolean switchOnOffWM(boolean flag) {
		System.out.println("Turn washing machine on (y/n)?");
		
		if(response=="y") {		
			System.out.println("Washing machine is turned on");
			return flag=true;
		}
		else {		
			System.out.println("Washing machine is off");
			return flag=false;
		}
		 
	 }
	
	public String startDrier() {
		Scanner dry=new Scanner(System.in);
		String input=dry.nextLine();
		System.out.println("Start drier? (y/n)?");
		if(input=="y") {
			System.out.println("Drier is on");
			return drier;
		}
		else {
			System.out.println("Drier is off");
			return drier;
		}
			
	}
	public String startWasher() {
		Scanner wash=new Scanner(System.in);
		String input=wash.nextLine();
		System.out.println("Start washer? (y/n)?");
		if(input=="y") {
			System.out.println("washer is on");
			return washer;
		}
		else {
			System.out.println("washer is off");
			return washer;
		}
			
	}
}
