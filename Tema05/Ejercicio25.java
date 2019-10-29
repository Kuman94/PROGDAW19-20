import java.util.Scanner;
public class Ejercicio25 {
  public static void main(String[] args){
	Scanner i=new Scanner(System.in);
	System.out.println("Este programa muestra el número que introduzca al revés.");
	System.out.println("Por favor, introduzca un número:");
	int n=i.nextInt();
	int nr;
	
	while(0<n){
	  nr=n%10;
	  System.out.print(nr);
	  n=n/10;	  
	}
  }
}
