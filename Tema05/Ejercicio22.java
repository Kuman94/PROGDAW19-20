
public class Ejercicio22 {    //probar con bolean
  public static void main(String[] args){
	int contador;
	for(int n=2;n<=100;n++){
	  contador=0;
	  for(int i=2;i<=n;i++){
		int operacion=n%i;
		if(operacion==0){
		  contador++;
		}		
	  }
	  if(contador==1){
		  System.out.print(n+", ");
	  }
	}
	  
  }
}
