package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicates {
	public static ArrayList<Integer> duplicates(ArrayList<Integer> arr1,
			ArrayList<Integer> arr2) {
		ArrayList<Integer> arrResult = new ArrayList<Integer>();
		int count = 0;
		arr1.add(null);
		for (int i = 0; i < arr1.size() - 1; i++) {
			if (!(arr1.get(i).equals(arr1.get(i + 1)))) {
				arrResult.add(count + arr2.get(i));
				count = 0;
			} else {
				count += arr2.get(i);
			}
		}
		return arrResult;
	}

	// public static ArrayList<Integer> duplicates(ArrayList<Integer> arr1,
	// ArrayList<Integer> arr2) {
	// ArrayList<Integer> arrResult = new ArrayList<Integer>();
	// Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
	// for (int i = 0; i < arr1.size(); i++) {
	// if (hashMap.containsKey(arr1.get(i))) {
	// hashMap.put(arr1.get(i), hashMap.get(arr1.get(i)) + arr2.get(i));
	// } else {
	// hashMap.put(arr1.get(i), arr2.get(i));
	// }
	// }
	// for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
	// System.out.println(entry.getValue());
	// if (entry.getValue() > 1) {
	// arrResult.add(entry.getValue());
	// }
	// }
	// return arrResult;
	// }
	private static void checkMinMaxQtyValue(List<Integer> filelist, List<Integer> qtylist) {
		Map<Integer, List<Integer>> fileIdWithQuantities = new HashMap<>();
		for (int i = 0; i < filelist.size() - 1; i++) {
			Integer fileId = filelist.get(i);
			if (fileIdWithQuantities.containsKey(fileId)) {
				fileIdWithQuantities.get(fileId).add(qtylist.get(i));
			} else {
				List<Integer> quantities = new ArrayList<>();
				quantities.add(qtylist.get(i));
				fileIdWithQuantities.put(fileId, quantities);
			}
		}
		for (Integer fileId : fileIdWithQuantities.keySet()) {
			Integer sumQuantity = 0;
			for (Integer quantity : fileIdWithQuantities.get(fileId)) {
				sumQuantity += quantity;
			}
			System.out.println(sumQuantity);

		}

	}

	// print arraylist
	public static void printArrayList(ArrayList<Integer> arr) {
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// printArrayList(duplicates(new ArrayList<Integer>(Arrays.asList(3057, 3076,
		// 3076, 3622)),
		// new ArrayList<Integer>(Arrays.asList(30, 10, 5, 60))));
		// printArrayList(duplicates(new ArrayList<Integer>(Arrays.asList(
		// 1, 2, 3, 4)),
		// new ArrayList<Integer>(Arrays.asList(1, 10, 5, 60))));
		checkMinMaxQtyValue(new ArrayList<Integer>(Arrays.asList(3057, 3076, 3076, 3622)),
				new ArrayList<Integer>(Arrays.asList(30, 10, 5, 60)));
	}
}
