package ArrayPractice;
import java.util.*;
public class Array1 {
public static void main(String[] args) {
	int arr[]= {1,4,8,9,6,98};
	int arr1[]=new int[5];
	arr1[0]=45;
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++) {
	System.out.print(" "+arr[i]);
	}
}
}
