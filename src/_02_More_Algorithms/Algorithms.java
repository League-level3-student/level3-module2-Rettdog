package _02_More_Algorithms;

import java.util.List;
import java.util.Random;

public class Algorithms {
	
	static Random randy = new Random();
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int pearls = 0;
		for(boolean pearl : oysters) {
			if(pearl) {
				pearls++;
			}
		}
		
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		double maxHeight = 0;
		for(double height : peeps) {
			if(height>maxHeight) {
				maxHeight=height;
			}
		}
		return maxHeight;
	}

	public static String findLongestWord(List<String> words) {
		String longest = "";
		
		for(String word : words) {
			if(word.length()>longest.length()) {
				longest=word;
			}
		}
		
		return longest;
	}

	public static boolean containsSOS(List<String> message) {
		boolean containsSOS = false;
		
		for(String maybeSOS : message) {
			if(    maybeSOS.contains("... --- ...")         ) {
				containsSOS = true;
			}
		}
		
		return containsSOS;
	}

	public static List<Double> sortScores(List<Double> results) {
		int first;
		int second;
		
		double value;
		
		while(!sorted(results)) {
		first = randy.nextInt(results.size());
		second = randy.nextInt(results.size());
		value = results.get(first);
		
		if(first<second) {
			if(results.get(first)>results.get(second)) {
				results.set(first, results.get(second));
				results.set(second, value);
			}
		}
		if(first>second) {
			if(results.get(first)<results.get(second)) {
				results.set(first, results.get(second));
				results.set(second, value);
			}
		}
		
		
		
		}
		return results;
	}
	
	public static boolean sorted(List<Double> list) {
		
		for(int i = 1;i<list.size();i++) {
			if(list.get(i)<=list.get(i-1)) {
				return false;
			}
		}
		return true;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		
		int first;
		int second;
		
		String value;
		
		while(!sortedString(unsortedSequences)) {
		first = randy.nextInt(unsortedSequences.size());
		second = randy.nextInt(unsortedSequences.size());
		value = unsortedSequences.get(first);
		
		if(first<second) {
			if(unsortedSequences.get(first).length()>unsortedSequences.get(second).length()) {
				unsortedSequences.set(first, unsortedSequences.get(second));
				unsortedSequences.set(second, value);
			}
		}
		if(first>second) {
			if(unsortedSequences.get(first).length()>unsortedSequences.get(second).length()) {
				unsortedSequences.set(first, unsortedSequences.get(second));
				unsortedSequences.set(second, value);
			}
		}
		
		
		
		
		}
		
		return unsortedSequences;
		
	}
		
		public static boolean sortedString(List<String> list) {
			
			for(int i = 1;i<list.size();i++) {
				if(list.get(i).length()<=list.get(i-1).length()) {
					return false;
				}
			}
			return true;
		}

		public static List<String> sortWords(List<String> words) {
			
			int first;
			int second;
			
			String value;
			
			while(!sortedABC(words)) {
			first = randy.nextInt(words.size());
			second = randy.nextInt(words.size());
			value = words.get(first);
			
			if(first<second) {
				if(words.get(first).compareTo(words.get(second))>0) {
					words.set(first, words.get(second));
					words.set(second, value);
				}
			}
			if(first>second) {
				if(words.get(first).compareTo(words.get(second))<0) {
					words.set(first, words.get(second));
					words.set(second, value);
				}
			}
			
			
			
			
			}
			
			return words;
			
			
		}
public static boolean sortedABC(List<String> list) {
			
			for(int i = 1;i<list.size();i++) {
				if(list.get(i).compareTo(list.get(i-1))<0) {
					return false;
				}
			}
			return true;
		}

}
