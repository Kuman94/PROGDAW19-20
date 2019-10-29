import java.util.Scanner;
public class Ejercicio13 {
  public static void main(String[] args){
	Scanner i=new Scanner(System.in);
	int positivos=0;
	int negativos=0;
	System.out.println("Este programa dira cuantos de los números introducidos son positivos y cuantos son negativos.");
	
	for(int cont=0;cont<10;cont++){
	  System.out.println("Introduce un numero: ");
	  int n=i.nextInt();
	  if(n>=0){
		positivos++;
	  }else{
		negativos++;
	  }
	}
	
	System.out.println("Hay "+positivos+" positivos y "+negativos+" negativos.");
  }
}
