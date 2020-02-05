
public class Ejercicio01_14 {

	/*1*/	
	public static boolean esCapicua(long x) {
		return x == voltea(x);  //Al ser un valor boolean devuelve directamente 
								 //el resultado de la operacion.
	}
	
	
	
	/*2*/
  public static boolean esPrimo(long x){
	if(x<2){
	  return false;
	}else{
	  for(int i=2;i<x;i++){
		if(x%i==0){
		  return false;
		}
	  }
	}
	return true;
  }
  
  
  
	/*3*/
  public static int siguientePrimo(int x){
	while(!esPrimo(++x)){     //Ponemos "++x" para que coja el siguiente numero 
	}						   //introducido antes de comenzar el bucle	
	
	return x;
  }
	
  
  
	/*4*/
  public static double potencia (int base, int exponente){
	if(exponente==0){
	  return 1;
	}
	if(exponente<0){
	  return 1/potencia(base,-exponente);
	}
	long x=1;
	for(int i=0;i<Math.abs(exponente);i++){
	  x=x*base;
	}
	return x;
  }
	
  
  
  	/*5*/
  public static int digitos(long x){
	if(x<0){
	  x=-x;
	}
	if(x==0){
	  return 1;
	}
	  
	int longitud=0;
	while(!(x==0)){ //tambien vale (x>0)
	  x=x/10;
	  longitud ++;
	}
	 
    return longitud;
  }
  
  
  
  
  /*6*/
  public static long voltea(long x){
    if(x<0){
    return -voltea(-x);
    }
    
    long n=0;
    while(x>0){
      n=(n*10)+(x%10);
      x=x/10;
    }
    return n;
  }
  
  
  
  /*7*/
  public static int digitoN(long x,int posicion){
	int longitud=digitos(x);
	int n=0;
	for(int i=0;i<(longitud-posicion);i++){
	  n=(int)x%10;
	  x=x/10;
	}	  
	return n;
  }
  
  
  
  /*8*/
  public static int posicionDeDigito(long x,int numero){
	int i;
	for(i=0;i<digitos(x);i++){
	  if(numero==digitoN(x,i)){
		return i;
	  }
	}
	
	return -1;
  }
  
  
  
  /*9*/
  public static long quitaPorDetras(long x, int n){
	return x/(long)potencia(10,n);
  }
  
  
  
  
  /*10*/
  public static long quitaPorDelante(long x,int n){
	x=voltea(x);
	x=quitaPorDetras(x,n);
	x=voltea(x);
	return x;
  }
  
  
  
  /*11*/
  public static long pegaPorDetras(long x,int n){
	int i=digitos(n);
	x=(x*(long)potencia(10,i))+n;
	return x;
  }
  
  
  
  /*12*/
  public static long pegaPorDelante(long x, int n){
	x=voltea(x);
	n=(int)voltea(n);
	x=pegaPorDetras(x,n);
	x=voltea(x);
	return x;
  }
  
  
  
  /*13*/ //creo que esta bien
  public static long trozoDeNumero(long x, int i, int f){
	f=digitos(x)-(f+1);
	x=quitaPorDetras(x,f);
	x=quitaPorDelante(x,i);
	return x;
  }
  
  
  /*14*/
  public static long juntaNumeros(long x, long n){
	int i=digitos(n);
	x=(x*(long)potencia(10,i))+n;  
	return x;
  }
  
  public static void main(String[] args){
	  /*PRUEBAS*/
	  
	  /*if(Ejercicio01_14.esCapicua(2020)){
		System.out.print("Si");  
	  }else{
		  System.out.print("No"); 
	  }*/
	  
	  /*if(Ejercicio01_14.esPrimo(8)){
		System.out.print("Si");  
	  }else{
		  System.out.print("no"); 
	  }*/
	  
	  /*System.out.print(Ejercicio01_14.siguientePrimo(99999999));*/
	  
	  /*System.out.print(Ejercicio01_14.potencia(10,3));*/
	  
	  /*System.out.print(Ejercicio01_14.digitos(973979773));*/
	  
	  /*System.out.print(Ejercicio01_14.voltea(937583853));*/
	  
	  /*System.out.print(Ejercicio01_14.digitoN(766573,2));*/
	  
	  /*System.out.print(Ejercicio01_14.posicionDeDigito(766573,3));*/
	  
	  /*System.out.print(Ejercicio01_14.quitaPorDetras(937583853,4));*/
	  
	  /*System.out.print(Ejercicio01_14.quitaPorDelante(68532695,3));*/
	  
	  /*System.out.print(Ejercicio01_14.pegaPorDetras(654644,375));*/
	  
	  /*System.out.print(Ejercicio01_14.pegaPorDelante(9788464,79));*/
	  
	  /*System.out.print(Ejercicio01_14.trozoDeNumero(7652564,2,5));*/
	  
	  /*System.out.print(Ejercicio01_14.juntaNumeros(6215,273));*/
  }

}

