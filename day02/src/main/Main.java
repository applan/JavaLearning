package main;

import action.LoopAction;
import action.RecursiveAction;
import util.PrintUtil;

/**
 * <pre>
 * 2022-02-07
 * Selection 정렬 공부
 * ** 작은 값이 배열의 앞쪽으로 정렬
 * </pre>
 * @author applan
 *
 */
public class Main {

	public static void main(String[] args) {
		
		// 정렬이 필요한 int 배열
		int[] arr = {9, 5, 4, 2, 1, 7, 8, 3, 6};
		LoopAction.selectionSort(arr);
		
		PrintUtil.print(arr);
		
		// 정렬이 필요한 int 배열
		int[] arr2 = {9, 5, 4, 2, 1, 7, 8, 3, 6};
		RecursiveAction.selectionSort(arr2);
		
		PrintUtil.print(arr2);
	}
}
