import java.util.Random;

public class BreakFast {
	enum Menu {  
		ovos_mechidos_com_baicon, //1
		salada_de_frutas, //2
		bolo_de_mandioca,//3
		cuscus_com_peixe,//4
		cuscus_com_calabresa,//5
		pao_com_pate //6
	}
	
	static final char
		OVOS_M_C_B = '1',
		SALAD_D_F = '2',
		BOLO_D_M = '3',
		CUSCUS_C_P = '4',
		CUSCUS_C_C = '5',
		PAO_C_P = '6';
	
	public static void main(String args[]){
		final String menu_list = "123456";
		final int N = menu_list.length();
		Random r = new Random();

		breakFastLoop: for (int i = 1; i <= 6; i++) {
			char optionBreakFast = menu_list.charAt(r.nextInt(N));
			switch(optionBreakFast){
				case OVOS_M_C_B :
					System.out.println("Sua opção de café da manhã é a opção (" +  optionBreakFast  +") " + Menu.ovos_mechidos_com_baicon.toString());
				break breakFastLoop;
				case SALAD_D_F :
					System.out.println("Sua opção de café da manhã é a opção (" +  optionBreakFast  +") " + Menu.salada_de_frutas.toString());
				break breakFastLoop;
				case BOLO_D_M :
					System.out.println("Sua opção de café da manhã é a opção (" +  optionBreakFast  +") " + Menu.bolo_de_mandioca.toString());
				break breakFastLoop;
				case CUSCUS_C_P :
					System.out.println("Sua opção de café da manhã é a opção (" +  optionBreakFast  +") " + Menu.cuscus_com_peixe.toString());
				break breakFastLoop;
				case CUSCUS_C_C				:
					System.out.println("Sua opção de café da manhã é a opção (" +  optionBreakFast  +") "  + Menu.cuscus_com_calabresa.toString());
				break breakFastLoop;
				case PAO_C_P :
					System.out.println("Sua opção de café da manhã é a opção (" +  optionBreakFast  +") "  + Menu.pao_com_pate.toString());
				break breakFastLoop;
				default :
					System.out.println("nenhuma das opções " + optionBreakFast);
				break;
			}
		}
	}
}