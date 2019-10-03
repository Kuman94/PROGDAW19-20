import java.util.Scanner;
public class Ejercicio08 {
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
  
    System.out.println("¿Cuántas horas trabajas a la semana?");
    int horas=s.nextInt();
    int sueldo=horas*12;
    System.out.println("El sueldo que le corresponde semanalmente es: "+sueldo);
  }
}
