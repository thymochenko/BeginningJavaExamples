class TryInitialization {
	static int[] values = new int[10];
	
	//bloco de inicialização
	static {
		System.out.println("Rodando um bloco de inicialização");
		for(int i = 0; i < values.length ; ++i){
			values[i] = (int) (100.0 * Math.random());
		}
	}

	
	void listValues(){
		System.out.println(" ");
		for(int value : values){
			System.out.println(" " + value);
		}
		System.out.println(" ");
	}
	
	public static void main(String args[]){
		TryInitialization example = new TryInitialization();
		System.out.println(" First object");
		example.listValues(); 
		
		example = new TryInitialization();
		System.out.println(" Second Object");
		example.listValues();
	}
}