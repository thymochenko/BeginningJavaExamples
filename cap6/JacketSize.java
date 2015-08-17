public enum JacketSize {
	small(36), medium(40), large(42), extra_large(46), extra_extra_large(48);
	
	private int chestSize;
	//constructor
	JacketSize(int chestSize){
		this.chestSize = chestSize;
	}
	
	public int chestSize(){
		return chestSize;
	}
}