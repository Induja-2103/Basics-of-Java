package ArrayPractice;

import java.util.Scanner;

public class TwoDArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String arr[][]=new String[3][2];
	for(int row=0;row<arr.length;row++) {
		for(int col=0;col<arr[row].length;col++) {
			
			arr[row][col]=sc.nextLine();
			}
	}
	
		for(int col=0;col<arr[col].length;col++) {
			for(int row=0;row<arr.length;row++) {
			System.out.println(arr[row][col]+ " ");
			
		}
			}
		for(int col=0;col<arr[col].length;col++) {
			for(int row=0;row<arr.length;row++) {
			System.out.print(arr[row][col]+ " ");
			
		}
			}
	 
}

}
