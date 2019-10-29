import java.util.Scanner;
public class Ejercicio11 {
  public static void main(String[]args){
	Scanner i=new Scanner(System.in);
	System.out.println("Introduce un número:");
	int n=i.nextInt();
	
	for(int cont=0;cont<5;cont++){
	  int cuadrado=n*n;
	  int cubo=n*n*n;
	  System.out.printf("%d %8d %8d\n",n,cuadrado,cubo);
	  n++;
	}
	
  }
}
