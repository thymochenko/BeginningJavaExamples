public class UseStringBuffer {
	public static void main(String args[]){
		StringBuffer sentence = new StringBuffer(20);
		System.out.println("\n StringBuffer objeto: sua capacidade é de #{" +
			sentence.capacity()  +
			"} e o tamanho da string é #{" + sentence.length() + "}");
		
		String[] words = { "Too", "Many", "cooks",  "spoil", "the", "broth"};
		sentence.append(words[0]);
		for(int i = 1; i < words.length; ++i){
			sentence.append(' ').append(words[i]);
		}
		
		System.out.println("\n Strings no objeto StringBuffer são \n" + sentence.toString() );
		System.out.println("\n StringBuffer objeto: sua capacidade é de #{" +
			sentence.capacity()  +
			"} e o tamanho da string é #{" + sentence.length() + "}");
		
		//modificando as strings para inserir caracteres
		sentence.insert(sentence.lastIndexOf("cooks") + 4,"ie");
		sentence.insert(sentence.lastIndexOf("broth") +5, "er");
		System.out.println("\nString in StringBuffer object is:" + sentence);
		System.out.println("\n StringBuffer objeto: sua capacidade é de #{" +
			sentence.capacity()  +
			"} e o tamanho da string é #{" + sentence.length() + "}");
		
	}
}