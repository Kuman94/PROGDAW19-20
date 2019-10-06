import java.util.Scanner;
public class Ejercicio05 {
  public static void main(String[] args){
	  
	Scanner d=new Scanner(System.in);
	
	System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
	System.out.println("Por favor, introduce la variable 'a'.");
	double a=d.nextDouble();
	System.out.println("Por favor, introduce la variable 'b'.");
	double b=d.nextDouble();
	
	double x=-b/a;
	
	if(a==0){
		System.out.println("Esta ecuacion no tiene solucion real");	
		
	}else{
		System.out.println("En esta ecuacion la 'x' vale: "+x);	
	}
	
	
  }
}
