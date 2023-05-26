public class Exe1012 implements Runnable{

    private double A;
    private double B;
    private double C;

    public Exe1012(double A, double B, double C){
	setA(A);
	setB(B);
	setC(C);
    }
    public void setA(double A){
	this.A = A;
    }
    public double getA(){
	return A;
    }
    public void setB(double B){
	this.B = B;
    }
    public double getB(){
	return B;
    }
    public void setC(double C){
	this.C = C;
    }
    public double getC(){
	return C;
    }
    public double areaTriangulo(){
	return (A * C) / 2;
    }
    public double areaCirculo(){
	return 3.14159 * (Math.pow(C, 2));
    }
    public double areaTrapezio(){
	return ((A + B) * C) / 2;
    }
    public double areaQuadrado(){
	return B * B;
    }
    public double areaRetangulo(){
	return A * B;
    }
    public void run(){
	areaTriangulo();
	areaCirculo();
	areaTrapezio();
	areaQuadrado();
	areaRetangulo();
    }

}
