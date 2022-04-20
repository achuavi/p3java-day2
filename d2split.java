package p3java;

import java.util.Scanner;

public class d2split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.nextLine();
		for(String s:str.split(" ")) {
			System.out.println(s);
		}
		
	

	}

}
