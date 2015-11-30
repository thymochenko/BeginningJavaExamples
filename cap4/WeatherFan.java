public class WeatherFan{
	public static void main(String args[]){
		float[][] temperatura = new float[10][365];
		//gera as temperaturas radômicas
		for(int i = 0; i < temperatura.length; ++i){
			for(int j=0; j < temperatura[i].length; ++j){
				temperatura[i][j] = (float)(45.0 * Math.random() - 10.0);
			}
		}
		
		//calcula a média por localização
		for(int i=0;i<temperatura.length;++i){
			float average = 0.0f;
			
			for(int j=0;j<temperatura[i].length; ++j){
				average += temperatura[i][j];
			}
			
			System.out.println("Average temperature at location "+ (i+1) +
			" = " + average/(float)temperatura[i].length);
		}
	}
}