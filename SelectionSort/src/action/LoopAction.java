package action;

import util.SwapUtil;

/**
 * <pre>
 * 2022-02-07
 * Selection 정렬 - 반복문 타입
 * </pre>
 * @author applan
 *
 */
public class LoopAction {
	
	/**
	 * <pre>
	 * 선택 정렬 시작 메소드 
	 * </pre>
	 * @param arr - 선택 정렬이 이루어질 int 배열 
	 */
	public static void selectionSort(int[] arr) {
		
		// 배열의 length
		int loopLength = arr.length;

		// 모든 인덱스를 한 번씩 동작하는 반복문 마지막 인덱스는 접근할 필요가 없음 마지막 i가 동작할때면 두번째 for문이 마지막꺼랑 비교하기만 하면됨
		for(int i=0; i < loopLength - 1; i++) {
			int minIndex = i;
			for(int j=i + 1; j < loopLength; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			SwapUtil.swap(arr, i, minIndex);
		}
	}

}
