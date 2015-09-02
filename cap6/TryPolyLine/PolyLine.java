public class PolyLine {
	
	private ListPoint start;
	private ListPoint end; 
	
	public PolyLine(Point[] points){
		if(points != null){
			for(Point p : points){
				addPoint(p);
			}
		}
	}
	// Construct a polyline from an array of coordinates
	public PolyLine(double[][] coords) {
		if(coords != null) {
			for(int i = 0; i < coords.length ; ++i) {
				addPoint(coords[i][0], coords[i][1]);
			}
		}
	}
	
	public void addPoint(Point point){
		ListPoint newEnd = new ListPoint(point);
		if(start == null){
			start = newEnd;
		} else{
			end.setNext(newEnd);
		}
		
		end = newEnd;
	}
	// Add a point defi ned by a coordinate pair to the list
	public void addPoint(double x, double y) {
		addPoint(new Point(x, y));
	}

	@Override
	public String toString(){
		StringBuffer str = new StringBuffer("PolyLine");
		ListPoint nextPoint = start;
		while(nextPoint != null){
			str.append(" " + nextPoint);
			nextPoint = nextPoint.getNext();
		}
		return str.toString();
	}
	
}