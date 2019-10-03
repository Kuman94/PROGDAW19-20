import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
		    
	System.out.println("Bienvenido al conversor de Kb a Mb, por favor, introduce la cantidad que desea convertir.");
	double kb=s.nextInt();
	double mb= kb*0.00097656;
    System.out.printf("La cantidad introducida son: %1.0f Mb.",mb);
		    
  }
}

