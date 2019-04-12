package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicateslist {
	public static void main(String[] args) {
		String[] str= {"arun","kavi","arasu","arun"};
		
		List<String> lst=new ArrayList<>();
		
		for(int i=0;i<str.length;i++) {
			if(!lst.contains(str[i])) {
				lst.add(str[i]);
			}
		}
		Collections.sort(lst);
		System.out.println(lst);
	}
	

}
