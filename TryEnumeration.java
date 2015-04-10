import static java.lang.Integer.toBinaryString;
//pagina 64
public class TryEnumeration {
    
	enum Day {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}
	
    public static void main(String[] args){
		Day yesterday = Day.Thursday;
		Day today = Day.Friday;
		Day tomorrow = Day.Saturday;
		
		//saida dos dias em variáveis
		System.out.println("Today is : " + today);
		System.out.println("Tomarrow will be : " + tomorrow);
		System.out.println("yesterday as : " + yesterday);													
	}
}
