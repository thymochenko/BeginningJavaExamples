import static java.lang.Math.sqrt;

class Point {
	//coordenadas
	double x;
	double y;
	
	//construtor
	Point(double xVal, double yVal ){
		x = xVal;
		y = yVal;
	}
	
	//clone java method
	Point(final Point oldPoint){
		x = oldPoint.x;
		y = oldPoint.y;
	}
	
	//move point
	void move(double xDelta, double yDelta){
		x += xDelta;
		y += yDelta;
	}
	
	//calculate the distance
	double distance(final Point aPoint){
		return sqrt((x - aPoint.x ) * (x - aPoint.x) + (y - aPoint.y) * (y - aPoint.y));
	}
	
	public String toString(){
		return Double.toString(x) + " , " + y;
	}
}