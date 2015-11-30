import java.io.*;

public class PrimesIterate{
	
	public static void main(String args[]){
		int nvalues = 1;
		try{
			InputStreamReader read  = new InputStreamReader(System.in);
			BufferedReader buffer = new BufferedReader(read);
			System.out.println("Informe o total de número que vc deseja extrar números primos");
			String _nvalues = buffer.readLine();
			nvalues = Integer.parseInt(_nvalues);
		}catch(Exception e){}
		
		outerLoop:
		for(int i = 2; i < nvalues; i++){
			for(int j = 2; j < i; j++){
				if(i % j == 0){
					continue outerLoop;
				}
			}
			System.out.println(i);
			if(--nvalues == 0){
				break outerLoop;
			}
		}
	}
}