public class Dog extends Animal {
	protected String name;
	protected String breed;
	
	public Dog(String aName){
		super("dog");
		this.name = aname;
		this.breed = "desconhecido";
	}
	
	public Dog(String aName, String aBreed){
		super("Dog");
		this.name = aName;
		this.breed = aBreed;
	}
}