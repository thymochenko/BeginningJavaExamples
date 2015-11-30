public class Primes{
	public static void main(String args[]){
		int nvalues = 50;
		boolean isPrime = true;
		for(int i = 2; i < nvalues; i++){
			isPrime = true;
			for(int j = 2; j < i; j++){
				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				System.out.println(i);
			}
		}
	}
}