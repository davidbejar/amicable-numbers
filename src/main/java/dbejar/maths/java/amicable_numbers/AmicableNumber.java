package dbejar.maths.java.amicable_numbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class AmicableNumber {

	/**
	 * @param inputNumber
	 * @return divisors
	 */
	public static int getSumOfDivisorsOf(int inputNumber) {
		Integer potentialDivisor = inputNumber - 1;
		List<Integer> divisors = new ArrayList<Integer>();
		for (; potentialDivisor > 0; potentialDivisor--) {
			if (inputNumber % potentialDivisor == 0) {
				divisors.add(potentialDivisor);
			}
		}
		return divisors.parallelStream().mapToInt(Integer::intValue).sum();
	}

	/**
	 *
	 * @param amicablesUpperLimit
	 * @return List of amicables
	 */
	public static List<Integer> getAmicablesBelow(Integer amicablesUpperLimit) {
		System.out.println("getAmicablesBelow(" + amicablesUpperLimit + ")");
		Integer numberToCheckForAmicable = amicablesUpperLimit;
		List<Integer> amicablesBelowGivenNumber = new ArrayList<Integer>();
		for (; numberToCheckForAmicable > 0; numberToCheckForAmicable--) {
			if (amicablesBelowGivenNumber.contains(numberToCheckForAmicable)) {
				continue;
			}
			Integer sumOfDivisors = getSumOfDivisorsOf(numberToCheckForAmicable);
			if (sumOfDivisors > amicablesUpperLimit || sumOfDivisors.equals(numberToCheckForAmicable)) {
				continue;
			}
			Integer invertSumOfDivisors = getSumOfDivisorsOf(sumOfDivisors);
			if (invertSumOfDivisors.equals(numberToCheckForAmicable)) {
				System.out.println("(" + sumOfDivisors + ", " + invertSumOfDivisors + ")" + "from iteration with "
						+ numberToCheckForAmicable);
				amicablesBelowGivenNumber.add(sumOfDivisors);
				amicablesBelowGivenNumber.add(invertSumOfDivisors);
			}
		}
		return amicablesBelowGivenNumber;
	}

	/**
	 *
	 * @param amicablesUpperLimit
	 * @return sum of all amicables below a given number
	 */
	public static int sumOfAllAmicableNumbersBelow(int amicablesUpperLimit) {
		return getAmicablesBelow(amicablesUpperLimit).parallelStream().mapToInt(Integer::intValue).sum();
	}

	/**
	 * Dummy main class
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(sumOfAllAmicableNumbersBelow(10000));
	}
}
