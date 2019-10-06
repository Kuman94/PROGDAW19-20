import java.util.Scanner;
public class Ejercicio01 {
  public static void main(String[] args){
	String l="EED";
	String m="PRO";
	String x="PRO";
	String j="PRO";
	String v="FOL";
	
	Scanner s=new Scanner(System.in);
	System.out.println("¿Qué dia desea comprobar?");
	String dia=s.nextLine();
	
	switch(dia){
	
	  case "lunes":
		System.out.println("El lunes a primera hora hay "+l+".");
	    break;
	    
	  case "martes":
	    System.out.println("El martes a primera hora hay "+m+".");
		break;
	  
	  case "miercoles":
	    System.out.println("El miercoles a primera hora hay "+x+".");
		break;
		    
	  case "jueves":
		System.out.println("El jueves a primera hora hay "+j+".");
		break;
		    
	  case "viernes":
		System.out.println("El viernes a primera hora hay "+v+".");
		break;
		    
	  default:
		System.out.println("El dia introducido no hay clase o está incorrecto."); 
	}
	
  }
}
