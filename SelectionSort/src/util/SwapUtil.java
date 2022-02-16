package util;

/**
 * <pre>
 * 2022-02-07
 * Selection 정렬 공부
 * - Swap을 위한 유틸 
 * -> 두 값을 비교 후 순서 변경이 필요하면 해당 클래스의 메소드를 호출하여 두 값의 순서를 변경해줍니다.
 * </pre>
 * @author applan
 *
 */
public class SwapUtil {

	/**
	 * 순서 변경 메소드 
	 * @param arr - 순서의 변경이 필요한 배열
	 * @param currentIndex - 현재 순서 변경할 배열의 인덱스
	 * @param swapIndex - currentIndex와 순서 변경이 이루어지는 배열의 인덱스
	 */
	public static void swap(int[] arr, int currentIndex, int swapIndex) {
		// 값 임시 저장
		int temp = arr[currentIndex];
		// 배열의 현재 인덱스의 값 = 변경할 데이터 
		arr[currentIndex] = arr[swapIndex];
		// 변경이 필요한 인덱스 값 = 임시 저장한 값
		arr[swapIndex] = temp;
	}
}
