public class MySeason {
	enum Season { spring, summer, fall, winter }
	
	public static void main(String args[]){
		Season season = Season.spring;
		if(season.equals(Season.fall)){
			System.out.println(" A estação é igual a outono");
		}
		else{
			System.out.println(" A estação é igual a : " . Season.spring);
		}
		
	}
}