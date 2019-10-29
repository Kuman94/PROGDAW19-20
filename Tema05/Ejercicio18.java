import java.util.Scanner;
public class Ejercicio18 {
  public static void main(String[] args){
	Scanner i=new Scanner(System.in);
	int primero;
	int segundo;
	int n1;
	int n2;
	int incremento=0;
	System.out.println("Este programa muestra la sucesion de 7 en 7 de los dos números que introduzcas.");
	
	do{
	  System.out.println("Por favor introduce el primer número");
	  primero=i.nextInt();
	  System.out.println("Por favor introduce el primer número");
	  segundo=i.nextInt();
	  
	  if(primero==segundo){
		System.out.println("Los numeros introducidos deben ser diferentes, pruebe de nuevo.");
	  }
	}while(primero==segundo);
	
	if(primero<segundo){
	  n1=primero;
	  n2=segundo;
	}else{
	  n1=segundo;
	  n2=primero;
	}
	System.out.print(n1);
	
	for(int cont=7;incremento<(n2-7);cont=cont+7){
	  incremento=n1+cont;
	  System.out.print(", "+incremento);
	}
	System.out.print(", "+n2);
  }
}
