package Algorithms.InsertionSortAlgorithms;

import java.util.Scanner;

public class InsertionSortAlg {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Set list size");
		int listSize = scan.nextInt();
		int list[] = new int[listSize];

		for (int i = 0; i < listSize; i++) {
			System.out.print("Array[" + i + "] : ");
			list[i] = scan.nextInt();
		}

		// 9-6-7-3-1-2
		for (int i = 1; i < list.length; i++) {
			for (int j = i; j > 0; j--) {
				if (list[j] < list[j - 1]) {
					int tempValue = list[j];
					list[j] = list[j - 1];
					list[j - 1] = tempValue;
				}
			}
		}

		System.out.print("Sorting : ");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + "-");
		}
	}
}