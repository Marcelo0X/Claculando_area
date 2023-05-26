import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe1012test{

    static Scanner ent = new Scanner(System.in);

    public static void main(String[] args){
	calcArea();
    }
    public static void calcArea(){
	List<Exe1012> area = new ArrayList<>();
	try{
	    for(int i = 0; i < 2; i++){
		System.out.print("A ");
		double A = ent.nextDouble();
		System.out.print("B ");
		double B = ent.nextDouble();
		System.out.print("C ");
		double C = ent.nextDouble();
		System.out.println();
		Exe1012 exe = new Exe1012(A, B, C);
		area.add(exe);
	    }
	    Thread.sleep(5000);
	    for(Exe1012 exe: area){
		System.out.printf("Triangulo %.3f%n", exe.areaTriangulo());
		Thread.sleep(3000);
		System.out.printf("Circulo %.3f%n", exe.areaCirculo());
		Thread.sleep(3000);
		System.out.printf("Trapezio %.3f%n", exe.areaTrapezio());
		Thread.sleep(3000);
		System.out.printf("Quadrado %.3f%n", exe.areaQuadrado());
		Thread.sleep(3000);
		System.out.printf("Retangulo %.3f%n", exe.areaRetangulo());
		Thread.sleep(3000);
		System.out.println();
	    }
	}catch(Exception w){
	    System.out.println("Erro. Tente novamente");
	    ent.nextLine();
	    calcArea();
	}
    }

}
