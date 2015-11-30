/**
*class para comparar objetos enum
*/
public class MySeason {
	enum Season { spring, summer, fall, winter }
	
	public static void main(String args[]){
		Season season = Season.winter;
		Season winter = Season.winter;
		if(season.equals(winter)){
			System.out.println(" O inverno está chegaando");
		}
		else{
			System.out.println(" A estação é igual a : " + season.toString());
		}
		
	}
}