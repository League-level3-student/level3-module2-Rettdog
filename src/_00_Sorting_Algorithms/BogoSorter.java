package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}

	// Bogo sort is a joke sorting algorithm. It is considered the most
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.

	// It works by following these steps:
	// STEP 1. Is the array in order?
	// if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.

	// 1. Complete the sort method using the Bogo sort algorithm.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		while (true) {
			if(_00_SortedArrayChecker.intArraySorted(array)) {
				return;
			}else {
				Random randy = new Random();
				int random1 = randy.nextInt(array.length-1);
				int random2 = randy.nextInt(array.length-1);
				int array1 = array[random1];
				int array2 = array[random2];
				array[random2] = array1;
				array[random1] = array2;
				display.updateDisplay();
			}
		}
	}
}
