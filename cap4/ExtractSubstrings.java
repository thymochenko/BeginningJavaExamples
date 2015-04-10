public class ExtractSubstrings{
	public static void main(String args[]){
		String text = "to be or not to be";
		int count = 0;
		char separator = ' ';
		//determine o número de substrings
		int index = 0;
		do{
			++count;
			++index;
			index = text.indexOf(separator,index);
		} while(index != -1);
		
		//coloca as substrings dentro de um array
		String[] subStr = new String[count];
		index = 0;
		int endIndex = 0;
		for(int i = 0; i < count; ++i){
			endIndex = text.indexOf(separator,index);
			if(endIndex == -1){
				subStr[i] = text.substring(index);
			} else {
				subStr[i] = text.substring(index, endIndex);
			}
			
			index = endIndex + 1;
		}
		
		//mostra substrings
		for(String s : subStr){
			System.out.println(s);
		}
	}
}