import java.util.Scanner;
public class Ejercicio07 {
  public static void main(String[] args){
	
	Scanner i=new Scanner(System.in);
    System.out.println("Este programa calcula la medida de las tres notas introducidas a continuacion:");
    double not1=i.nextDouble();
    double not2=i.nextDouble();
    double not3=i.nextDouble();
    double med=(not1+not2+not3)/3;
    
    System.out.printf("La media de las tres notas es %.2f.",med);
    
    
  }
}
