package review.day02;

import util.PrintUtil;
import util.SwapUtil;

// 선택 정렬
public class Main_220210 {

	public static void main(String[] args) {
		// 배열 내부의 값을 하나 선택해서 선택된 수를 가지고 배열의 값들과 비교하여 작으면 해당 작은 수로 선택값을 변경하고 아니면 지나갑니다.
		// 이로써 최후에는 제일 작은 수가 선택될 것이고 그 수와 처음 선택한 수의 자리를 바꿉니다.
		
		int[] arr = {1, 6, 5, 2, 3, 4};
		
//		for(int i=0; i<arr.length - 1 ; i++) {
//			int minIndex = i;
//			for(int j= i+1; j<arr.length; j++) {
//				if(arr[minIndex] > arr[j]) {
//					minIndex = j;
//				}
//			}
//			SwapUtil.swap(arr, i, minIndex);
//		}
		
		selectionSort(arr);
		
		PrintUtil.print(arr);
		
	}
	
	private static void selectionSort(int[] arr) {
		selectionSortAction(arr, 0);
	}
	
	private static void selectionSortAction(int[] arr,int start) {
		
		if(start < arr.length - 1) {
			int minIndex = start;
			for(int i= start+1; i<arr.length; i++) {
				if(arr[minIndex] > arr[i]) {
					minIndex = i;
				}
			}
			SwapUtil.swap(arr, start, minIndex);
			// if문 안에 있어야 함 
			selectionSortAction(arr, start + 1);
		}
	}
}
