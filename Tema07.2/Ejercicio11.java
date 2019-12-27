
public class Ejercicio11 {
  public static void main(String[] args){
	int[][] n=new int[10][10];
	int max=0;
	int min=300;
	int suma=0;
	int cont=0;
	
	for(int i=0;i<10;i++){
	  for(int j=0;j<10;j++){
	    n[i][j]=(int)(Math.random()*101+200);
		System.out.printf("%4d",n[i][j]);
	  }
	  System.out.println("\n");
	}
	
	
	for(int i=0;i<10;i++){
	  for(int j=0;j<10;j++){
		if(i==j){
		  System.out.print(n[i][j]+"  ");
		  if(n[i][j]>max){
			max=n[i][j];
		  }
		  if(n[i][j]<min){
			min=n[i][j];
		  }
		  suma+=n[i][j];
		  cont++;
		}
	  }
	}
	
	System.out.print("\nDe los numeros mostrados el máximo es "+max+", el mínimo es "+min+", y la media es "+(suma/cont));
  }
}
