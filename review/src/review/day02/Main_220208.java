package review.day02;

import util.PrintUtil;
import util.SwapUtil;

// 선택 정렬
public class Main_220208 {

	public static void main(String[] args) {
		
		int[] arr = {3, 5, 4, 2, 1};
		
//		for(int i=0; i<arr.length; i++) {
//			int min = i;
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[min] > arr[j]) {
//					min = j;
//				}
//			}
//			SwapUtil.swap(arr, i, min);
//		}
		
		SectionSort(arr);
		PrintUtil.print(arr);
		
	}
	
	private static void SectionSort(int[] arr) {
		SectionSortAction(arr, 0);
	}
	
	private static void SectionSortAction(int[] arr, int current) {
		if(current < arr.length -1 ) {
			int min = current;
			for(int i=current + 1; i<arr.length; i++) {
				if(arr[min] > arr[i]) {
					min = i;
				}
			}
			SwapUtil.swap(arr, current, min);
			SectionSortAction(arr, current + 1);
		}
	}
	
}
