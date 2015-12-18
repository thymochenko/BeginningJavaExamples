public class Dog extends Animal {
	
	protected String name;
	protected String breed;
	
	public Dog(String aName){
		super("dog");
		this.name = aName;
		this.breed = "desconhecido";
	}
	
	public Dog(String aName, String aBreed){
		super("Dog");
		this.name = aName;
		this.breed = aBreed;
	}
	
	@override
	public String toString(){
		return super.toString() + "Este e o belo #{" + name +   " " + breed  + "}";
	}
}