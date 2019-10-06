import java.util.Scanner;
public class Ejercicio11 {
  public static void main(String[] args){
	Scanner i=new Scanner(System.in);
	
	System.out.println("Este programa calcula el tiempo que queda hasta media noche en segundos.");
	System.out.println("Por favor, introduce la hora en formato digital (Ej.: 16):");
	int hora=i.nextInt();
	System.out.println("Ahora introduzca los minutos exactos:");
	int min=i.nextInt();
	
	if(min==0){
	  min=60;
	}
	
	int hora2=(24-hora)*3600;
	int min2=(60-min)*60;
	int segundos=hora2+min2;
	
	System.out.println("Faltan "+segundos+" segundos para medianoche.");
	  
  }
}
