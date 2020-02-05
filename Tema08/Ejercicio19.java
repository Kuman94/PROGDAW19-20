import java.util.Scanner;
import matematicas.matematicas;
public class Ejercicio19 {
  public static void main (String[] args){
	Scanner i=new Scanner(System.in);
	Scanner s=new Scanner(System.in);
	int opcion1;
	int opcion2;
	String ns="";
	long n=0;
	
	 
	System.out.println("Bienvenidos al convertidor de bases. ¿Qué base va a introducir?\n1-Decimal\n2-Binario\n3-Octal\n4-Hexadecimal");
	opcion1=i.nextInt();
	System.out.println("\n¿A qué base desea convertirlo?\n1-Decimal\n2-Binario\n3-Octal\n4-Hexadecimal");
	opcion2=i.nextInt();
	System.out.println("\nAhora introduzca el número que desea cambiar de base.");
	ns=s.nextLine();
	
	if(opcion1!=4){
	  n=Long.parseLong(ns);
	}
	 
	if(opcion1==opcion2){
	  System.out.print("Las bases seleccionadas son las mismas, el numero no necesita ningun cambio.");	 
	}else{
	 
	  switch(opcion1){
	 
	  case 1:
		switch(opcion2){
		  
		case 2:
		  System.out.print(matematicas.decimalABinario(n));
		break;
		  
		case 3:
		  System.out.print(matematicas.binarioAOctal(matematicas.decimalABinario(n)));
		break;
		 
		case 4:
		  System.out.print(matematicas.binarioAHexadecimal(matematicas.decimalABinario(n)));
		break;		 
		}
	  break;
	  
	 
	  case 2:
		switch(opcion2){
			 
		case 1:
		  System.out.print(matematicas.binarioADecimal(n));
		break;
		 
		case 3:
		  System.out.print(matematicas.binarioAOctal(n));
		break;
		 
		case 4:
		  System.out.print(matematicas.binarioAHexadecimal(n));
		break;		 
		}
	  break;
	 
	  case 3:
		switch(opcion2){
			 
		case 1:	
		  System.out.print(matematicas.binarioADecimal(matematicas.octalABinario(n)));
		break;		  
			 
		case 2:
			
		  System.out.print(matematicas.octalABinario(n));
		break;
			 
		case 4:
		  System.out.print(matematicas.binarioAHexadecimal(matematicas.octalABinario(n)));
		break;		 
		}
	  break;
	 
	  case 4:
		switch(opcion2){
			 
		case 1:
		  System.out.print(matematicas.binarioADecimal(matematicas.hexadecimalABinario(ns)));
		break;
			  		 
		case 2:
		  System.out.print(matematicas.hexadecimalABinario(ns));
		break;
			 
		case 3:
		  System.out.print(matematicas.binarioAOctal(matematicas.hexadecimalABinario(ns)));
		break;
	 
		}
	  break;
		 
	  }
	}
  }
}
