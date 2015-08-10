public class Dog extends Animal {
	
	protected String  name;
	protected String breed;
	
	public Dog(String aName){
		super("Dog");
		name = aName;
		breed = "desconhecido";
	}
	
	public Dog(String aName, String aBreed){
		super("Dog");
		name = aName;
		breed = aBreed;
	}
	
	//copy constructor
	public Dog(Dog dog){
		super(dog);
		name = dog.name;
		breed = dog.breed;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public String getBreed(){
		return breed;
	}
	
	@Override
	public String toString(){
		return  super.toString() + " #{" + name + " o " +  breed + "}";
	}
	
	@Override
	public void sound(){
		System.out.println("WOLF WOLF");
	}
	
}