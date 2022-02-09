package review.day01;

import util.PrintUtil;
import util.SwapUtil;

// 버블 정렬 복습 20220209
public class Main_220209 {

	public static void main(String[] args) {
		
		int[] arr = {3, 5, 6, 2, 1, 4};
		
//		for(int i=0; i<arr.length; i++) {
//			
//			for(int j=0; j<arr.length-1; j++) {
//				if(arr[j] > arr[j + 1]) {
//					SwapUtil.swap(arr, j, j+1);
//				}
//			}
//			
//		}
//		
		
		bubbleSort(arr);
		
		PrintUtil.print(arr);
	}
	
	private static void bubbleSort(int[] arr) {
		bubbleSortAction(arr, arr.length-1);
	}
	
	private static void bubbleSortAction(int[] arr, int last) {
		if(last > 0) {
			for(int i=0; i< last; i++) {
				if(arr[i] > arr[i + 1]) {
					SwapUtil.swap(arr, i, i+1);
				}
			}
			bubbleSortAction(arr, last - 1 );
		}
	}
}
