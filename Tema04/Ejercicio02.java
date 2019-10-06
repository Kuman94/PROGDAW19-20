import java.util.Scanner;
public class Ejercicio02 {
  public static void main(String[] args){
	Scanner i=new Scanner(System.in);
	
	System.out.println("¿Qué hora es?");
	int hora=i.nextInt();
	
	if(hora>=6 && hora<=12){
	  System.out.println("Buenos dias.");
	
	}else if(hora>=13 && hora<=20){
		System.out.println("Buenas tardes.");
	  
	  }else if(hora>=21 && hora<=5){
		  System.out.println("Buenas noches.");
		
	    }else{
	      
	    	System.out.println("La hora introducida es incorrecta.");
	      }	
  }
}

