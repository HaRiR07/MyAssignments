package week1.day1;

public class Mobile {
	public void unlock() {
		System.out.println("unlock the mobile");
	}
	public void makeCall() {
		System.out.println("make a call");
	}
	public void takePicture() {
		System.out.println("take a picture");
	}
	public void playMusic() {
		System.out.println("play any music");
	}
	public void watchVideo() {
		System.out.println("watch some video");
	}
public static void main(String[] args) {
	Mobile realme=new Mobile();
	realme.unlock();
	realme.makeCall();
	realme.takePicture();
	realme.playMusic();
	realme.watchVideo();
	}
	
}
