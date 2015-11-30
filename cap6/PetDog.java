public class PetDog extends Dog{
	//constructor
	protected Flea petFlea;
	
	public PetDog(String name, String breed, String fleaName, String fleaSpecies){
		super(name,breed);
		petFlea = new Flea("Marx", "Circus Flea");
	}
	
	//copy constructor
	public PetDog(PetDog pet){
		super(pet);
		petFlea = new Flea(pet.petFlea);
	}
	
	public Flea getFlea(){
		return petFlea;
	}
	
	@Override
	public void sound(){
		System.out.println("Wooof");
	}
	
	@Override
	public String toString(){
		return super.toString() + "- a pet dog.\nIt has a fl ea:\n" + petFlea;
	}
}