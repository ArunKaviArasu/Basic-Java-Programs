package week8.day1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class duplicate {
	int[] dup= {1,3,3,7,8,8,9};
	@Test
		public void duplicateMethod() {
			for(int i=0;i<dup.length;i++) {
				for(int j=i+1;j<dup.length;j++) {
					if(dup[i]==dup[j]) {
						System.out.println(dup[i]);
						
					}
				}
			}
	}
	
	
	@Test
	public void treeMap() {
		
		int[] data= {1,3,3,7,8,8,9};
		
		Arrays.sort(data);
		
		for(int i=0;i<data.length-1;i++) {
			if(data[i]==data[i+1]) {
				System.out.println(data[i]);
				
			}
		}

}
	
	@Test
	
	public void setMap() {
		
		int[] arr= {1,3,3,7,8,8,9};
		
		Set<Integer> st=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(st.add(arr[i])==false) {
				System.out.println(arr[i]);
				
			}
			
		}
			
	}
}
				

	


