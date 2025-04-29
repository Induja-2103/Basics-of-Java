package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueElements {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("No of elements:");
	int n=sc.nextInt();
	int arr[]=new int[n];
	
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		}
	Arrays.sort(arr);
	
	if(arr[0]!=arr[1]) {
	System.out.println(arr[0]);	
	}
	for(int i=1;i<n-1;i++) {
		if(arr[i-1]!=arr[i] && arr[i+1]!=arr[i]) {
			System.out.println(arr[i]+"");
		}
	}
	if(arr[n-1]!=arr[n-2]) {
		System.out.println(arr[n-1]);
	}
	
}
}
