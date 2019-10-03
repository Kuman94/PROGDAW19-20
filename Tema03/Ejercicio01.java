import java.util.Scanner;
public class Ejercicio01 {
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    
    System.out.println("Bienvenido a esta calculadora, ¿cuál es el primer número que desea multiplicar?");
    int num1=s.nextInt();
    
    System.out.println("¿Y el segundo?");
    int num2=s.nextInt();
    
    int resultado=num1*num2;
    System.out.println("El resultado de la multiplicacion es: "+resultado);
  }
}
