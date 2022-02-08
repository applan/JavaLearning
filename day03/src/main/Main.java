package main;

import action.RecursiveAction;
import util.PrintUtil;

/**
 * <pre>
 * 2022-02-08
 * Quick 정렬 공부
 * ** 작은 값이 배열의 앞쪽으로 정렬
 * </pre>
 * @author applan
 *
 */
public class Main {

	public static void main(String[] args) {
		 
		int[] arr = {3, 9, 4, 7, 5, 0, 1, 6, 8, 2};
		
		PrintUtil.print(arr);
		RecursiveAction.quickSort(arr);
		PrintUtil.print(arr);
	}
}
