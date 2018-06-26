package src;

public class Character_occurence {

	 public static void main(String[] args) {
		
		 String s1="tangirala";
		 int[] count=new int[500];
		 
		 for(int i=0;i<s1.length();i++) {
			 count[s1.charAt(i)]++;
		 }
		 
		 char a[] = new char[s1.length()];
	        for (int i = 0; i < s1.length(); i++) {
	            a[i] = s1.charAt(i);
	            int find = 0;
	            for (int j = 0; j <= i; j++) {
	 
	                if (s1.charAt(i) == a[j]) 
	                    find++;                
	            }
	    if (find == 1) 
	                System.out.println("Number of Occurrence of " +
	                 s1.charAt(i) + " is:" + count[s1.charAt(i)]);            
	        }
	    }
	}

