import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String a,b;
	StringBuffer sb ;
	
	Scanner sc= new Scanner(System.in);
	a=sc.nextLine();
	sb = new StringBuffer(a);
	b=sb.reverse().toString();

	if(a.equals(b)) {
		System.out.println("is palindrome");
	}
	else {
		System.out.println("is not palindrome");
	}
}
}