package org.college;

public class College {
	
	public void collegeName() {
		System.out.println("VIT");
	}
	public void collegeCode() {
		System.out.println(9132);
	}
	public void collegeRank() {
		System.out.println(5);
	}
	public static void main(String[] args) {
		College clgDetails = new College();
		clgDetails.collegeName();
		clgDetails.collegeCode();
		clgDetails.collegeRank();
	}

}
