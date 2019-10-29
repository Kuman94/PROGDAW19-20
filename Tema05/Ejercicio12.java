import java.util.Scanner;
public class Ejercicio12 {
  public static void main(String[] args){
	Scanner i=new Scanner(System.in);
	int n1=0;
	int n2=1;
	int nf;
	
	System.out.print("Introduce el numero de digitos de la serie de Fibonacci que deseas ver: ");
	int in=i.nextInt();
	
	if(in==1){
	  System.out.print(n1);
	}else if(in==2){
	  System.out.print(n1);
	  System.out.print(", "+n2);
	}else if(in<=0){
		System.out.print("El numero introducido no es válido. Prueba con valores mayores a 0");
	}else{
	  System.out.print(n1);
	  System.out.print(", "+n2);
	  
	  for(int cont=2;cont<in;cont++){
		nf=n1+n2;
		System.out.print(", "+nf);
		n1=n2;
		n2=nf;
		
	  }
	}
  }
}
