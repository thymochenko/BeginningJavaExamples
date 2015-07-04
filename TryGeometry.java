public class TryGeometry {
	public static void main(String[] args){
		//cria dois pontos
		Point start = new Point(0.0, 1.0);
		Point end = new Point(5.0, 6.0);
		System.out.println("Points created are #{" + start + "} and #{" + end + "}");
		
		//cria duas linhas
		Line line1 = new Line(start, end);
		Line line2 = new Line(0.0, 3.0, 3.0, 0.0);
		System.out.println("Lines created are #{" + line1+ "} and #{" + line2 + "}");
		
		//mostra a intersecção
		System.out.println("intersecção é  #{" + line2.intersects(line1));
		//move o final da linha 1 e mostra a nova intersecção
		System.out.println("intersecção é  #{" + line1.intersects(line2));
	}
}