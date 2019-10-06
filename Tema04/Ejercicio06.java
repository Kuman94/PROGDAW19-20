import java.util.Scanner;
public class Ejercicio06 {
  public static void main(String[] args){
	Scanner i= new Scanner(System.in);
	
	System.out.println("En este programa podras calcular el tiempo que tarda en caer un objeto desde una altura determinada.");
	System.out.println("Determine la altura desde donde cae el objeto");
	
	double h=i.nextDouble();
	
	double t=Math.sqrt((2*h)/9.81);
	System.out.printf("El tiempo que tarda en caer es: %.2f segundos.",t);
	
  }
}
