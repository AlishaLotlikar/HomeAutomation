
public class tv {
	boolean flag;
	int volumeUp;
	int volumeDown;
	int channelUp;
	int channelDown;
	String response = null;
	public tv(boolean flag, int volumeUp, int volumeDown, int channelUp, int ch) {
		super();
		this.flag = flag;
		this.volumeUp = volumeUp;
		this.volumeDown = volumeDown;
		this.channelUp = channelUp;
		this.channelDown = channelDown;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public int getVolumeUp() {
		return volumeUp;
	}
	public void setVolumeUp(int volumeUp) {
		this.volumeUp = volumeUp;
	}
	public int getVolumeDown() {
		return volumeDown;
	}
	public void setVolumeDown(int volumeDown) {
		this.volumeDown = volumeDown;
	}
	public int getChannelUp() {
		return channelUp;
	}
	public void setChannelUp(int channelUp) {
		this.channelUp = channelUp;
	}
	public int getChannelDown() {
		return channelDown;
	}
	public void setChannelDown(int channelDown) {
		this.channelDown = channelDown;
	}
	 public boolean switchOnOff(boolean flag) {
		System.out.println("Turn lights on (y/n)?");
		 
	 }
	 public boolean putOff(boolean flag) {
			return flag=false;
			 
	}
	public int changeChannel(int channelUp,int channelDown) {
		System.out.println("Change channel up? (y/n)?");
		if(response=="y") 
			return channelUp;
		else
			return channelDown;
	}
}
