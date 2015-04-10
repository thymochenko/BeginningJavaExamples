public class ArrayTest {
	public static void main(String args[]){
		double[] collection = new double[10];
		for(int i=0; i< collection.length; ++i){
			collection[i] = 100.0 * Math.random();
			System.out.println(" -> " + collection[i]);
		}		
	}
}