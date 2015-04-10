public class FindCharacters{
	public static void main(String args[]){
		String text = "To be or not to be, that is the question;"
			+ " Whether ‘tis nobler in the mind to suffer"
			+ " the slings and arrows of outrageous fortune,"
			+ " or to take arms against a sea of troubles,"
			+ " and by opposing end them?";
			
		int andCount = 0;
		int theCount = 0;
		
		int index = -1;
		
		//seach substrings
		String andStr  = "and"; 
		String theStr = "the";
		//seach forward for "and"
		index = text.indexOf(andStr);
		while(index >= 0){
			++andCount;
			index +=  andStr.length();
			index = text.indexOf(andStr,index);
		}
		
		//seach backwards for the
		index = text.indexOf(theStr);
		while(index >= 0){
			++theCount;
			index -=  theStr.length();
			index = text.indexOf(andStr,index);
		}
		
		System.out.println("O texto contém " + andCount + "ands \n" +
		"O texto contém "	+ theCount + "thes");
	}
}