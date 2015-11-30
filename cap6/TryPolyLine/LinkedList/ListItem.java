public class ListItem {
	ListItem next;
	Object item;
	//construtor
	
	public ListItem(Object item){
		this.item = item;
		next = null;
	}
	
	//retorna o nome da classe
	public String toString(){
		return "ListItem" + item;
	}
}