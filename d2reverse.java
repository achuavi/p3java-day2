package p3java;

import java.util.Scanner;

public class d2reverse {

	public static void main(String[] args) {
		String str,str1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.next();
		reverse(str);
	}

	private static void reverse(String str) {
		// TODO Auto-generated method stub
		int i,j;
		char a[]=new char[str.length()];
		char rev[]=new char[str.length()+1];
		
		a=str.toCharArray();
		for(i=0,j=str.length()-1;i<str.length() && j>=0;i++,j--) {
			rev[i]=a[j];
		}
		rev[i]='\0';
		
		System.out.println(rev);
		
	}

}
