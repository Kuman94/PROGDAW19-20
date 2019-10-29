import java.util.Scanner;
public class Ejercicio26 {
  public static void main(String[] args){
	Scanner i=new Scanner(System.in);
	System.out.println("Introduce un número: ");
	int ni=i.nextInt();
	System.out.println("Ahora, introduce un digito que aparezca en el número anterior: ");
	int digito=i.nextInt();
	
	int n=ni;
	int aux=0;
	int digitoaux;
	int posicion=0;
	
	while(n>0){
	  aux=(aux*10)+n%10;
	  n/=10;
	}
	
	do{
	  digitoaux=aux%10;
	  posicion++;
	  aux/=10;
	  
	}while(digitoaux!=digito);
	
	System.out.println("El "+digito+" está en la posición "+posicion+" en el número "+ni);
  }
}
