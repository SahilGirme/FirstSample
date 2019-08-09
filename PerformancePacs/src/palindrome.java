import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
	int num,sum,i,n;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	i=num;
	sum=0;
	while(num>0) {
		n=num%10;
		num=num/10;
		sum=(sum*10)+n;
	}
	System.out.println(sum);
	if(i==sum) {
		System.out.println("number is palindrome");
	}
	else {
		System.out.println("number is not palindrome");
	}
	}
}


