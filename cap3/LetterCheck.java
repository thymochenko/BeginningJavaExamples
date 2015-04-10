import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import java.io.*;

public class LetterCheck {
	public static void main(String args[]){
		try{
			InputStreamReader read = new InputStreamReader(System.in);
			BufferedReader buff = new BufferedReader(read);
			String letter = buff.readLine();
			char convertLetter = letter.charAt(0);
			if(isUpperCase(convertLetter)){
				System.out.println("Você tem uma letra maiuscula:" + letter);
			}
			else if(isLowerCase(convertLetter)){
				System.out.println("Você tem uma letra minuscula:" + letter);
			}
		} catch(Exception e){}
	}
}