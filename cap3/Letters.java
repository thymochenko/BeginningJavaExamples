import java.util.Random;

public class Letters {
	public static void main(String args[]){
		Random r = new Random();
		int count = 1;
		int totalChars = 10;
		char randomLetter;
		do {
			randomLetter = (char) (256 + r.nextInt(count));
			if(Character.isAlphabetic(randomLetter)){
				System.out.println(randomLetter);
			}
			count++;
		}
		while(totalChars > count);
		
		//isTitleCase
		//isUpperCase
	}
} 