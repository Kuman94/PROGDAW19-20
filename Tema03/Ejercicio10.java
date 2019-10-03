import java.util.Scanner;
public class Ejercicio10 {
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    
    System.out.println("Bienvenido al conversor de Mb a Kb, por favor, introduce la cantidad que desea convertir.");
    int mb=s.nextInt();
    int kb= mb*1024;
    System.out.println("La cantidad introducida son: "+kb+" Kb.");
    
  }
}
