import java.util.Scanner;
public class Ejercicio10 {
  public static void main(String[] args){
    Scanner i=new Scanner(System.in);
    int suma=0;
    int n=0;
    int cont;
    System.out.println("Este programa calcula la media de los números introducidos.");
    for(cont=0;n>=0;cont++){
      System.out.println("Introduce un número:");
      n=i.nextInt();
      if(n>=0){
        suma=suma+n;
      }
    }
    
    int media=suma/(cont-1);
    System.out.println("La media de los números introducidos es: "+media);
    
  }
}
