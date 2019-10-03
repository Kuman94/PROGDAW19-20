import java.util.Scanner;
public class Ejercicio05 {
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Bienvenido, en este programa se calculará el area de un rectangulo.");
    System.out.println("Introduzca la base en metros.");
    int base=s.nextInt();
    System.out.println("Introduzca la altura en metros.");
    int altura=s.nextInt();
    int area= base*altura;
    System.out.println("El area del rectangulo es: "+area+" metros cuadrados.");
  }
}
