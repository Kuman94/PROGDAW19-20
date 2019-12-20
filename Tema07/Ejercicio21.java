
public class Ejercicio21 {
  public static void main(String[] args){
	int[] n=new int [15];
	
	System.out.println("Array original:");
	for(int i=0;i<15;i++){
	  n[i]=(int)(Math.random()*501);
	  System.out.print(n[i]+" ");
	}
	
	System.out.println("\nArray 'cincuentizado':");
	for(int i=0;i<15;i++){
	  while(n[i]%5!=0){
		n[i]++;  
	  }
	  System.out.print(n[i]+" ");
	}
  }
}
