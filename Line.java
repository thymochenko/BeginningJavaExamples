package cap5;

class Line{
	Point start;
	Point end;
	
	//create a line from two points
	Line(final Point start, final Point end){
		this.start = new Point(start);
		this.end = new Point(end);
	}
	
	//create a line from two coordinates	 pairs
	Line(double xStart, double yStart, double xEnd, double yEnd){
		start = new Point(xStart, yStart);
		end = new Point(xEnd, yEnd); 
	}
	
	double length(){
		return start.distance(end);
	}
	
	public String toString(){
		return "(" + start + ") : (" + end + ")";
	}
	
	Point intersects(final Line line1){
		Point localPoint = new Point(0,0);
		double num = ( end.y - start.y ) * (start.x - line1.start.x) - 
								(end.x - start.x) * (start.y - line1.start.y);
								
		double denom  = ( end.y - start.y ) * (line1.end.x - line1.start.x) - 
								     (end.x - start.x) * (line1.end.y - line1.start.y);
		localPoint.x = line1.start.x + (line1.end.x - line1.start.x) * num /denom;
		localPoint.y = line1.start.y  +  (line1.end.y - line1.start.y) * num /denom;
		return localPoint;
	}
}