import java.util.Scanner;
public class Ejercicio17 {
  public static void main(String[] args){
    Scanner i=new Scanner(System.in);
    int ancho=0;
    int alto=0;
    System.out.print("Introduce el alto de la pecera (mínimo4)");
    alto=i.nextInt();
    System.out.print("Introduce el ancho de la pecera (mínimo4)");
    ancho=i.nextInt();
    
    int posicionPez = (int)(Math.random()*(alto - 2)*(ancho - 2));
    int posicion=0;
    
    for(int j=0;j<ancho;j++){
      System.out.print("*");
    }
    System.out.println();
    
    for(int k=0;k<alto-2;k++){     
      System.out.print("*");
      for(int z=2;z<ancho;z++){
    	if(posicion==posicionPez){ 
    	  System.out.print("&");
    	}else{
    	  System.out.print(" ");  	
    	}
    	posicion++;
      }
      System.out.println("*");      
    }
    
    for(int j=0;j<ancho;j++){
        System.out.print("*");
    }
  }
}
