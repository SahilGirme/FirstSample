import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int num,sum,i=1,n;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		i=num;
		sum=0;
		
		while(num>0) {
			n=num%10;
			num=num/10;
			sum=sum+(n*n*n);
		}
		if(sum==i) {
			System.out.println("number is armstrong");
		}
		else {
			System.out.println("number is not armstrong");
		}
		
	}
}
