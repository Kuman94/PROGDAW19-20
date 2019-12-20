import java.util.Scanner;
public class Ejercicio14 {
  public static void main(String[] args){
	 Scanner s=new Scanner(System.in);
	 String[] inicio=new String[8];
	 String[] fin=new String[8];
	 String[] color={"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro",
	 "blanco", "morado"};
	 int contador1=0;
	 int contador2=0;
	 
	 
	 for(int i=0;i<8;i++){
		System.out.print("Introduce una palabra: ");
		inicio[i]=s.nextLine();
		
		for(int j=0;j<9;j++){
		  if(inicio[i].equals(color[j])){
			  fin[contador1]=inicio[i];
			  contador1++;
		  }
		}
	 }

	 for(int i=0;i<8;i++){
		 contador2=0;
		 for(int j=0;j<9;j++){
			  if(inicio[i].equals(color[j])){
				  contador2=1;
			  }
		 }
		 if(contador2==0){
			fin[contador1]=inicio[i];
			contador1++;
		 }
	 }
	 
	 for(int i=0;i<8;i++){
		 System.out.print(fin[i]+" ");
	 }
  }
}
