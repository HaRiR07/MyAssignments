package week1.day2;

public class TwoWheeler {
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=354756986845L;
	boolean isPunctured=false;
	double runningKm=75456.35;
	String bikeName="Himalayan400";
			
	public static void main(String[] args) {
		TwoWheeler Himalayan400=new TwoWheeler();
		System.out.println(Himalayan400.noOfWheels);
		System.out.println(Himalayan400.noOfMirrors);
		System.out.println(Himalayan400.chassisNumber);
		System.out.println(Himalayan400.isPunctured);
		System.out.println(Himalayan400.runningKm);
		System.out.println(Himalayan400.bikeName);
		
	}

}
