package week1.day1;

public class Car {
	public void openDoor() {
		System.out.println("open the door");
	}
	public void starEngine() {
		System.out.println("start the engine");
	}
	public void wearSeatbelt() {
		System.out.println("wear the seatbelt");
	}
	public void putGear() {
		System.out.println("put the first gear");
	}
	public void adjustMirror() {
		System.out.println("adjust the side mirrors");
	}
	public void fillFuel() {
		System.out.println("fill up fuel");
	}
	public void switchOnAc() {
		System.out.println("switch on the AC");
	}
	public void playMusic() {
		System.out.println("play any music");
	}
public static void main(String[] args) {
	Car polo=new Car();
	polo.openDoor();
	polo.starEngine();
	polo.wearSeatbelt();
	polo.putGear();
	polo.adjustMirror();
	polo.fillFuel();
	polo.switchOnAc();
	polo.playMusic();
	}	
}
