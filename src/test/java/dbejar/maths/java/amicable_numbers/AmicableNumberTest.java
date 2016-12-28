package dbejar.maths.java.amicable_numbers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Test AmicableNumber Class
 *
 * @author David Bejar
 *
 */
public class AmicableNumberTest {

	/**
	 * Positive case scenario
	 */
	@Test
	public void testSumOfDivisorsOf220() {
		assertEquals(284, AmicableNumber.getSumOfDivisorsOf(220));
	}

	/**
	 * Positive case scenario
	 */
	@Test
	public void testSumOfDivisorsOf284() {
		assertEquals(220, AmicableNumber.getSumOfDivisorsOf(284));
	}

	/**
	 * Positive case scenario
	 */
	@Test
	public void testSumOfDivisorsOf1184() {
		assertEquals(1210, AmicableNumber.getSumOfDivisorsOf(1184));
	}

	/**
	 * Positive case scenario
	 */
	@Test
	public void testSumOfDivisorsOf1210() {
		assertEquals(1184, AmicableNumber.getSumOfDivisorsOf(1210));
	}

	/**
	 * Positive case scenario
	 */
	@Test
	public void testSumOfDivisorsOf66992() {
		assertEquals(66928, AmicableNumber.getSumOfDivisorsOf(66992));
	}

	/**
	 * Positive case scenario
	 */
	@Test
	public void testSumOfDivisorsOf66928() {
		assertEquals(66992, AmicableNumber.getSumOfDivisorsOf(66928));
	}

	/**
	 * Positive case scenario
	 */
	@Test
	public void testNumberOfAmicablesBelow100() {
		assertEquals(0, AmicableNumber.getAmicablesBelow(100).size());
	}

	/**
	 * Positive case scenario
	 */
	@Test
	public void testNumberOfAmicablesBelow200() {
		assertEquals(0, AmicableNumber.getAmicablesBelow(200).size());
	}

	/**
	 * Positive case scenario
	 */
	@Test
	public void testNumberOfAmicablesBelow250() {
		assertEquals(0, AmicableNumber.getAmicablesBelow(250).size());
	}

	/**
	 * Positive case scenario
	 */
	@Test
	public void testNumberOfAmicablesBelow284() {
		int amicablePairs = AmicableNumber.getAmicablesBelow(284).size() / 2;
		assertEquals(1, amicablePairs);
	}

	/**
	 * Positive case scenario
	 */
	@Test
	public void testAmicablesBelow284() {
		List<Integer> amicablesToTest = AmicableNumber.getAmicablesBelow(284);
		assertTrue(amicablesToTest.contains(220));
		assertTrue(amicablesToTest.contains(284));
	}

	/**
	 * Positive case scenario
	 */
	@Test
	public void testNumberOfAmicablesBelow10000() {
		assertEquals(5, AmicableNumber.getAmicablesBelow(10000).size() / 2);
	}

	/**
	 * Positive case scenario
	 */
	@Test
	public void testAmicablesBelow10000() {
		List<Integer> amicablesToTest = AmicableNumber.getAmicablesBelow(10000);
		assertTrue(amicablesToTest.contains(220));
		assertTrue(amicablesToTest.contains(284));
		assertTrue(amicablesToTest.contains(1184));
		assertTrue(amicablesToTest.contains(1210));
		assertTrue(amicablesToTest.contains(2620));
		assertTrue(amicablesToTest.contains(2924));
		assertTrue(amicablesToTest.contains(5020));
		assertTrue(amicablesToTest.contains(5564));
		assertTrue(amicablesToTest.contains(6232));
		assertTrue(amicablesToTest.contains(6368));
	}

	/**
	 * Positive case scenario
	 */
	@Test
	public void testSumAllAmicablesBelow10000() {
		assertEquals(504 + 2394 + 5544 + 10584 + 12600, AmicableNumber.sumOfAllAmicableNumbersBelow(10000));
	}

	/**
	 * Positive case scenario
	 */
	@Test
	public void testSumAllAmicablesBelow284() {
		assertEquals(504, AmicableNumber.sumOfAllAmicableNumbersBelow(284));
	}

	/**
	 * Positive case scenario
	 */
	@Test
	public void testSumAllAmicablesBelow2000() {
		assertEquals(504 + 2394, AmicableNumber.sumOfAllAmicableNumbersBelow(2000));
	}

}
