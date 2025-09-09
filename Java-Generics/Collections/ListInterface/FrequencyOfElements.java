package listInterface;

import java.util.HashMap;
import java.util.Map;

public class frequencyOfElements {
	public static void main(String[] args) {
		String str[] = {"apple", "banana", "apple", "orange","apple", "banana", "apple", "orange"};
		Map<String , Integer> map = new HashMap<>();
		
//		for(int i=0;i<str.length;i++) {
//			if(map.containsKey(str[i])) {
//				map.put(str[i], map.get(str[i])+1);
//			}
//			else {
//				map.put(str[i], 1);
//			}
//		}
		System.out.println("\nElement Frequencies:");
		for(int i=0;i<str.length;i++) {
			map.put(str[i],map.getOrDefault(str[i],0)+1);
			
		}
//		for (Map.Entry<String, Integer> entry : map.entrySet()) {
//			System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
//		}
		System.out.print(map);
	}
}