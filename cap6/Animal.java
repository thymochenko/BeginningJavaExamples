public class Animal {
	
	private String type; 
	
	public Animal(String aType){
		type = new String(aType);
	}
	
	public String toString(){
		return "este Animal é " + type;
	}
	
	public void sound(){}
}