import java.util.Random;

public class TryPolymorphism {
	public static void main(String[] args){
		Animal[] theAnimals = {
			new Dog("Rover", "Poodle"),
			new Cat("Max", "Absissian"),
			new Duck("Dafty", "Aylesbury"),
			new ViraLata("Capitu")
		};
		
		Animal petChoice;
		
		Random select = new Random();
		
		for(int i = 0; i < 5; ++i){
			//retorna um objeto Animal segundo um objeto randômico
			petChoice = theAnimals[select.nextInt(theAnimals.length)];
			System.out.println("\n Sua escolha" + petChoice);
			petChoice.sound();
		}
	}
}