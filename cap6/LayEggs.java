public class LayEggs {
	public static void main(String[] args){
		Duck aDuck = new Duck("Donald", "Eider");
		Animal aPet = aDuck;
		((Duck)aPet).layEgg();
	}
}