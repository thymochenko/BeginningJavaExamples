public class LogicIfElse{
	public static void main(String args[]){
		int number = 0;
		number = 1 + (int)(100 * Math.random());
		if(number % 2 == 0){
			if(number < 50){
				System.out.println("você tem um número par menor que 50 que é : ( " + number + ")");
			}
			else if(number > 60 && number < 90){
				System.out.println("você tem um número maior que 60 e menor que 90, que é: (" + number + ")");
			}
			else{
				System.out.println("You have got an par number, " + number);
			}
			
		}
		else if(number > 50){
			System.out.println("You have got an ímpa maior que 50 number : , " + number);
		}
		else{
			System.out.println("You have got an ímpa menor que 50 number : , " + number);
		}
	}
}
