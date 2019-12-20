import java.util.Scanner;
public class Ejercicio15 {
  public static void main(String[] args){
	  Scanner in=new Scanner(System.in);
	  int clientes;
	  int[] mesas=new int[10];
	  
	  for(int i=0;i<10;i++){
		  mesas[i]=(int)(Math.random()*5);
	  }
	   
	  do{
		boolean mlibre=false;
		boolean mhueco=false;  
		
		for(int i=0;i<10;i++){
		  System.out.println("mesa "+(i+1)+" --> "+ mesas[i]);
		}  
		  
	    do{
		  System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
		  clientes=in.nextInt();
		 
		  if(clientes>4){
			 System.out.println("Lo siento, no admitimos grupos de 6, haga grupos de 4 persona como máximo e intente de nuevo");	 
		  }	
	    }while(clientes>4);
	    
	    for(int i=0;i<10;i++){
	      if(mesas[i]==0){
	    	 mesas[i]=clientes;
	    	 if(clientes!=-1){
	    	   System.out.println("Por favor, pasen a la mesa número "+(i+1));
	    	 }
	    	 i=10;
	    	 mlibre=true;
	      }  
	    }
	    
	    if(mlibre==false){
	      for(int i=0;i<10;i++){
	        if(clientes<=(4-mesas[i])){
	          mesas[i]+=clientes;
	          if(clientes!=-1){
	        	System.out.println("Tendrán que compartir mesa. Por favor, pasen a la mesa número "+(i+1));
	          }
	          mhueco=true;
	          i=10;
	        }
	      }
	    }
	    
	    if(mhueco==false && mlibre==false){
	      if(clientes!=-1){
	    	System.out.println("Lo siento, en estos momentos no queda sitio.");
	      }
	    }
	     
	  }while(clientes!=-1);
	  
	  System.out.println("Gracias. Hasta pronto.");

	  
  }
}
