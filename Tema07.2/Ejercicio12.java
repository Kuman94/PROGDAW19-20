
public class Ejercicio12 {
  public static void main(String[] args){
	int[][] n=new int[9][9];
	int max=0;
	int min=900;
	int suma=0;
	int cont=0;
	int fila=0;
	int columna=8;
		
	for(int i=0;i<9;i++){
	  for(int j=0;j<9;j++){
		n[i][j]=(int)(Math.random()*401+500);
		System.out.printf("%4d",n[i][j]);
	  }
	  System.out.println("\n");
	}
	
	for(int i=0;i<9;i++){
	  System.out.print(n[fila][columna]+"  ");
	  
	  if(n[fila][columna]>max){
		max=n[fila][columna];
	  }
	  if(n[fila][columna]<min){
		min=n[fila][columna];
	  }
	  suma+=n[fila][columna];
	  cont++;
	  fila++;
	  columna--;
    }
	
	System.out.print("\nDe los numeros mostrados el máximo es "+max+", el mínimo es "+min+", y la media es "+(suma/cont));
  }
}
