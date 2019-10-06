import java.util.Scanner;
public class Ejercicio13 {
  public static void main(String[] args){
	Scanner i=new Scanner(System.in);
	
	System.out.println("Este programa ordena los 3 números que introducira a continuación.");
	System.out.println("Introduce el primero número:");
	int a=i.nextInt();
	System.out.println("Introduce el segundo número:");
	int b=i.nextInt();
	System.out.println("Introduce el tercer número:");
	int c=i.nextInt();
	
	if(a>b && a>c){
	  if(b>c){
		System.out.println("El orden seria: "+a+","+b+","+c+".");
	  }else{
		System.out.println("El orden seria: "+a+","+c+","+b+".");
	  }
	}else if(b>a && b>c){
	  if(a>c){
	    System.out.println("El orden seria: "+b+","+a+","+c+".");
	  }else{
		System.out.println("El orden seria: "+b+","+c+","+a+".");
	  }
	}else if(c>b && c>a){
	  if(b>a){
		System.out.println("El orden seria: "+c+","+b+","+a+".");
	  }else{
		System.out.println("El orden seria: "+c+","+a+","+b+".");
	  }
	}
  }
}
