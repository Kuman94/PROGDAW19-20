import java.util.Scanner;
public class Ejercicio04 {
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	  
	System.out.println("¿Cuántas horas trabajas a la semana?");
	int horas=s.nextInt();
	int sueldo;
	
	if (horas>40){
	  sueldo=12*40+(horas-40)*16;
	  System.out.println("El sueldo que le corresponde semanalmente es: "+sueldo);
	  
	}else{
		sueldo=horas*12;
		System.out.println("El sueldo que le corresponde semanalmente es: "+sueldo);
      
	}
	
  }
}

