import java.util.Scanner;
public class Ejercicio02 {
  public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int[][] num=new int[4][5];
	int sumafila=0;
	int sumacolumna=0;
	int sumatotal=0;
	
	System.out.println("Por favor, introduzca 20 números (enteros) en el array");
	for(int f=0;f<4;f++){
	  /*sumafila=0;	*/
	  for(int c=0;c<5;c++){
		num[f][c]=in.nextInt();
		/*System.out.print(num[f][c]+"   ");
		sumafila+=num[f][c];*/
	  }
	  /*System.out.println(sumafila);
	  sumatotal+=sumafila;*/
	}
	
	for(int f=0;f<4;f++){
	  sumafila=0;	
	  for(int c=0;c<5;c++){
	    System.out.printf("%7d ",num[f][c]);
		sumafila+=num[f][c];
	  }
	  System.out.println("     "+sumafila);
	  sumatotal+=sumafila;
	}
	
	
	for(int c=0;c<5;c++){
	  sumacolumna=0;
	  for(int f=0;f<4;f++){
		sumacolumna+=num[f][c];
	  }
	  System.out.printf("%7d ",sumacolumna);
	  sumatotal+=sumacolumna;
	}
	System.out.println("     "+sumatotal);
  }
}
