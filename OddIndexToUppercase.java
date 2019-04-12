package week1.day1;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		String name="arunkaviarasu";
		char ch;
		for(int i=0; i<name.length(); i++) {
			ch =name.charAt(i);
			if (i%2 == 0) {
				System.out.println(Character.toUpperCase(ch));
			}
			else {
				System.out.println(Character.isLowerCase(ch));
				
			}
		}
		
	}

}
