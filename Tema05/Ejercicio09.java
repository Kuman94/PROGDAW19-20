import java.util.Scanner;
public class Ejercicio09 {
 public static void main(String[] args){
   Scanner i=new Scanner(System.in);
   System.out.println("Este programa indica el número de digitos que tiene un número.");
   System.out.println("Por favor, Introduzca un número.");
   int n=i.nextInt();
   int cont=1;
   
   for(int comparador=10;n>comparador;comparador=comparador*10){
	   cont++;
   }
   
   System.out.println("El numero introducido tiene "+cont+" dígitos.");
 }
}
