public class StringCharacters{
	public static void main(String args[]){
		//nietzsche poem
		String poem =  "Quero um mal de morte "+
			"A estas almas incertas." +
			"Tortura-as a honra que vos fazem," +
			"Pesam-lhes, dão-lhe vergonha os seus louvores." +
			"Porque não vivo Preso à sua trela," +
			"Saúdam-me com um olhar agridoce...";
		int espacos = 0,
		vogais = 0,
		letras = 0;
		
		//analisa todos os caracteres da String
		int poemLegth = poem.length();
		for(int i = 0; i< poemLegth; ++i){
			//chega se for vogal
			char ch = Character.toLowerCase(poem.charAt(i));
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vogais++;
			}
			
			//checa se são letras
			if(Character.isLetter(ch)){
				letras++;
			}
			
			//checa se são letras
			if(Character.isWhitespace(ch)){
				espacos++;
			}
			
		}
		System.out.println("O poema contém: vogais " + vogais + "\n" + "consonantes: " + (letras-vogais) + "\n" +	"espaços:" + espacos);
	}
}