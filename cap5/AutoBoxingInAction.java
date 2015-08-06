class AutoBoxingInAction {
	public static void main(String[] args){
		int[] value = {1, 23, 456, 332, 55};
		
		Integer[] obj = new Integer[value.length];
		
		for(int i =0; i < value.length; ++i){
			obj[i]= boxInteger(value[i]);
		}
		
		for(Integer intObject : obj){
			unboxInteger(intObject);
		}
	}
	
	public static Integer boxInteger(Integer obj){
		return obj;
	}
	
	public static void unboxInteger(int n){
		System.out.println("values = " + n);
	}
}