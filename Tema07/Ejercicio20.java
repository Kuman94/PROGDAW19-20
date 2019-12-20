import java.util.Scanner;
public class Ejercicio20 {
  public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int cantidad;
	int orden;
	
	System.out.print("Introduzca el número total de nombres de reyes: ");
	cantidad=Integer.parseInt(in.nextLine());
	
	String[] reyes=new String[cantidad];
	System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
	for(int i=0;i<cantidad;i++){
	  reyes[i]=in.nextLine();
	}
	
	for(int i=0;i<cantidad;i++){
	  orden=1;
	  for(int j=0;j<i;j++){
	    if(reyes[i].equals(reyes[j])){
	      orden++;
	    }
	  }
	  System.out.println(reyes[i]+" "+orden+"º");
	}
	
  }
}
