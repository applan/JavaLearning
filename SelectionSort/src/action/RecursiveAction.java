package action;

import util.SwapUtil;

/**
 * <pre>
 * 2022-02-07 
 * Selection 정렬 - 재귀 함수 타입
 * </pre>
 * @author applan
 *
 */
public class RecursiveAction {
	
	/**
	 * <pre>
	 * 선택 정렬 시작 메소드 
	 * </pre>
	 * @param arr - 선택 정렬이 이루어질 int 배열 
	 */
	public static void selectionSort(int[] arr) {
		selectionSortAction(arr, 0);
	}
	
	/**
	 * <pre>
	 * 재귀함수를 이용한 선택 정렬 함수 
	 * </pre>
	 * @param arr - 선택 정렬이 이루어지고있는 int 배열
	 * @param start - 시작 인덱스 값
	 */
	private static void selectionSortAction(int[] arr, int start) {
		if(start < arr.length - 1) {
			int minIndex = start;
			for(int i= start + 1; i < arr.length; i++) {
				// 두개의 값을 비교해서 이전 값의 데이터가 현재 값보다 큰 경우 순서 변경
				if(arr[i] < arr[minIndex]) {
					minIndex = i;
				}
			}
			SwapUtil.swap(arr, start, minIndex);
			selectionSortAction(arr, start + 1);
		}
	}
	
}
