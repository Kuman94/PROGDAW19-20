import java.util.Scanner;
public class Ejercicio07 {
  public static void main(String[] args){
    int combinacion=4321;
    int cont=0;
    int prueba;
    Scanner i=new Scanner(System.in);
    System.out.println("Este programa comprueba la combinacion de la caja fuerte.");
    
    do{
      System.out.println("Introduce la combinación");
      prueba=i.nextInt();
      if(combinacion==prueba){
    	System.out.println("La caja fuerte se ha abierto satisfactoriamente");
      }else{
    	  System.out.println("Lo siento, esa no es la combinación");
      }
      cont++;
    }while(cont<4 && combinacion!=prueba);
  }
}
