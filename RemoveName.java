package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveName {

	public static void main(String[] args) {
		String[] str= {"rajesh","deny","david","kavi","dension"};
		
		List<String> name=new ArrayList<>();
		
		for(int i=0;i<str.length;i++) {
			name.add(str[i]);
		}
		
		for(int j=0;j<name.size();j++) {
			String rst=name.get(j);
			//System.out.println(rst);
			if(rst.toLowerCase().contains("d")) {
				name.remove(j);
				j=j-1;
			}
		}
		
		Collections.sort(name);
		for(String a:name) {
		System.out.println(a);
		

	}

}
}
