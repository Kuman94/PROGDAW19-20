import java.util.Scanner;
public class Ejercicio12 {
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Introduce la nota del primer examen");
    double nota1=(s.nextDouble())*0.4;
	
    System.out.println("¿Qué nota quieres sacar en el trimestre?");
    double media=s.nextDouble();
    
    double nota2=((2*media)-nota1)*0.6;
    
    System.out.printf("Para tener un "+media+" en el trimestre necesitas sacar un %1.2f en el segundo trimestre",nota2);
    
  }
}
