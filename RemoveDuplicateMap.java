package week3.day2;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class RemoveDuplicateMap {

	public static void main(String[] args) {
		String name="Deepaa";
		char[] ch=name.toCharArray();
		Map<Character,Integer> map1=new TreeMap<>();
		for(char c:ch) {
			if(map1.containsKey(c)) {
			map1.remove(c);
			System.out.println(c);
		}
		map1.put(c, 1);
		

	}

}
}
