package action;

import util.SwapUtil;

/**
 * <pre>
 * 2022-02-06 
 * Bubble 정렬 - 재귀 함수 타입
 * </pre>
 * @author applan
 *
 */
public class RecursiveAction {
	
	/**
	 * <pre>
	 * 버블 정렬 시작 메소드 
	 * </pre>
	 * @param arr - 버블 정렬이 이루어질 int 배열 
	 */
	public static void bubbleSort(int[] arr) {
		bubbleSortAction(arr, arr.length - 1);
	}
	
	/**
	 * <pre>
	 * 재귀함수를 이용한 버블 정렬 함수 
	 * </pre>
	 * @param arr - 버블 정렬이 이루어지고있는 int 배열
	 * @param last
	 */
	private static void bubbleSortAction(int[] arr, int last) {
		if(last > 0) {
			for(int i=0; i < last; i++) {
				// 두개의 값을 비교해서 이전 값의 데이터가 현재 값보다 큰 경우 순서 변경
				if(arr[i] > arr[i+1]) {
					SwapUtil.swap(arr, i, i+1);
				}
			}
			bubbleSortAction(arr, last - 1);
		}
	}
	
}
