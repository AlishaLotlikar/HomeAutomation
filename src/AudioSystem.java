import java.util.Scanner;

public class AudioSystem {
	int onFlag=1;
	int Avolume=0;
	
	public void turnOnTv(){
		onFlag=0;
		System.out.println("TV is Turned On");
	}
	public void turnOffAudio(){
		onFlag=1;
		System.out.println("TV is Turned Off");
	}
	public void volumeUp(){
		Avolume++;
		System.out.println("Volume: "+Avolume);
	}
	public void volumeDown(){
		Avolume--;
		System.out.println("Volume: "+Avolume);
	}

}
