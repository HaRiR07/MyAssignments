package org.students;

public class Students {
	
	public void getStudentInfo(long id) {
		System.out.println(id);
	}
	public void getStudentInfo(String name , long id) {
		System.out.println(name);
		System.out.println(id);
	}
	public void getStudentInfo( long number , String email) {
		System.out.println(number);
		System.out.println(email);
	}
	public static void main(String[] args) {
		Students info = new Students();
		info.getStudentInfo(913218114006L);
		info.getStudentInfo( "Hari" , 913218114006L);
		info.getStudentInfo(8838077003L , "hariprakashrajaram@gmail.com" );
		
	}

}
