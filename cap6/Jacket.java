public class Jacket {
	
	private JacketSize size;
	private JacketColor color;
	
	public Jacket(JacketSize size, JacketColor color){
		this.size = size;
		this.color = color;
	}
	
	@Override
	public String toString(){
		StringBuffer str = new StringBuffer("Jacket");
		return str.append(size).append(" in ").append(color).toString();
	}
}