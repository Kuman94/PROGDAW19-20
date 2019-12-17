import java.util.Scanner;
public class Ejercicio14 {
  public static void main(String[] args){
	Scanner i=new Scanner(System.in);
	Scanner s=new Scanner(System.in);
	int oportunidad=5;
	int ngenerado=0;
	int maximo=101;
	int minimo=0;
	String pregunta="";
	
	System.out.print("Introduce un número entre 0 y 100 para que el programa intente adivinarlo: ");
	int npensado=i.nextInt();
	
	
	do{
	  ngenerado=(int)(Math.random()*(maximo-minimo)+minimo);
	  System.out.println(ngenerado);
	  oportunidad--;
	  
	  if(npensado!=ngenerado && oportunidad!=0){
		System.out.print("El número que has pensado, ¿es mayor o menor al número generado?(introduce > ó <)");
		pregunta=s.nextLine();
		
		switch(pregunta){
		  case ">":
			minimo=ngenerado+1;
			break;
			
		  case "<":
			maximo=ngenerado-1;
			break;
		}
	  }else if(ngenerado==npensado){
		System.out.println("¡Bien, he acertado!");
	  }	  
	  
	}while(oportunidad!=0 && npensado!=ngenerado);
	
	if(ngenerado!=npensado){
	  System.out.println("Vaya, no he consegudo acertar el número.");
	}
  }
}
