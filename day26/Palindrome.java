package day26;

public class Palindrome {
	public static void main(String[] args) {
		String name= " dinesh kumar ";
		String removedspace ="  ";
		for (char value : name.toCharArray()) {
			if(value ==' ') {
				
			}else {
				removedspace += value;
			}
		}
			System.out.println(removedspace);
			
			
			for(int i = removedspace.length()-1;i>=0;i--) {
				System.out.print(removedspace.charAt(i));
			}
			
		
	}

}
