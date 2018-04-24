import java.util.Scanner;

public class tv {
	boolean flag;
	int volume;
	int channel;
	Scanner res=new Scanner(System.in);
	String response=res.next();
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	 public boolean switchOnOffTV() {
		System.out.println("Turn tv on (y/n)?");
		if(response=="y") {
			System.out.println("Tv is on");
			return flag=true;
		}
			
		else{
			System.out.println("Tv is off");
			return flag=false;
		}
		 
	 }
	
	public int changeChannel(int channel) {
		System.out.println("Change channel up? (y/n)?");
		if(response=="y") {
			channel++;
			System.out.println("channel increased");
			return channel;
		}
			
		else {
			channel--;
			System.out.println("channel decreased");
			return channel;
		}
			
	}
	
	public int changeVolume(int volume) {
		System.out.println("Change volume up? (y/n)?");
		if(response=="y") {
			volume++;
			System.out.println("Volume is increased");
			return volume;
		}
			
		else {
			volume--;
			System.out.println("Volume is decreased");
			return volume;
		}
			
	}
}
