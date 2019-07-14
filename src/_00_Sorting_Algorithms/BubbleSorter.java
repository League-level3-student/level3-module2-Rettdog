package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the arrayay.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		while(!(_00_SortedArrayChecker.intArraySorted(array))) {
			for(int i = array.length-2 ;i>=0;i--) {
				if(array[i]>array[i+1]) {
					int first = array[i];
					int second = array[i+1];
					array[i]=second;
					array[i+1]=first;
				}
			}
			
			display.updateDisplay();
		}
	}
	
}
