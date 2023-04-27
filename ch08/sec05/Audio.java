package ch08.sec05;

public class Audio implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("오디오 킴");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("오디오 끔");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: "+volume);
	}
	
	
}
