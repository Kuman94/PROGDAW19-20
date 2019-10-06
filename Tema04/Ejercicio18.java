import java.util.Scanner;
public class Ejercicio18 {
  public static void main(String[] args){
	Scanner i=new Scanner(System.in);
  
	System.out.println("Este programa te dira la primera cifra del numero que introduzcas de hasta 5 cifras.");
	System.out.println("Introduzca el numero:");
	int n=i.nextInt();
	int n2;
	
	if(n<10){
	  System.out.println("La primera cifra es: "+n);
	
	}else if(n>=10 && n<100){
      n2=n/10;
      System.out.println("La primera cifra es: "+n2);
      
	}else if(n>=100 && n<1000){
	  n2=n/100;
	  System.out.println("La primera cifra es: "+n2);
	  
	}else if(n>=1000 && n<10000){
	  n2=n/1000;
	  System.out.println("La primera cifra es: "+n2);
	  
	}else if(n>=10000){
	  n2=n/10000;
	  System.out.println("La primera cifra es: "+n2);
	}
  }
}
