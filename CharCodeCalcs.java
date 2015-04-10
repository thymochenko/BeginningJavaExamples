public class CharCodeCalcs {
    //pagina 52
    public static void main(String[] args){
		char letter1 = 'A';
		char letter2 = (char)(letter1 + 1);
		char letter3 = letter2;
		
		System.out.println("Segue a seqûecia das letras" + letter1 + letter2 + ++(letter3));
		System.out.println("segue o código decimal das letras: \n" + 
			letter1 + ": " +  Integer.toHexString(letter1) +
			" " + letter2  +  (int)letter2 + 
			" " + letter2  +  (int)letter2 );
	}
}
