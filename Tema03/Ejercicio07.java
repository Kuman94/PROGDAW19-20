import java.util.Scanner;
public class Ejercicio07 {
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
		
	System.out.println("Introduzca el valor del primer producto.");
	int prod1=s.nextInt();
	System.out.println("Introduzca el valor del segundo producto.");
	int prod2=s.nextInt();
	System.out.println("Introduzca el valor del tercer producto.");
	int prod3=s.nextInt();
	int suma=prod1+prod2+prod3;
	double total=1.21*suma;
		    
    System.out.printf("El total de la factura es %1.2f € (IVA incluido).",total);
  }
}

