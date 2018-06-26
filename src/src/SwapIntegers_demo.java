package src;

import java.util.Scanner;

public class SwapIntegers_demo {
	
	public static void swap() {
		int temp;
		int a,b;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of a" );
		a=s1.nextInt();
		
		Scanner s2=new Scanner(System.in);
		System.out.println("enter the value of b" );
		b=s2.nextInt();
		
		 temp = a;
		 a = b;
		 b = temp;
		 System.out.println(a);
		 System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		
		SwapIntegers_demo.swap();
	}

}
