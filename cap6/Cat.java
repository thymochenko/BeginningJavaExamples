public class Cat extends Animal {
	
	protected String name;
	protected String breed;
	
	public Cat(String aName){
		super("CAT");
		name = aName;
		breed = "desconhecido";
	}
	
	public Cat(String aName, String aBreed){
		super("CAT");
		name = aName;
		breed = aBreed;
	}
	
	@Override
	public String toString(){
		return super.toString() + "\n Este é " + name + " O " + breed;
	}
	
	@Override
	public void sound(){
		System.out.println("Miaooww");
	}
}