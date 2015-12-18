public class Animal {
	
	private String aType;
	
	public Animal(String aType){
		this.aType = new String(aType);
	}
	
	public String toString(){
		return "Este é {__construtorPai__} : " + this.aType;
	}
}
