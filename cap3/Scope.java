public class Scope {
	public static void main(String args[]){
		int outer = 1;
		{
			int inner = 2;
			System.out.println("inner é igual a = " + inner);
			System.out.println("outer é igual a = " + outer);
			//int outer = 5;
		}
		
		int inner = 3;
		System.out.println("inner é igual a = " + inner);
		System.out.println("outer é igual a = " + outer);
	}
}