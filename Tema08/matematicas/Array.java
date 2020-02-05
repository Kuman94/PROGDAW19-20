package matematicas;

public class Array {

	/*crea y rellena un array automaticamente*/
	
  public static int[] generaArray(int n, int maximo, int minimo){
	int[] x=new int [n];
	for(int i=0;i<n;i++){
	  x[i]=(int)Math.random()*(maximo-minimo+1)+minimo;
	}
	 
	return x;
  }
  
  
  
  /*retorna el minimo de un array*/
  
  public static int minimoArray(int[] x){
	int minimo=Integer.MAX_VALUE;
	for(int n:x){
	  if(n<minimo){
		minimo=n;
	  }
	}
	  
	return minimo;
  }
  
  
  
  /*retorna el maximo de un array*/
  
  public static int maximoArray(int[] x){
	int maximo=Integer.MIN_VALUE;
	
	for(int n:x){
	  if(n>maximo){
		maximo=n;
	  }
	}
	return maximo;
  }
  
  
  
  /*retorna la media de un array*/
  
  public static double mediaArray(int[] x){
	double media=0;
	
	for(int n:x){
	media=media+n;
	}
	media=media/x.length;    //cuando usamos .length sin parentesis podemos medir 
	return media;			 //la longitud de un array	
  }
  
  
  
  /*comprueba si un numero esta dentro del array*/
  
  public static boolean estaEnArray(int[] x, int n){
	for(int y:x){
	  if(y==n){
		return true;
	  }
	}	
	return false;
  }
  
  
  
  /* retorna la posicion del array de un numero introducido(si existe)*/
  
  public static int posicionEnArray(int[]x,int n){
	int indice=-1;
	for(int i=0;i<x.length;i++){
	  if(n==x[i]){
		indice =i;  
	  }
	}
	return indice;
  }
  
  
  
  /*26 - voltea un array*/
  
  public static int[] volteaArray (int[] x){
	int[] n=new int [x.length];
	int indice= x.length-1;
	for(int i=0;i<x.length;i++){
	  n[i]=x[indice];
	  indice --;
	}
	  
	return n;
  }
  
  
  
  /*rota un array n posiciones hacia la derecha*/
  
  public static int[] rotaDerechaArray(int[]x,int n){
	int[] a=x.clone();
	int aux;
	
	while(n-->0){
	  aux=a[x.length-1];
	  for(int i=x.length-1;i>0;i--){
		a[i]=a[i-1];
	  }
	  a[0]=aux;
	}  
	return a;
  }
  
  
  
  /*rota un array n posiciones hacia la izquierda*/
  
  public static int[] rotaIzquierdaArray(int[]x, int n){
	int[] a=x.clone();
	int aux;
	
	while(n-->0){
	  aux=a[0];
	  for(int i=0;i<x.length-1;i++){
		a[i]=a[i+1];  
	  }
	  a[x.length-1]=aux;
	}  
	return a;
  }
  
  
  
  /*genera array bidimensional con numeros aleatorios comprendidos entre un minimo y un maximo*/
  
  public static int [][] generaArayBi(int filas,int columnas, int minimo, int maximo){
	int a[][]=new int [filas][columnas];
	for(int i=0;i<filas;i++){
	  for(int j=0;j<columnas;j++){
		a[filas][columnas]=(int)Math.random()*(maximo-minimo+1)+minimo;
	  }
	}
	return a;
  }
  
  
  
  /*Devuelve una fila especifica de un array bidimensional*/
  
  public static int[] filaDeArrayBi(int[][] x,int fila){
	int f[]=new int [x[0].length];
	for(int i=0;i<x[0].length;i++){
	  f[i]=x[fila][i];
	}
	
	return f;
  }
  
  
  
  /*Devuelve una columna especifica de un array bidimensional*/
  
  public static int[] columnaDeArrayBi(int[][] x, int columna){
	int[] c=new int [x.length];
	for(int i=0;i<x.length;i++){
	  c[i]=x[i][columna];
	}
	
	return c;
  }
  
  
  
  /*Devuelve la fila y la columna de la primera ocurrencia de un número dentro de un array bidimensional.*/
  
  public static int[] coordenadasEnArrayBi(int[][] x,int n){
	
	for(int f=0;f<x.length;f++){
	  for(int c=0;c<x[0].length;c++){
		if(x[f][c]==n){
		  int[] coordenadas={f,c};
		  return coordenadas;
		}
	  }
	}
	int[] coordenadas={-1,-1};
	return coordenadas;
  }
  
  
  
  /*Devuelve TRUE si el numero introducido es el minimo de su fila y maximo de su columna*/
  
  public static boolean esPuntoDeSilla(int x[][], int i, int j){
	int[] fila = filaDeArrayBi(x, i);
	int[] columna = columnaDeArrayBi(x, j);
	
	return ((minimoArray(fila) == x[i][j])
			&& (maximoArray(columna) == x[i][j]));
  }
  
  
  
  /**/
  
  public static int[] diagonalArrayBi(int[][] x, int fila, int columna, String direccion){
	int elementos = 0, i, j;
	int[] diagonalAux = new int [1000];
	
	for (i = 0; i < x.length; i++) {
	  for (j = 0; j < x[0].length; j++) {
		if ( (((columna - j) == (fila - i)) && (direccion.equals("nose")))
		|| (((columna - j) == (i - fila)) && (direccion.equals("neso"))) ) {
		diagonalAux[elementos++] = x[i][j];
		}
	  }
	}
	
	int[] diagonal = new int[elementos];
	for (j = 0; j < elementos; j++) {
	  diagonal[j] = diagonalAux[j];
	}
	return diagonal;
  }
}
