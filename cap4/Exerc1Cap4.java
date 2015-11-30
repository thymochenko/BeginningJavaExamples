import java.util.Random;

public class Exerc1Cap4 {
	public static void main(String args[]){
		String [] mouths = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
		"Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		double total = 0.0;
		double media = 0.0;
		
		double[] values = new double[12];
		Random random = new Random();
		for(int i = 1; i < values.length; ++i){
			values[i] = (double)random.nextInt(100);
			total += values[i];
			media = total / values.length;
			
			System.out.println("\n Mês : #{" + mouths[i] + "}" + "double value: #{" + values[i]+"}");
		}
		
		System.out.println("\n média #{" + media + "}");
	}
}