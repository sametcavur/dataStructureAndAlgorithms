package Algorithms.SelectionSortAlgorithms;

import java.util.Scanner;

public class SelectionSortAlg {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Set list size");
		int listSize = scan.nextInt();

		int list[] = new int[listSize];

		for (int i = 0; i < listSize; i++) {
			System.out.print("Array[" + i + "] : ");
			list[i] = scan.nextInt();
		}

		for (int i = 0; i < listSize; i++) {
			int minIndexNo = i;
			for (int j = i + 1; j < listSize; j++) {
				if (list[minIndexNo] > list[j]) {
					minIndexNo = j;
				}
			}
			int tempValue = list[minIndexNo];
			list[minIndexNo] = list[i];
			list[i] = tempValue;
		}

		System.out.print("Sorting : ");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " - ");
		}
	}
}