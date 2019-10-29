import java.util.Scanner;
public class Ejercicio19 {
  public static void main(String[] args){
	Scanner i=new Scanner(System.in);
	Scanner s=new Scanner(System.in);
	System.out.println("Este programa muestra una piramide segun tus gustos.");
	System.out.println("Por favor, introduce la altura.");
	int altura=i.nextInt();
	System.out.println("Ahora introduce el caracter con el que deseas pintarla:");
	String caracter=s.nextLine();
	int piso=1;
	int hueco=0;
	
	// quizas deberia probar con for
	
	while(piso<=altura){
	  if(hueco<altura){
		System.out.print(" ");
		hueco++;
	  }
		
	  piso++;
	}
  }
}
