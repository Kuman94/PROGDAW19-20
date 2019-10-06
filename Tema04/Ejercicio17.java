import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args){
	Scanner i=new Scanner(System.in);
	System.out.println("Instroduce un numero y se le devolvera la ultima cifra de este.");
	int n=i.nextInt();
	int nfinal=n%10;
	System.out.println("La última cifra del numero es: "+nfinal);
  }
}
