import java.util.Scanner;

public class PalindromeString1 {

	public static void main(String[] args) {
		String original,reverse ="";
		
		Scanner sc= new Scanner(System.in);
		original = sc.nextLine();
		
		 int lenght =original.length();
		 
		 for(int i= lenght-1 ; i>=0 ;i--) {
			 reverse = reverse + original.charAt(i);
		 }
		 System.out.println(reverse);
		 if(original.equals(reverse)) {
			 System.out.println("String is palindrome");
		 }
		 else {
			 System.out.println("String is not palindrome"); 
			 
		 }
	}

}
