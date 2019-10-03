import java.util.Scanner;
public class Ejercicio04 {
  public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Bienvenido, en el este programa se sumará, restará, dividirá y multiplicará los dos numeros que usted introduzca.¿Cuál es su nombre?");
	String nombre=s.nextLine();
	
	System.out.println("Hola "+nombre+", ¿cuál es el primer número que desea Introducir?");
    int num1=s.nextInt();
		    
	System.out.println("¿Y el segundo?");
	int num2=s.nextInt();
	
	int suma=num1+num2;
	int resta=num1-num2;
	int multiplicacion=num1*num2;
	double division=(double)num1/(double)num2;
	
	System.out.println("El resultado de la suma entre los dos numeros introducidos es: "+suma);
	System.out.println("El resultado de la resta entre los dos numeros introducidos es:"+resta);
	System.out.printf("El resultado de la division entre los dos numeros introducidos es: "+"%1.2f \n",division);
	System.out.println("El resultado de la multiplicacion entre los dos numeros introducidos es: "+multiplicacion);
  }
}

