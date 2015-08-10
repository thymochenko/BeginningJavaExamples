public abstract class Animal {
	
	private String type; 
	
	public Animal(Animal animal) {
		type = animal.type;
	}

	public Animal(String aType){
		type = new String(aType);
	}
	
	public String toString(){
		return "este Animal é " + type;
	}
	
	public abstract void sound();
}