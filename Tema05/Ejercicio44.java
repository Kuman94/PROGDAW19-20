import java.util.Scanner;
public class Ejercicio44 {
  public static void main(String[] args){
	Scanner i=new Scanner(System.in);
	System.out.println("Por favor, introduzca un número entero positivo: ");
	int ni=i.nextInt();
	System.out.println("Introduzca la posición donde quiere insertar: ");
	int posicion=i.nextInt();
	System.out.println("Introduzca el dígito que quiere insertar:");
	int digito=i.nextInt();
	
	int n=ni;
	int longitud=0;
	
	while(n>0){
	  n/=10;
	  longitud++;
	}
	
	long parteiz=ni/(long)Math.pow(10,(longitud-posicion)+1);
	long partede=ni%(long)Math.pow(10,(longitud-posicion)+1);
	long resultado=(parteiz*10+digito)*(long)Math.pow(10,(longitud-posicion)+1)+partede;
	
	System.out.println("El número resultante es: "+resultado);
	
  }
}
