import java.util.Scanner;
public class Ejercicio09 {
  public static void main(String[] args){
	Scanner i=new Scanner(System.in);
	double x;
	double x2;
	
	System.out.println("Este programa resuelve ecuaciones de 2 grado.");
	System.out.println("Por favor, introduce el valor de 'a'.");
	double a=i.nextDouble();
	System.out.println("Por favor, introduce el valor de 'b'.");
	double b=i.nextDouble();
	System.out.println("Por favor, introduce el valor de 'c'.");
	double c=i.nextDouble();
	double raiz=b*b-4*a*c;
	
	if(a==0 && b==0){
	  System.out.println("La ecuacion no tiene solución.");
	}else if(a==0){
	  x=-c/b;
	  System.out.printf("La solucion es: %.2f",x);
	  
	}else if(b==0){
	  if(c<0 && a>0){
		x=Math.sqrt(-c/a);
		System.out.printf("La solucion es: %.2f",x);
		
	  }else if(c<0 && a<0){
		System.out.println("La ecuacion no tiene solución.");
		
	  }else if(c>0 && a<0){
		x=Math.sqrt(-c/a);
		System.out.printf("La solucion es: %.2f",x);
	  
	  }else if(c>0 && a>0){
		System.out.println("La ecuacion no tiene solución.");
	  } 
	  
	}	  
      if(raiz<0){
        System.out.println("La ecuacion no tiene solución.");
      
	    }else{
        x=(-b+Math.sqrt(b*b-4*a*c))/2*a;
        x2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
        System.out.printf("La primera solucion es: %.2f\n",x);
        System.out.printf("La segunda solucion es: %.2f",x2);
	  }	
  }
}
