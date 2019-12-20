import java.util.Scanner;
public class Ejercicio17 {
  public static void main(String[] args){
	Scanner in=new Scanner(System.in);  
	int[] n=new int[10];
	int valor;
	boolean numero=false;
	int aux;
	
    for (int i=0;i<10;i++){
	  n[i]=(int)(Math.random()*101);
	  System.out.print(n [i]+" ");
    }  
    System.out.println("");
    
    do{
      System.out.print("Introduce un número de los anteriores: ");
      valor=in.nextInt();
      
      for(int i=0;i<10;i++){
    	if(valor==n[i]){
    	  numero=true;	
    	}
      }
      
      if(numero==false){
    	System.out.println("El número que has introducido no aparece en el array");
      }
    }while (numero==false);
    
    while(n[0]!=valor){
      aux=n[9];
      for(int i=9;i>0;i--){
    	n[i]=n[i-1];
      }
      n[0]=aux;
    }
    
    for(int i=0;i<10;i++){
      System.out.print(n[i]+" ");
    }
  }
}
