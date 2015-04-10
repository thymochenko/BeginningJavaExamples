public class Fatorial2 {
	public static void main(String args[]){
		long limit = 20L;
		long fatorial = 1L;
		outerLoop: 
		for(long i = 1L; i < limit; i++){
			fatorial = 1;
			for(long j = 2L; j <= i; ++j){
				if(i > 10L && i % 2 == 1L){
					continue outerLoop;
				}
				fatorial *= j;
			}
			
			System.out.println(i + " é  " + fatorial);
		}
	}
}