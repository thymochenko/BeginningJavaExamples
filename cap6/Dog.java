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
	
	@Override
	public String toString(){
		return  super.toString() + " #{" + name + " o " +  breed + "}";
	}
	
	@Override
	public void sound(){
		System.out.println("WOLF WOLF");
	}
	
}