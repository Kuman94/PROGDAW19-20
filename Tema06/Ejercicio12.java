
public class Ejercicio12 {
  public static void main(String[] args) throws InterruptedException {
	System.out.print("\033[32m");
	int linea=0;  
	for(int i=0;i<8000;i++){
	  System.out.print((char)(Math.random()*(126-32+1)+32)+" ");
	  Thread.sleep(10);
	  linea++;
	  if(linea==60){
	    System.out.println();
	    linea=0;
	  }
	}
  }
}
