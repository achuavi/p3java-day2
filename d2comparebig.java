package p3java;

import java.util.Scanner;

public class d2comparebig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string1");
		str1=sc.next();
		System.out.println("Enter the string2");
		str2=sc.next();
		int result=str1.compareTo(str2);
		if(result>0) {
			System.out.println("The String1\t"+str1+"is grrater");
		}
		else if (result<0) {
			System.out.println("The String2\t"+str2+"is grrater");
		}
		else {
			System.out.println("The Strings are equal");
		}
		
	}

}
