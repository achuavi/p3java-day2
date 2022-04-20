package p3java;

import java.util.Scanner;

public class d2strlength {

	public static void main(String[] args) {
		int len=0;
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.next();
		System.out.println("The String length using bf is\t"+str.length());
		len=strlen(str);
		System.out.println("The String length using udf is\t"+len);
	}

	private static int strlen(String str) {
		// TODO Auto-generated method stub
		char a[]=new char[10];
		int i,l=0;
		a=str.toCharArray();
		for(char c:a)
		{
		l++;
		}
		
		return l;
	}

}
