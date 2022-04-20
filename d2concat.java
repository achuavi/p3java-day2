package p3java;

import java.util.Scanner;

public class d2concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,str1;
		String s1="CMRIT";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.next();
		str1=str.concat(s1);
		System.out.println("The String is\t"+str1);
	}

}
