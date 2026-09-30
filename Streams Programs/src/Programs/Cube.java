package Programs;

import java.util.Arrays;

public class Cube {
	public static void main(String args[]) {
		int[] arr = {2, 5, 3, 1, 8, 9, 20, 33};
		
		Arrays.sort(arr);
		
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		for(int i = arr.length-5; i < arr.length; i++) {
			
			System.out.println(Math.pow(arr[i], 3));
		}
	}
}
