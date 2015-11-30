public class LinkedList {
	
	private ListItem start = null;
	private ListItem end = null;
	private ListItem current = null;
	
	public LinkedList(){}
	
	// Constructor to create a list containing one object
	public LinkedList(Object item) {
		if(item != null) {
			current = end = start = new ListItem(item); // item is the start and end
		}	
	}
	
	//linkedList from array
	public LinkedList(Object[] item){
		if(items != null){
			for(Object item : items){
				addItem(item);
			}
			current = start;
		}
	}
	
	public void addItem(Object item){
		ListItem newEnd = new ListItem(item);
		if(start == null){
			start = end = newEnd;
		}else{
			end.next = newEnd;
			end = newEnd;
		}
	}
	
	//get the first objet to the list
	public Object getFirst(){
		current = start;
		return start == null ?  null : start.item;
	}
	
	//pega o próximo objeto da lista
	public Object getNext(){
		if(current != null){
			current = current.next;
		}
		return current == null ? null : current.item;
	}
	
	private class ListItem{
		
	}
}	