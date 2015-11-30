public class TryJackets {
	public static void main(String[] args){
		Jacket[] jackets = {
			new Jacket(JacketSize.medium, JacketColor.red),
			new Jacket(JacketSize.extra_large, JacketColor.yellow),
			new Jacket(JacketSize.small, JacketColor.green),
			new Jacket(JacketSize.extra_extra_large, JacketColor.blue)
		}; 
		
		//out color
		System.out.println("Jackets colors available are:\n");
		for(JacketColor color : JacketColor.values()){
			System.out.println("  " + color);
		}
		
		//out size
		System.out.println("jackets sizes available are: \n");
		for(JacketSize size: JacketSize.values()){
			System.out.println("  " + size);
		}
		
		System.out.println("\n\nJackets in stock are:");
		for(Jacket jacket : jackets){
			System.out.println(jacket);
		}
	}
}