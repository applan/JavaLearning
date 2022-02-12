package review.day02;

import util.PrintUtil;
import util.SwapUtil;

// 선택 정렬
public class Main_220212 {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 6, 5, 4, 7, 2};
		
//		for(int i=0; i<arr.length-1; i++) {
//			int minIndex = i;
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[minIndex] > arr[j]) {
//					minIndex = j;
//				}
//			}
//			SwapUtil.swap(arr, i, minIndex);
//		}
		
		sectionSort(arr);
		
		PrintUtil.print(arr);
	}
	
	private static void sectionSort(int[] arr) {
		sectionSortAction(arr, 0);
	}
	
	private static void sectionSortAction(int[] arr, int start) {
		if(start < arr.length) {
			int minIndex = start;
			for(int i=start + 1; i<arr.length; i++) {
				if(arr[minIndex] > arr[i]) {
					minIndex = i;
				}
			}
			SwapUtil.swap(arr, minIndex, start);
			sectionSortAction(arr, start + 1);
		}
	}
}
