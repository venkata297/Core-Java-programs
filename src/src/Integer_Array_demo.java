package src;

import java.util.Scanner;

public class Integer_Array_demo {
	
	public static int getSecondLargest(int total){  
		int d,e,temp;  
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the elements of first array:");
		d= s1.nextInt();
		int [] a = new int [d];
		Scanner s2 = new Scanner(System.in);
		System.out.println("enter the elements of second array:");
		e = s2.nextInt();
		int[] b = new int[e]; 
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < a.length; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-2];  
		}  

	public static void main(String[] args) {
		
		//int a[]={1,2,5,6,3,2};  
		//int b[]={44,66,99,77,33,22,55};  
		System.out.println("Second Largest: "+getSecondLargest(6));  
		System.out.println("Second Largest: "+getSecondLargest(7));  
		
		}

}
