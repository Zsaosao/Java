package lab4;

import java.util.ArrayList;

public class Ex5 {

	static boolean checkTheAppearance(int element, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				return true;
			}
		}
		return false;
	}

	static void printIndexArrayList(ArrayList<Integer> array) {
		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i) + " ");
		}
		System.out.println("");
	}

	static void numberofTimeSandInPositions(int element, int[] array) {
		int count = 0;
		ArrayList<Integer> indexOfElement = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				count++;
				indexOfElement.add(i);
			}
		}
		System.out.println("number of occurrences: " + count);
		System.out.print("all positions of that number are: ");
		printIndexArrayList(indexOfElement);
	}

	static void deleteElementOfArray(int element, int[] array) {
		System.out.print("Elements before deletion: ");
		Ex4.printArray(array);
		System.out.print("Elements after removing the number " + element + ": ");
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] != element) {
				arrayList.add(array[i]);
			}
		}
		printIndexArrayList(arrayList);

	}
}
