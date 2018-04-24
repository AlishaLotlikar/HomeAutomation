
public class HasPanel {
	Object[][] arr = new Object[6][2];
	int devices=0;

	public void addtv(){
		arr[devices][0]=new tv();
		devices++;
	}
	public void addAC(){
		arr[devices][0]=new AC();
		devices++;
	}
	public void addlights(){
		arr[devices][0]=new lights();
		devices++;
	}
	public void addAudioSystem(){
		arr[devices][0]=new AudioSystem();
		devices++;
	}
	
	public void addWashingMachine(){
		arr[devices][0]=new WashingMachine();
		devices++;
	}
	public void displayDevices() {
		System.out.println("Device:Lights");
		System.out.println("Device:TV ");
		System.out.println("Device:AC ");
		System.out.println("Device:AudioSystem");
		System.out.println("Device:Washing Machine");
	}
}
