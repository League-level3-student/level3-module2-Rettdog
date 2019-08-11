package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	String[] unsorted = new String[] {"hi", "dancer", "dictionary", "lettuce", "show", "wheel", "cantrip", "unicorn", "minion", "tree"};
	int[] unsortedInt = new int[100];
	int[] sortedInt = new int[100];
	int[] evenlySpacedInt = new int[100];
	_00_LinearSearch linear = new _00_LinearSearch();
	_01_BinarySearch binary = new _01_BinarySearch();
	_02_InterpolationSearch interpolation = new _02_InterpolationSearch();
	_03_ExponentialSearch exponential = new _03_ExponentialSearch();
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		assertEquals(linear.linearSearch(unsorted, "dancer"),1);
		assertEquals(linear.linearSearch(unsorted, "hi"),0);
		assertEquals(linear.linearSearch(unsorted, "lettuce"),3);
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
