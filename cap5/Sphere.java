class Sphere {
	static final double PI = 3.14;
	static int c  = 0;
	//instance vars
	double radius;                                                                             //raio da esfera
	
	double xCenter, yCenter, zCenter;        //3D cordenadas
	
	Sphere(){
		radius = 1.0;
		//seta as cordenadas.
		xCenter = 0.0;
		yCenter = 0.0;
		zCenter = 0.0;
		++c; 
	}
	
	Sphere(double x,  double y, double z){
		this();
		xCenter = x;
		yCenter = y;
		zCenter = z;
	}
	
	Sphere(double theRadius, double x, double y, double z){
		this(x, y, z);
		radius = theRadius;
	}
	
		
	static int getCount(){
		return c;	
	}
	
	//instance method to calculate volume
	double volume(){
		return 4.0 / 3.0 * PI * radius  * radius  * radius; 
	}
	
}