public class DuplicateObjects{
	public static void main(String[] args){
		PetDog myPet = new PetDog("Fang", "Chiuaua","Max", "Circus flea");
		System.out.println("\nMy pet details:\n"+ myPet);
		PetDog youPet = new PetDog(myPet);
		System.out.println("\nYour pet details:\n"+youPet);
		youPet.setName("Gnasher");
		youPet.getFlea().setName("Atlas");
		System.out.println("\nYour pet details:\n"+youPet);
		System.out.println("\nMy pet details:\n"+ myPet);
	}
}
 