package ArrayPractice;

public class ArraySort {
public static void main(String[] args) {
	int arr[]= {4,7,3,1,5,2};
	int n=arr.length;
	int t;
	for(int i=0;i<n-1;i++) {
		int min=i;
		for(int j=i+1;j<n;j++) {
			if(arr[min]>arr[j]) {
				min=j;
			}
		}
		if(min!=i) {
		t=arr[i];
		arr[i]=arr[min];
		arr[min]=t;
		}
		
	}
	for(int i=0;i<n;i++) {
	System.out.print(" " +arr[i] );
	}
}
}
