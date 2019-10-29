import java.util.Scanner;
public class Ejercicio21 {
  public static void main(String[]args){
	Scanner i=new Scanner(System.in);
	int contador=0;
	int impares=0;
	int sumaImpares=0;
	int mayorPar=0;
	
	int n;
	
	do{
	  System.out.println("Introduce un numero.");
	  n=i.nextInt();
	  
	  if(n>=0){
	    contador++;
	    if(n%2==0){
		  if(n>mayorPar){
		    mayorPar=n;
		  }
	    }else{
		  impares++;
		  sumaImpares+=n;
	    }
	  }
	  
	}while(n>=0);
	
	double mediaImpar=(double)sumaImpares/(double)impares;
	System.out.println("Se han introducido "+contador+" numeros.");
	System.out.println("La media de los números impares es: "+mediaImpar);
	System.out.println("El mayor de los pares es: "+mayorPar);
	
	
  }
}
