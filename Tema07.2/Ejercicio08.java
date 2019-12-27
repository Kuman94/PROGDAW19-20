import java.util.Scanner;
public class Ejercicio08 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	String posicion;
	int posicionx;
	int posiciony;
	
	
	System.out.print("Introduzca la posición del alfil: ");
	posicion=in.nextLine();
	posiciony=(int)(posicion.charAt(0))-96;
	posicionx=(int)(posicion.charAt(1))-48;
	
	System.out.println("El alfil puede moverse a las siguientes posiciones:");
	
	for(int x=8;x>=1;x--){
	  for(int y=1;y<=8;y++){
	    if((Math.abs(posicionx-x) == Math.abs(posiciony-y)) && (!((posicionx==x)&&(posiciony==y)))){
	      System.out.print((char)(y+96)+""+x+" ");
	    }
	  }
	}

  }
}
