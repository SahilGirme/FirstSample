import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
	
		int num,sum=0, n;
		
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		
		while(num>0) {
			n=num%10;
			num=num/10;
			sum=(sum*10)+n;
		}
		System.out.println(sum);

	}

}
