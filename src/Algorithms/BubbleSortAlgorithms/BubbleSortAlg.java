package Algorithms.BubbleSortAlgorithms;

import java.util.Scanner;

public class BubbleSortAlg {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int listSize, value;

		System.out.println("Set list size : ");
		listSize = scan.nextInt();
		int list[] = new int[listSize];

		for (int i = 0; i < list.length; i++) {
			System.out.print("Array[" + i + "] :");
			value = scan.nextInt();
			list[i] = value;
		}

		int temp = 0;
		for (int i = 0; i < listSize - 1; i++) {
			for (int j = 0; j < listSize - 1; j++) {
				if (list[j] > list[j + 1]) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}

		System.out.print("Sorting : ");
		for (int i = 0; i < listSize; i++) {
			System.out.print(list[i] + " - ");
		}
	}
}
