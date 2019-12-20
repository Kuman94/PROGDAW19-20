import java.util.Scanner;
public class Ejercicio07 {
  public static void main(String[] args){
	
    Scanner n=new Scanner(System.in);
    int[] a=new int[100];
    
    for(int i=0;i<100;i++){
    	a[i]=(int)(Math.random()*21);
    	System.out.print(a[i]+ " ");
    }
    System.out.println("");
    System.out.print("Introduce un valor de los anteriores que desees cambiar");
    int v1=n.nextInt();
    System.out.print("Introduce un valor de los anteriores por el que lo quieras cambiar");
    int v2=n.nextInt();
    
    for(int i=0;i<100;i++){
      if(a[i]==v1){
    	  a[i]=v2;
    	  System.out.print("\""+a[i]+"\" ");
      }else{
    	  System.out.print(a[i]+" ");
      }
    	
    }
  }	
}
