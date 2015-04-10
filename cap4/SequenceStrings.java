public class SequenceStrings{
	public static void main(String args[]){
		//strings a serem preparadas
		String string1 = "A";
		String string2 = "TO";
		String string3 = "Z";
		
		//strings para serem usanas no output
		String string1Out = " ----- " + string1 + " ----- ";
		String string2Out = " ----- " + string2 + " ----- ";
		String string3Out = " ----- " + string3 + " ----- ";
		
		int result = string1.compareTo(string3);
		if(result < 0){
			System.out.println(string1Out + " é inferior " + string3Out);
		} else if(result > 0){
			System.out.println(string1Out + " é maior do que " + string3Out);
		} else {
			System.out.println(string1Out + " é igual a " + string3Out);
		}
		
		//compara string2  com string1
		result = string2.compareTo(string1);
		if(result < 0){
			System.out.println(string2Out + " é inferior " + string1Out);
		} else if(result > 0){
			System.out.println(string2Out + " é maior do que " + string1Out);
		} else {
			System.out.println(string2Out + " é igual a " + string1Out);
		}
		
	}
}