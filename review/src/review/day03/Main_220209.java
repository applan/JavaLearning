package review.day03;

import util.PrintUtil;
import util.SwapUtil;

// 퀵 정렬
public class Main_220209 {

	public static void main(String[] args) {
		
		int[] arr = {3, 9, 4, 8, 5, 0, 6, 7, 1, 2};
		
		quickSort(arr);
		
		PrintUtil.print(arr);
		
	}
	
	private static void quickSort(int[] arr) {
		quickSortAction(arr, 0, arr.length - 1);
	}
	
	private static void quickSortAction(int[] arr, int start, int end) {
		int part = partition(arr, start, end);
		if(start < part - 1) {
			quickSortAction(arr, start, part - 1);
		}
		if(end > part) {
			quickSortAction(arr, part, end);
		}
	}
	
	private static int partition(int[] arr, int start, int end) {
		// start - end x | start + end o
		int pivot = arr[(start + end) / 2];
		// start >= end x | start <= end o
		while(start <= end) {
			while(arr[start] < pivot) start++;
			while(arr[end] > pivot) end--;
			// start >= end x | start <= end o
			// if문이 while문 안에 있어야함.
			if(start <= end) {
				SwapUtil.swap(arr, start, end);
				start ++;
				end --;
			}
		}
		return start;
	}
	
	
}
