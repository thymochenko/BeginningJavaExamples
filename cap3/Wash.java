import java.io.*;

public class Wash{
	
	enum WashChoice { coton, line, wool }
	
	public static void main(String args[]){
		try {
			//input
			InputStreamReader read = new InputStreamReader(System.in);
			BufferedReader buff = new BufferedReader(read);
			//clother(roupas tipo) onde 1 - coton; 2 - line; 3 - wool; 
			String clothers = buff.readLine();
			//choices of wash
			int _clothers = Integer.parseInt(clothers);
			//enum array
			String[] wash = new String[3];
			//choice clothers
			switch(_clothers){	
				case 0 :
					System.out.println("Tipo de roupa coton");
					wash[0] = WashChoice.coton.toString();
					break;
				case 1 :
					System.out.println("Tipo de roupa de linho");
					wash[1] = WashChoice.line.toString();
					break;
				case 2 :
					System.out.println("Tipo de roupa de lã");
					wash[2] = WashChoice.wool.toString();
					break;
				default :
					System.out.println("******* Nenhuma Escolha *******");
				break;
			}
			switch(wash[_clothers]){
				case "coton" :
					System.out.println("Roupa sendo  processada em 170 graus");
				break;
				case "line" :
					System.out.println("Roupa sendo  processada em 180 graus");
				break;
				case "wool" :
					System.out.println("Roupa sendo  processada em 120 graus");
				break;
				default :
					System.out.println("******* Nenhuma Escolha *******");
				break;
			}
		}catch(Exception e){}
	}
}
