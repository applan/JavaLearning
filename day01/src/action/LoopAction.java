package action;

import util.SwapUtil;

/**
 * <pre>
 * 2022-02-06 
 * Bubble 정렬 - 반복문 타입
 * </pre>
 * @author applan
 *
 */
public class LoopAction {
	
	/**
	 * <pre>
	 * 버블 정렬 시작 메소드 
	 * </pre>
	 * @param arr - 버블 정렬이 이루어질 int 배열 
	 */
	public static void bubbleSort(int[] arr) {
		// 배열의 length - 1
		int loopLength = arr.length - 1;
		
		// 마지막 인덱스를 제외한 순차적 반복문 
		for(int i=0; i < loopLength; i++) {
			
			// 마지막 인덱스 - 현재 돌고있는 인덱스 {i}값 (0, 1, 2 ... ) 
			// 이미 처리한 마지막 인덱스를 계속 돌 필요 없기 때문에 {i}값 만큼 이중 반복문의 범위 값을 줄여준다 ( 4..3..2..1.. )
			for(int j=0; j < loopLength - i; j++) {
				if(arr[j] > arr[j + 1]) {
					SwapUtil.swap(arr, j, j+1);
				}
			}
			
		}
	}

}
