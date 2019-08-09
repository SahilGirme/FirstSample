package Array;

import java.util.Arrays;

public class SecondHighestElement {
public static int secondLargestValue(int a[],int total) {
	Arrays.sort(a);
	return a[total-2];
}
public static void main(String[] args) {
	int a[]= {10,2,0,5,0,60,30,5,6,955,6,236,4,5,1,548,4,845,184,85,548,454,84,5};
	
	int length = a.length;
	System.out.println(length);
	System.out.println(secondLargestValue(a, 24));
}
}
