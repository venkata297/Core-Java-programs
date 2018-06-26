package src;

public class MethodOverload_demo {
	
public void A1() {
		
		System.out.println("hi");
		}
	public double A1(int a , int b) {
		double c = (int) (a+b);
		return c;
	}
	public float A1(int d,float e) {
		float t = d*e;
		return t;
	}
	public static void main(String[] args) {
		MethodOverload_demo d1 = new MethodOverload_demo();
		System.out.println(d1.A1(23, 230));
		d1.A1();
		System.out.println(d1.A1(5,52));
	}

}
