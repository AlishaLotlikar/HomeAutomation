import java.util.Scanner;

public class tv {

		int onFlag=1;
		int channel=0;
		int volume=0;
		
		public void turnOnTv(){
			onFlag=0;
			System.out.println("TV is Turned On");
		}
		public void turnOffTv(){
			onFlag=1;
			System.out.println("TV is Turned Off");
		}
		public void channelUp(){
			channel++;
			System.out.println("Channel: "+channel);
		}
		public void channelDown(){
			channel--;
			System.out.println("Channel: "+channel);
		}
		public void volumeUp(){
			volume++;
			System.out.println("Volume: "+volume);
		}
		public void volumeDown(){
			volume--;
			System.out.println("Volume: "+volume);
		}

}
