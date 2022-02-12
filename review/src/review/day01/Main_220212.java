package review.day01;

import util.PrintUtil;
import util.SwapUtil;

// 버블 정렬
public class Main_220212 {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 6, 5, 4, 7, 2};
		
		
//		for(int i=0; i<arr.length - 1; i++) {
//			for(int j=0; j<arr.length -(1+i); j++) {
//				if(arr[j] > arr[j+1]) {
//					SwapUtil.swap(arr, j, j+1);
//				}
//			}
//		}
		
		bubbleSort(arr);
		
		PrintUtil.print(arr);
	}
	
	private static void bubbleSort(int[] arr) {
		bubbleSortAction(arr, arr.length - 1);
	}
	
	private static void bubbleSortAction(int[] arr, int last) {
		if(last > 0) {
			for(int i=0; i<last; i++) {
				if(arr[i] > arr[i+1]) {
					SwapUtil.swap(arr, i, i+1);
				}
			}
			bubbleSortAction(arr, last - 1);
		}
	}
}
