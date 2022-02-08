package review.day03;

import util.PrintUtil;
import util.SwapUtil;

public class Main_220208 {

	public static void main(String[] args) {
		
		int[] arr = {3, 9, 4, 7, 5, 0, 1, 6, 8, 2};
		
		quickSort(arr);
		
		PrintUtil.print(arr);
		
	}
	
	private static void quickSort(int[] arr) {
		quickSortAction(arr, 0, arr.length-1);
	}
	
	private static void quickSortAction(int[] arr, int start, int end) {
		int part2 = partition(arr, start, end);
		if(start < part2 - 1) {
			quickSortAction(arr, start, part2 - 1);
		}
		if(end > part2) {
			quickSortAction(arr, part2, end);
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
