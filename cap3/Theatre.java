import java.io.*;

public class Theatre {
	enum Attraction { stand_up, dance, show_rock, monolog, infantil }
	
	public static void main(String args[]){
		int age = 0;
		double ticket = 50.0;
		double porcent = 0.0;
		double result = 0.0;
		boolean incrementTicket = false; 
		
		try {
			InputStreamReader read  = new InputStreamReader(System.in);
			BufferedReader buffer = new BufferedReader(read);
			System.out.println("Informe a sua Idade");
			String age_input = buffer.readLine();
			System.out.println("Informe a sua atração");
			String attraction = buffer.readLine();	
			age = Integer.parseInt(age_input);
		
			if((age > 13 && age < 16) || (age >= 60 && age <= 65)){
				if(!attraction.equals(Attraction.show_rock.toString()) || attraction.equals(Attraction.dance.toString())){
					porcent = 15.0 / 100; //15% 
				}
			}

			if(attraction.equals(Attraction.stand_up.toString())){
				porcent = 20.0 /100; //20%
				incrementTicket = true;
			}
			
			result = (incrementTicket == true) ? ticket + (porcent * ticket) : ticket - (porcent * ticket);
			System.out.println(" O valor do seu ingresso custa " + result);
		}
		catch(Exception e){}
	}
}