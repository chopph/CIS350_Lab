package Chopp_350;

public class SimpleCalculator {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int  mul(int a, int b) {
		return a * b;
	}
	
	public int div(int a, int b) {
		return a / b;
	}
	
	public int exponent(int a, int b) {
		int rtn=1;
		
		for ( int i =0; i < b; i++) {
			rtn *= a;
		}
		
		return rtn;
		
	}
	
	public int absolute(int a) {
		int rtn;
		if(a<0) {
			rtn = a*=-1;
		}
		
		else {
			rtn = a;
		}
		
		return rtn;
		
	}
	
	
	public static final void main(String[] args) {
		System.out.println("Hey there CIS350.");
	}
	
}
