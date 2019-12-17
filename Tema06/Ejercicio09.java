
public class Ejercicio09 {
  public static void main(String[] args){
	int n;
	int contador=0;
	
	do{
	  n=(int)(Math.random()*101);
	  System.out.print(n+" ");
	  contador++;
		
	}while(n!=24);
	System.out.print("\nSe han generado "+contador+" números.");
  }
}
