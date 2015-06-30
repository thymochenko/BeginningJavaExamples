import java.io.IOException;

public class Fruit {
    public static void main(String[] args){
		int numOranges = 20;
		int numApples = 10;
		int numFruit = 0;
		int vimFruit = numApples + numOranges;
		numFruit =  numOranges++ + numApples;
	        System.out.println("Quantidade Total de frutas");
		System.out.println("Total de frutas é" + numFruit);
		System.out.println(" ****** Aperte Enter para sair ******");
                System.out.println("Vim insertion" + numFruit);
		try {
			System.in.read();
		} catch (IOException e){
			return;
		}
	}

}
