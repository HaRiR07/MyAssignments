package week1.day2;

public class Mobile {
	String mobileBrandName="Samsung";
	char mobileLogo='S';
	short noOfMobilePiece=2;
	int modelNumber=2725;
	long mobileImeiNumber=978549632156L;
	float mobilePrice=18500.75F;
	boolean isDamaged=false;
	
	public static void main(String[] args) {
		Mobile samsung=new Mobile();
		System.out.println(samsung.mobileBrandName);
		System.out.println(samsung.mobileLogo);
		System.out.println(samsung.noOfMobilePiece);
		System.out.println(samsung.modelNumber);
		System.out.println(samsung.mobileImeiNumber);
		System.out.println(samsung.mobilePrice);
		System.out.println(samsung.isDamaged);
	}
}
 