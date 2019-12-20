import java.util.Scanner;
public class Ejercicio03 {
  public static void main(String[] args){
	  Scanner i=new Scanner(System.in);
	  int[] n=new int[10];
	  
	  for(int j=9;j>=0;j--){
		 System.out.print("Introduce un número: ");
		 n [j]=i.nextInt();
	  }
	  
	  for(int j=0;j<10;j++){
		 System.out.print(n[j]);
		 if(j<9){
		   System.out.print(", ");
		 }else{
		   System.out.print("."); 
		 }
		
	   }
  }
}
