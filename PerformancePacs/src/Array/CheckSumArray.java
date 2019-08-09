package Array;

import java.util.Arrays;

public class CheckSumArray {

     public static void main(String []args){
        int arr[]= {1,2,3,4,5,6,7,8,9,10};
        int key=20;
        
        for(int i=0; i< arr.length;i++) {
        	int t=key-arr[i];
        	if(Arrays.stream(arr).anyMatch(item ->item==t)) {
        		System.out.println("pair"+t+""+arr[i]);
        	}
        }
		
     }
     
}