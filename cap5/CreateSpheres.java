class CreateSpheres {
	public static void main(String args[]){
		System.out.println("Number objects #{" + Sphere.getCount() + "} ");
		Sphere ball = new Sphere(4.0, 0.0, 0.0, 0.0);
		System.out.println("Number objects #{" + ball.getCount() + "} ");
		Sphere globe = new Sphere(12.0, 1.0, 1.0, 1.0);
		System.out.println("Number objects #{" + Sphere.getCount() + "} ");
		
		Sphere eigthtBall = new Sphere(10.0, 10.0, 0.0);
		Sphere oddBall = new Sphere();
		System.out.println("Number objects #{" + Sphere.getCount() + "} ");
		
		System.out.println("ball volume #{" + ball.volume() + "}");
		System.out.println("globe volume #{" + globe.volume() + "}");
		System.out.println("eightBall volume #{" + eigthtBall.volume() + "}");
		System.out.println("oddBall volume #{" + oddBall.volume() + "}");
	}
}