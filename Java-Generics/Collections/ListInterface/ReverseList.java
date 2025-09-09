package ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
public class reverseList {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		int arr[]= {2,4,1,3,6,5,9,0};
		for(int i=0;i<arr.length;i++) {
			arrayList.add(arr[i]);
			linkedList.add(arr[i]);
		}
		System.out.println("Before reverse "+ arrayList);
		
		reverseArrayList(arrayList);
		System.out.println("Reversed arrayList is :" + arrayList);
		reverseLinkedList(linkedList);
		System.out.println("Reversed linkedList is :"+linkedList);

	}
	public static void reverseArrayList(List<Integer> arrayList) {
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<arrayList.size();i++) {
			st.push(arrayList.remove(i));
		}
		while(!st.isEmpty()) {
			arrayList.add(st.pop());
		}
		
		
	}
	public static void reverseLinkedList(List<Integer> linkedList) {
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<linkedList.size();i++) {
			st.push(linkedList.remove(i));
		}
		while(!st.isEmpty()) {
			linkedList.add(st.pop());
		}
		
		
	}

}