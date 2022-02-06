package main;

import action.LoopAction;
import action.RecursiveAction;
import util.PrintUtil;

/**
 * <pre>
 * 2022-02-06 
 * Bubble 정렬 공부
 * ** 작은 값이 배열의 앞쪽으로 정렬
 * </pre>
 * @author applan
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		// 정렬이 필요한 int 배열
		int[] arr = {3, 5, 4, 2, 1};
		
		RecursiveAction.bubbleSort(arr);
		System.out.println("===== 재귀 함수 버블 정렬 결과 =====");
		PrintUtil.print(arr);
		
		int[] arr2 = {3, 5, 4, 2, 1};
		
		LoopAction.bubbleSort(arr2);
		System.out.println("====== 반복문 버블 정렬 결과 ======");
		PrintUtil.print(arr2);
		
	}
}
