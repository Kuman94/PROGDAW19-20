import java.util.Scanner;
public class Ejercicio23 {
  public static void main(String[] args){
	Scanner i=new Scanner(System.in);
	int suma=0;
	int contador=0;
	int media;
	int n=0;
	
	while(suma<=10000){
	  System.out.println("Introduce un número:");
	  n=i.nextInt();
	  suma+=n;
	  contador++;
	}
	
	suma=suma-n;
	contador--;
	media=suma/contador;
	System.out.println("El total acumulado es: "+suma);
	System.out.println("Se han introducido "+contador+" números");
	System.out.println("La media de los números introducidos es: "+media);
  }
}
