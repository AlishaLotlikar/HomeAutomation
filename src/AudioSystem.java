import java.util.Scanner;

public class AudioSystem {
	boolean flag;
	int Avolume;
	Scanner res= new Scanner(System.in);
	String response=res.nextLine();
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public int getAvolume() {
		return Avolume;
	}
	public void setAvolume(int Avolume) {
		this.Avolume = Avolume;
	}
	public AudioSystem(boolean flag, int Avolume) {
		super();
		this.flag = flag;
		this.Avolume = Avolume;
	}
	 public boolean switchOnOffTV(boolean flag) {
		System.out.println("Turn Audio System on (y/n)?");
		if(response=="y") {
			System.out.println("Audio System is on");
			return flag=true;
		}
			
		else {
			System.out.println("Audio System is off");
			return flag=false;
		}	 
	 }

	
	public int changeAudioVolume(int Avolume) {
		System.out.println("Change volume up? (y/n)?");
		if(response=="y") {
			Avolume++;
			System.out.println("Volume is increased");
			return Avolume;
		}
			
		else {
			Avolume--;
			System.out.println("Volume is decreased");
			return Avolume;
		}
			
	}
}
