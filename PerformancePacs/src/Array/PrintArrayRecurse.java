package Array;

public class PrintArrayRecurse {
	public static void printsys(int a) {
		if(a<=10) {
			System.out.println(a);
			printsys(a+1);
		}
		
	}
	public static void main(String[] args) {
		printsys(1);
	}
}
