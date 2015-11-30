public class Fatorial {
	public static void main(String args[]){
		long limit = 20L;
		long fatorial = 1L;
		for(long i = 1L; i < limit; i++){
			fatorial = 1L;
			for(long factor = 2; factor <= i; ++factor){
				fatorial *= factor;
			}
			
			System.out.println(i + " é  " + fatorial);
		}
	}
}