import java.util.Scanner;
public class Ejercicio02 {
  public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Bienvenido al conversor de Euros a pesetas.Introduzca la cantidad que desea convertir.");
	
	double euro=s.nextInt();
	double peseta=euro*166.386;
		    
    System.out.printf("%1.2f"+" € son "+"%1.2f"+" pesetas.",  euro, peseta);
  }
} 


