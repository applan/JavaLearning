package review.day03;

import util.PrintUtil;
import util.SwapUtil;

// 퀵 정렬
public class Main_220212 {

	public static void main(String[] args) {
		
		int[] arr = {1, 8, 6, 5, 4, 7, 2, 3};
		
		quickSort(arr);
		
		PrintUtil.print(arr);
		
	}
	
	private static void quickSort(int[] arr) {
		quickSortAction(arr, 0, arr.length-1);
	}
	
	private static void quickSortAction(int[] arr, int start, int end) {
		int part = partition(arr, start, end);
		if(start < part -1) {
			quickSortAction(arr, start, part -1);
		}
		if(end > part) {
			quickSortAction(arr, part, end);
		}
	}
	
	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start + end) / 2];
		
		while(start <= end) {
			while(arr[start] < pivot) start++;
			while(arr[end] > pivot) end--;
			if(start <= end) {
				SwapUtil.swap(arr, start, end);
				start++;
				end--;
			}
		}
		return start;
	}
}
