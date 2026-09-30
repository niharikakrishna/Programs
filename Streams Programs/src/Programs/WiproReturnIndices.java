package Programs;

/*Return two indices in an array of integers that add up to a specific target*/


import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;

public class WiproReturnIndices {
	
	public static int[] SumCheck(int[] arr, int target) {
		int[] arrSum = new int[2];
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					arrSum[0] = i;
					arrSum[1] = j;
				}
			}
		}
		return arrSum;
		
//		Map<Integer,Integer> map = new HashMap<>();
//		
//		for(int i=0; i<arr.length; i++) {
//			int balance = target - arr[i];
//			if(map.containsKey(balance)) {
//				return new int[]{map.get(balance), i};
//			}
//		}
//		return new int[]{};
	}
	
	
	public static void main(String args[]) {
		int[] arr = {2,1,7,3};
		int target = 9;
		
		int[] sumArray = SumCheck(arr, target);
		
//		for(int element:sumArray)
			System.out.println(Arrays.toString(sumArray));
	}
}