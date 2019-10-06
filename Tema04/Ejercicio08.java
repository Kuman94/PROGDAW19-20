import java.util.Scanner;
public class Ejercicio08 {
  public static void main(String[] args){
		
    Scanner i=new Scanner(System.in);
	System.out.println("Este programa calcula la medida de las tres notas introducidas a continuacion:");
	double not1=i.nextDouble();
	double not2=i.nextDouble();
	double not3=i.nextDouble();
	double med=(not1+not2+not3)/3;
	System.out.printf("La media de las tres notas es %.2f.\n",med);
	
	if(med<5){
	  System.out.println("La calificación es: insuficiente.");
	  
	}else if(med>=5 && med<6){
      System.out.println("La calificación es: suficiente.");
      
	  }else if(med>=6 && med<7){
		System.out.println("La calificación es: bien.");
		  
	    }else if(med>=7 && med<9){
	      System.out.println("La calificación es: notable.");
	      
	      }else{
	    	System.out.println("La calificación es: sobresaliente.");  
	        }
	    	    
  }
}

