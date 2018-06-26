package src;

public class Characters_capital {
	
	public static void main(String[] args) {
		
		String st = "venkata";
		for (int i=0;i<st.length();i++) {
			char ci= st.charAt(i);
			if(i%2==0) {
			System.out.print(Character.toLowerCase(ci));
			}else
			System.out.print(Character.toUpperCase(ci));
			}
		}
	}



