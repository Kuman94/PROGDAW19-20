
public class Ejercicio06 {
  public static void main(String[] args){
	int[][]n=new int [6][10];
	int max=0;
	int min=1000;
	int fmax=0;
	int cmax=0;
	int fmin=0;
	int cmin=0;
	boolean repetido;
	
	for(int f=0;f<6;f++){
	  for(int c=0;c<10;c++){		  
		do{
		  repetido=false;
		  n[f][c]=(int)(Math.random()*1001);
		  for(int fil=0;fil<=f;fil++){
			if(fil==f){
			  for(int col=0;col<c;col++){
				if(n[fil][col]==n[f][c]){
				  repetido=true;
				}
			  }	
			}else{
			  for(int col=0;col<10;col++){
				if(n[fil][col]==n[f][c]){
				  repetido=true;
				}	  
			  }
			}
			
		  }
		}while(repetido);
		
		if(n[f][c]>max){
		  max=n[f][c];
		  fmax=f;
		  cmax=c;
		}
		if(n[f][c]<min){
		  min=n[f][c];
		  fmin=f;
		  cmin=c;
		}
		System.out.printf("%7d ",n[f][c]);
	  }
	  System.out.println("");
	}
	
	System.out.println("El máximo se encuentra en la fila "+(fmax+1)+", columna "+(cmax+1));
	System.out.println("Y el mínimo se encuentra en la fila "+(fmin+1)+", columna "+(cmin+1));
  }
}
