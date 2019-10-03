import java.util.Scanner;
public class Ejercicio06 {
  public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Bienvenido, en este programa se calculará el area de un triangulo.");
    System.out.println("Introduzca la base en metros.");
    int base=s.nextInt();
	System.out.println("Introduzca la altura en metros.");
	int altura=s.nextInt();
	int area= (base*altura)/2;
	System.out.println("El area del triangulo es: "+area+" metros cuadrados.");
  }
}

