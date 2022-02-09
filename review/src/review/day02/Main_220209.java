package review.day02;

import util.PrintUtil;
import util.SwapUtil;

// 선택 정렬
public class Main_220209 {

	public static void main(String[] args) {
		
		int[] arr = {3, 5, 4, 1, 2, 6};
		
//		for(int i=0; i<arr.length; i++) {
//			int minIndex = i;
//			// i+1 인거 다시 생각하기
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
			SwapUtil.swap(arr, start, minIndex);
			sectionSortAction(arr, start + 1);
		}
	}
}
