package action;

import util.PrintUtil;
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
	 * @param pivotIndex - 기준점
	 */
	public static void quickSort(int[] arr, int pivotIndex) {
		quickSortAction(arr, pivotIndex);
	}
	
	/**
	 * <pre>
	 * 재귀함수를 이용한 퀵 정렬 함수 
	 * </pre>
	 * @param arr - 퀵 정렬이 이루어지고있는 int 배열
	 * @param last
	 */
	private static void quickSortAction(int[] arr, int pivotIndex) {

		PrintUtil.print(arr);
		int partitionSize = arr.length; 
		if(partitionSize > 1) {
			// 기준점이 중간일때 제일 첫번째 값을 start로 잡음
			int start = 0;
			// 기준점이 중간일때 제일 마지막 값을 end로 잡음
			int end = partitionSize - 1;
			int pivot = arr[pivotIndex];
			for(int i=0; i<partitionSize; i++) {
				System.out.println(i);
				if(arr[i] > pivot) {
					System.out.println("? " + arr[i]);
					start = i;
				}
				if(arr[partitionSize-1-i] < pivot) {
					System.out.println("???? " + arr[partitionSize-1-i]);
					end = end - i;
				}
				if(arr[start] > pivot && arr[end] < pivot) {
					System.out.println();
					System.out.println(String.format("변경 감지!!! [ %d %d ] -> [ %d %d ]", start, arr[start], end, arr[end]));
					int temp = arr[end];
					arr[end] = arr[start];
					arr[start] = temp;
					System.out.println(String.format("변경 완료 [ %d %d ] -> [ %d %d ]", start, arr[start], end, arr[end]));
					System.out.println();
				}
				System.out.println(String.format("[%d %d] | [%d %d]", start, arr[start], end, arr[end]));
				//System.out.println(String.format("[i : %d / v : %d] %d | %d | %d", i, arr[i], start, arr[pivotIndex], end));
			}
		}
		
		PrintUtil.print(arr);
	}
	
}
