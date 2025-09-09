package ListInterface;


import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Arrays;

public class removeDuplicates {
	public static void main(String[] args) {
		int [] arr= {1,33,33,33,2,2,2,4};
		System.out.println( "Before removing dupulicates "+ Arrays.toString(arr));
		Set<Integer> set = new LinkedHashSet<>();
		for(int num : arr) {
			set.add(num);
		}
		System.out.print("After removing dupuplicates"+set);
	}
}