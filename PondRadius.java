public class PondRadius {
    
    public static void main(String[] args){
		//calcula o raio de uma lagoa
		int fishCount = 20; 	//numero de peixes
		int fishLenght = 10;	//comprimento médio dos peixes
		int inchesPerFoot = 12;	//número de centímeros de um pé.
		int lengthPersqFt = 2;	//O tamanho dos peixes por metro quadrado de superfície
		double radius = 0.0; //raio da lagoa
		
		int feet = 0;				//pés inteiros
		int inches = 0; 			//	polegadas inteiras
		double pondArea = (fishCount * fishLenght)/lengthPersqFt;
		radius = Math.sqrt(pondArea/Math.PI);
		//obter os pés inteiros
		feet = (int) Math.floor(radius);
		inches = (int) Math.round(inchesPerFoot * (radius - feet));
		System.out.println("Para segurar : " + fishCount + "média de peixes " + fishLenght +
		"Polegadas de comprimento você precisa para um lago de área de \n" + pondArea +
		 " pés quadrados é " + feet + " polegadas: "
		 + inches);
	}
}
