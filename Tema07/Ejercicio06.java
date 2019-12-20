import java.util.Scanner;
public class Ejercicio06 {
  public static void main(String[] args){
	Scanner n=new Scanner(System.in);
	int[] num=new int[15];
	
	for(int i=0;i<15;i++){
		System.out.print("Introduce un número, por favor: ");
		num[i]=n.nextInt();
	}
	
	int aux=num[14];
	
	for(int i=14;i>=1;i--){
		num[i]=num[i-1];
	}
	num[0]=aux;
	
	
	for(int i=0;i<15;i++){
		System.out.print(num[i]);
		 if(i<14){
		   System.out.print(", ");
		 }else{
		   System.out.print(".");
		 }  
	}
	
  }
}
