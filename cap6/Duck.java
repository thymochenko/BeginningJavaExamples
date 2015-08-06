public class Duck extends Animal {
	
	protected String name;
	protected String breed;
	
	public Duck(String aName){
		super("CAT");
		name = aName;
		breed = "desconhecido";
	}
	
	public Duck(String aName, String aBreed){
		super("Duck");
		name = aName;
		breed = aBreed;
	}
	
	@Override
	public String toString(){
		return super.toString() + "\n Este é " + name + " O " + breed;
	}
	
	@Override
	public void sound(){
		System.out.println("Quack Quack Quack");
	}
}