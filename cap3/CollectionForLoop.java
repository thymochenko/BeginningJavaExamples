public class CollectionForLoop {
	
	enum Lanches { bolo, sanduiche, rocambole, manue, coxinha }
	
	public static void main(String args[]){
		for(Lanches lanche : Lanches.values()){
			System.out.println("Meus lanches são: " + lanche);
		}
	}
}