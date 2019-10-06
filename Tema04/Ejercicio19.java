import java.util.Scanner;
public class Ejercicio19 {
  public static void main(String[] args){
	Scanner i=new Scanner(System.in);
	System.out.println("Este programa determina cuantos dígitos tiene el numero que quieras introducir de hasta 5 cifras, ya sea positivo o negativo.");
	System.out.println("Introduce el numero:");
	int n=i.nextInt();
	
	if(n>=0){
		if(n>=0 && n<10){
		  System.out.println("El numero introducido tiene 1 dígito.");
		}else if(n>=10 && n<100){
		  System.out.println("El numero introducido tiene 2 dígitos.");
		}else if(n>=100 && n<1000){
		  System.out.println("El numero introducido tiene 3 dígitos.");
		}else if(n>=1000 && n<10000){
		  System.out.println("El numero introducido tiene 4 dígitos.");
		}else if(n>=10000 && n<100000){
	      System.out.println("El numero introducido tiene 5 dígitos.");
		}else{
		  System.out.println("El numero introducido no es válido.");
		}
		
	}else if(n<0){
		if(n<0 && n>-10){
			  System.out.println("El numero introducido tiene 1 dígito.");
		}else if(n<=-10 && n>-100){
			  System.out.println("El numero introducido tiene 2 dígitos.");
		}else if(n<=-100 && n>-1000){
			  System.out.println("El numero introducido tiene 3 dígitos.");
		}else if(n<=-1000 && n>-10000){
			  System.out.println("El numero introducido tiene 4 dígitos.");
		}else if(n<=-10000 && n>-100000){
		      System.out.println("El numero introducido tiene 5 dígitos.");
		}else{
			  System.out.println("El numero introducido no es válido.");
		}
	}
  }
}
