import java.util.Random;

public class Lotery{
	public static void main(String args[]){
		int totalRamdomNumber = 46;
		Random r = new Random();
		for(int i=1; i<=5; i++){
			System.out.println("Sequencia " + i + 
			" : " + r.nextInt(totalRamdomNumber) + 
			" " + r.nextInt(totalRamdomNumber) +
			" " +  r.nextInt(totalRamdomNumber) + 
			" " + r.nextInt(totalRamdomNumber) +
			" " +  r.nextInt(totalRamdomNumber));
		}
	}
}