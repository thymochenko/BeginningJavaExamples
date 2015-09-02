public class TryPolyLine {

	public static void main(String[] args){
		double coords[][] = {{1,1}, {1,2}, {2,3}, {-3,5}, {-5,1}, {0,0} };
		PolyLine polygon = new PolyLine(coords);
		System.out.println(polygon);
		polygon.addPoint(10,10);
		System.out.println(polygon);
		Point points[] = new Point[coords.length];
		for(int i = 0; i< points.length; ++i){
			points[i] = new Point(coords[i][0], coords[i][1]);
			PolyLine newPoly = new PolyLine(points);
			System.out.println(newPoly);
		}
	}
	
} 