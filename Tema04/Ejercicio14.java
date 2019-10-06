import java.util.Scanner;
public class Ejercicio14 {
  public static void main(String[] args){
	Scanner i=new Scanner(System.in);
	
	System.out.println("Este programa determina si un numero es par y/o divisible entre 5.");
	int n=i.nextInt();
	
	if(n%2==0){
	  System.out.println("El numero introducido es par.");
	}else{
      System.out.println("El numero introducido es impar.");
	}
	
	if(n%5==0){
	  System.out.println("El numero introducido es divisible entre 5.");
	}
  }
}
