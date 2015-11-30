public class Flea extends Animal {

	protected String name;
	protected String species;
	
	public Flea(String aName, String aSpecie){
		super("Flea");
		name = aName;
		species = aSpecie;
	}
	
	//copy constructor
	public Flea(Flea flea){
		super(flea);
		name = flea.name;
		species = flea.species;
	}
	
	public void setName(String aName){
		name = aName;
	}
	
	public String getName(){
		return name;
	}
	
	public String getSpecies(){
		return species;
	}
	
	@Override
	public void sound(){
		System.out.println("Psst");
	}
	
	public String toString(){
		return super.toString() + "\nIt’s " + name + " the " + species;
	}
}
