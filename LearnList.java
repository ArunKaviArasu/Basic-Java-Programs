package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		//List initialization
		List<String> allBiCycles=new ArrayList<>();
		
		//To add single data to a list
		allBiCycles.add(0, "Vasanth");
		allBiCycles.add(1,"Ilakkia");
		allBiCycles.add(2,"Kavi");
		allBiCycles.add(3,"Keerthi");
				
		System.out.println(allBiCycles.size());
		
		//To Remove a specific data from the list
		//allBiCycles.remove(2);
		allBiCycles.remove("Ilakkia");
		
		boolean contains=allBiCycles.isEmpty();
		System.out.println(contains);
		
		
		//To get the last data of the list
		
		System.out.println(allBiCycles.get(allBiCycles.size()-1));
		
		for(String eachcycle:allBiCycles) {
			
			System.out.println(eachcycle);
			
			/*allBiCycles.clear();
			System.out.println(eachcycle);*/

			
		}
		
		/*String lastCyc=allBiCycles.get(allBiCycles.size()-1);
		System.out.println(lastCyc);*/
		
		boolean contains1=allBiCycles.contains("Vasanth");
		System.out.println(contains1);
		
		System.out.println(allBiCycles);
		Collections.sort(allBiCycles);
		
		System.out.println("After Sorting"+allBiCycles);
		
		
		
				
		

		
					
	}

}
