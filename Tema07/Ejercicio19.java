import java.util.Scanner;
public class Ejercicio19 {
  public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int posicion;
	int numero;
	int[] n=new int [12];
	
	for(int i=0;i<12;i++){
	  n[i]=(int)(Math.random()*201);
	  System.out.print(n[i]+" ");
	}
	System.out.println("");
	System.out.print("Introduzca el número que quiere insertar: ");
	numero=in.nextInt();
	System.out.print("Introduzca la posición donde lo quiere insertar (0 – 11): ");
	posicion=in.nextInt();
	
	for(int i=11;i>posicion;i--){
	  n[i]=n[i-1];
	}
	n[posicion]=numero;
	
	for(int i=0;i<12;i++){
	  System.out.print(n[i]+" ");
	}
	
  }
}
