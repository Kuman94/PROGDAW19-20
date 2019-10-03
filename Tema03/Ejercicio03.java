import java.util.Scanner;
public class Ejercicio03 {
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
	System.out.println("Bienvenido al conversor de Pesetas a Euros, por favor, introduzca la cantidad en Pesetas que desea convertir.");
    
	double peseta=s.nextInt();
	double euro=peseta/166.386;
				    
    System.out.printf("%1.2f"+" pesetas son "+"%1.2f"+" €.",  peseta, euro);
  }
}


