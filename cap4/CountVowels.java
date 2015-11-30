public class CountVowels {
	public static void main(String args[]){
		String phrase = "As nuâncias da verdade correspondem sempre a sombras do todo";
		int vowels = 0;
		for(char ch : phrase.toCharArray()){
			ch = Character.toLowerCase(ch);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
				++vowels;
			}
		}
		System.out.println("Total de vogais na frase: " + vowels);
	}
}