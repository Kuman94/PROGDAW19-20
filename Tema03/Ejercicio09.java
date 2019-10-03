import java.util.Scanner;
import java.math.*;
public class Ejercicio09 {
  public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	  
	System.out.println("Este programa calcula el volumen de un cono.");
	System.out.println("Introduce el radio en metros");
	int r=s.nextInt();
	System.out.println("Introduce la altura en metros");
	int h=s.nextInt();
	double volumen=(Math.PI*r*r*h)/3;
	System.out.printf("El volumen del cono es: %1.2f metros cubicos",volumen);
  }
}
