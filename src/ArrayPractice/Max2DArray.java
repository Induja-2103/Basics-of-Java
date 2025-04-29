package ArrayPractice;

public class Max2DArray {
public static void main(String[] args) {
	int arr[][]= {{5,7,15,2},{9,7,5,9}};
	for(int k=0;k<arr.length;k++) {
		int max=arr[k][0];
	for(int i=1;i<arr[k].length;i++) {
		if(arr[k][i]>max) {
			max=arr[k][i];
		}
	}
	System.out.println("Maximum element in row"+k+"is:"+max);
	}
}
}
