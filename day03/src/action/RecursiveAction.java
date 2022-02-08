package action;

import util.SwapUtil;

/**
 * <pre>
 * 2022-02-08
 * Quick 정렬 - 재귀 함수 타입
 * </pre>
 * @author applan
 *
 */
public class RecursiveAction {

	/**
	 * <pre>
	 * Quick 정렬 시작 메소드 
	 * </pre>
	 * @param arr - 퀵 정렬이 이루어질 int 배열 
	 */
	public static void quickSort(int[] arr) {
		quickSortAction(arr, 0, arr.length-1);
	}
	
	/**
	 * <pre>
	 * 재귀함수를 이용한 퀵 정렬 함수 
	 * </pre>
	 * @param arr - 퀵 정렬이 이루어지고있는 int 배열
	 * @param start - 
	 * @param end -
	 */
	private static void quickSortAction(int[] arr, int start, int end) {
		System.out.println(String.format("%d %d", start, end));
		int part2 = partition(arr, start, end);
		// 왼쪽 파티션 
		if (start < part2 - 1) {
			quickSortAction(arr, start, part2 - 1);
		}
		// 오른쪽 파티션
		if (part2 < end) {
			quickSortAction(arr, part2, end);
		}
	}
	
	/**
	 * <pre>
	 * 파티션을 나눠주는 함수
	 * </pre>
	 * @param arr - 퀵 정렬이 이루어지고있는 int 배열
	 * @param start - 
	 * @param end -
	 */
	private static int partition(int[] arr, int start, int end) {
		// 파티션의 중간 값을 pivot으로 정해줌
		int pivot = arr[(start + end) / 2];
		while(start <= end) {
			while (arr[start] < pivot) start ++;
			while (arr[end] > pivot) end--;
			if(start <= end) {
				SwapUtil.swap(arr, start, end);
				start++;
				end--;
			}
		}
		return start;
	}
	
}
