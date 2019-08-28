package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	Random randy = new Random();
	String[] unsorted = new String[] {"hi", "dancer", "dictionary", "lettuce", "show", "wheel", "cantrip", "unicorn", "minion", "tree"};
	int[] unsortedInt = new int[] {34,67,3,9,12,89,3,4,87,23,45,298,45,10,76};
	
	int[] sortedInt = new int[] {1,6,13,17,18,21,25,48,52,68,69,82,89,99};
	int[] evenlySpacedInt = new int[] {1,3,5,7,9,11,13,15,17,19,21,23,25,27};
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
		
		assertEquals(binary.binarySearch(sortedInt,0,sortedInt.length, 17),3);
		assertEquals(binary.binarySearch(sortedInt,0,sortedInt.length, 89),12);
		assertEquals(binary.binarySearch(sortedInt,0,sortedInt.length, 23),-1);
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
	
	public int[] randomFill(int[] array) {
		
		for(int i = 0;i<array.length;i++) {
			array[i]=randy.nextInt(100);
		}
		return array;
	}
public int[] increaseRandomFill(int[] array) {
		int starter = randy.nextInt(12);
		for(int i = 0;i<array.length;i++) {
			array[i]=starter+randy.nextInt(12);
			starter =array[i];
		}
		return array;
	}

public int[] increaseSteadyFill(int[] array) {
	int starter = randy.nextInt(12);
	int distance = randy.nextInt(20);
	for(int i = 0;i<array.length;i++) {
		array[i]=starter+i*distance;
		
	}
	return array;
}
}
