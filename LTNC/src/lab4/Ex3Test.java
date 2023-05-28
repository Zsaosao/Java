package lab4;

public class Ex3Test {
	public static void main(String[] args) {
		int[] array = Ex3.inputArray();
		System.out.println("------------------------");
		System.out.println("Counting Negative Numbers: " + Ex3.countingNegativeNumbers(array));
		System.out.println("Counting Positive Numbers: " + Ex3.countingPositiveNumbers(array));
		System.out.println("Counting Zeros: " + Ex3.countingZeros(array));
		System.out.println("Find The Largest Negative Number: " + Ex3.findTheLargestNegativeNumber(array));
		System.out.println("Find The Largest Positive Number: " + Ex3.findTheLargestPositiveNumber(array));
		System.out.println("Negative Total: " + Ex3.negativeTotal(array));
		System.out.println("Positive Total: " + Ex3.positiveTotal(array));
		System.out.println("Check Positive Sum Equal Negative Sum: " + Ex3.checkPositiveSumEqualNegativeSum(array));
	}
}
