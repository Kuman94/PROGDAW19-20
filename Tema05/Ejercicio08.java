import java.util.Scanner;
public class Ejercicio08 {
  public static void main(String[] args){
    Scanner i=new Scanner(System.in);
    System.out.println("Este programa muestra la tabla de multiplicar del numero que elija.");
    System.out.println("Por favor, introduzca un numero:");
    int n=i.nextInt();
    int cont=0;
    int multiplo;
    
    while(cont<=10){
    	
      multiplo=n*cont;
      System.out.println(n+"x"+cont+" = "+multiplo);
      cont++;
    }   
  }
}
