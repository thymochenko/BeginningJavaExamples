public class LuckyStar{
	public static String[] stars = {
		"Maynard", "Marilin Manson", "Dimebag Darrel",
		" David Groh", "Florencen", "Orien Lavier", "Ian Curtis",
		" Tom York ", " Bruce Dickinson ", " Flor Jansen", "Michael Paton", "Trent Reznor"
	};

	
	public static String getStars(){
		return stars[(int)(stars.length * Math.random())];
	}
		
	public static void main(String args[]){
		System.out.println("Visualize sua estrela de hoje = " + getStars());
	}
}