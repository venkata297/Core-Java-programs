package src;

import java.util.Scanner;

public class String_reverse {
	
		
	public void c() {
		int [] a = new int[10];
		a=new int[20]; // dynamically increasing the size of the array
		
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
			String s1= "venkata";
			String s2="";
			for(int i=s1.length()-1;i>=0;i--) {
				s2=s2+s1.charAt(i);
			}
			System.out.println(s2);
	}
	

}
