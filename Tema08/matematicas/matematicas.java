package matematicas;

public class matematicas {

	
	/*1*/	
  public static boolean esCapicua(long x) {
	return x == voltea(x);  
								 
  }

  public static boolean esCapicua(int x){
	return esCapicua((long)x);
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
  
  public static boolean esPrimo(int x){
	return esPrimo((long)x);
  }
  
  
  
	/*3*/
  public static int siguientePrimo(int x){
	while(!esPrimo(++x)){     
	}						  	
	return x;
  }
	
  public static int siguientePrimo(long x){
	return siguientePrimo((int)x);
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
  
  public static int digitos(int x){
	return digitos((long)x);
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
  
  public static int voltea(int x){
	return (int)voltea((long)x);
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
  
  public static int digitoN(int x,int posicion){
	return digitoN((long)x, posicion);
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
  
  public static int posicionDeDigito(int x,int numero){
	return posicionDeDigito((long)x,numero);
  }
  
  
  
  /*9*/
  public static long quitaPorDetras(long x, int n){
	return x/(long)potencia(10,n);
  }
  
  public static int quitaPorDetras(int x, int n){
	return (int)quitaPorDetras((long)x, n);
  }
  
  
  
  
  /*10*/
  public static long quitaPorDelante(long x,int n){
	x=pegaPorDetras(x,1);
	x=voltea(x);
	x=quitaPorDetras(x,n);
	x=voltea(x);
	x=quitaPorDetras(x,1);
	return x;
  }
  
  public static int quitaPorDelante(int x,int n){
	return (int)quitaPorDelante((long)x, n);
  }
  
  
  
  /*11*/
  public static long pegaPorDetras(long x,int n){
	int i=digitos(n);
	x=(x*(long)potencia(10,i))+n;
	return x;
  }
  
  public static int pegaPorDetras(int x,int n){
	return (int)pegaPorDetras((long)x,n);
  }
  
  
  
  /*12*/
  public static long pegaPorDelante(long x, int n){
	x=voltea(x);
	n=(int)voltea(n);
	x=pegaPorDetras(x,n);
	x=voltea(x);
	return x;
  }
  
  public static int pegaPorDelante(int x, int n){
	return (int)pegaPorDelante((long)x, n);
  }
  
  
  
  /*13*/ 
  public static long trozoDeNumero(long x, int i, int f){
	f=digitos(x)-(f+1);
	x=quitaPorDetras(x,f);
	x=quitaPorDelante(x,i);
	return x;
  }
  
  public static int trozoDeNumero(int x, int i, int f){
	return (int)trozoDeNumero((long)x, i, f);
  }
  
  
  
  /*14*/
  public static long juntaNumeros(long x, long n){
	int i=digitos(n);
	x=(x*(long)potencia(10,i))+n;  
	return x;
  }
  
  public static int juntaNumeros(int x, int n){
	return(int)juntaNumeros((long)x, (long)n);
  }
  
  
  /*CAMBIOS DE BASE*/
  public static long decimalABinario(long x){
	long binario=1;
	if(x==0){
	  return 0;
	}
	while(x>1){
	  binario=pegaPorDetras(binario,(int)x%2);
	  x=x/2;
	}
	binario=pegaPorDetras(binario,1);
	binario=voltea(binario);
	binario=quitaPorDetras(binario,1);
	
	return binario;
  }
  
  public static int decimalABinario(int x){
	return (int)decimalABinario((long)x);
  }
  
  
  
  public static long octalABinario (long x){
	long binario=0;
	for(int i=0;i<digitos(x);i++){
	  binario=binario*1000+decimalABinario(digitoN(x,i));
	}
	return binario;
  }
  
  public static int octalABinario (int x){
	return (int)octalABinario((long)x);
  }
  
  
  
  public static long hexadecimalABinario(String x){
	x=x.toUpperCase();
	String digitoshexa="0123456789ABCDEF";
	long binario=0;
	for(int i=0;i<x.length();i++){
	  binario=binario*10000+decimalABinario(digitoshexa.indexOf(x.charAt(i)));
	}
	return binario;
  }
  
  
  
  
  public static long binarioADecimal (long x){
	long decimal=0;
	for(int i=0;i<digitos(x);i++){
	  decimal=decimal*2+digitoN(x,i);
	}
	  
	return decimal;
  }
  
  public static int binarioADecimal (int x){
	return (int)binarioADecimal((long)x);
  }
  
  
  
  public static long binarioAOctal(long x){
  long octal=1;
  while(x>0){
	octal=octal*10+binarioADecimal(x%1000);
	x=x/1000;
  }
  octal=pegaPorDetras(octal,1);
  octal=voltea(octal);
  octal=quitaPorDetras(octal,1);
  octal=quitaPorDelante(octal,1);
  
  
  return octal;  
  }
  
  public static int binarioAOctal(int x){
	return (int)binarioAOctal((long)x);
  }
  
  
  public static String binarioAHexadecimal(long x){
	String hexadecimal="";
	String digitosHexa="0123456789ABCDEF";
	
	while(x>0){
	  hexadecimal=digitosHexa.charAt(binarioADecimal((int)x%10000))+hexadecimal;
	  x=x/10000;
	}
	return hexadecimal;
  }
}
