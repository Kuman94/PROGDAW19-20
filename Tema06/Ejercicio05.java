
public class Ejercicio05 {
  public static void main(String[] args){
	int maximo=0;
	int minimo=199;
	int suma=0;
	int n;
	int contador=0;
	
	for(int i=0;i<50;i++){
	  n=(int)(Math.random()*100+100);
	  System.out.print(n+" ");
	  if(n>maximo){
		maximo=n;
	  }
	  if(n<minimo){
		minimo=n;
	  }
	  suma+=n;
	  contador++;
	}
	
	int media=suma/contador;
	System.out.print("\nEl máximo es "+maximo+", el mínimo "+minimo+", y la media es "+media);
  }
}
