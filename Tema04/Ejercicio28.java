import java.util.Scanner;
public class Ejercicio28 {
  public static void main(String[] args){
	Scanner s=new Scanner (System.in);
	System.out.println("Bienvenidos al juego de piedra papel o tijera.");
	System.out.println("Turno del jugador 1 (introduce piedra, papel o tijera):");
	String jug1=s.nextLine();
	System.out.println("Turno del jugador 2 (introduce piedra, papel o tijera):");
	String jug2=s.nextLine();
	
	if(jug1.equals(jug2)){
	  System.out.println("Empate.");
	  
	}else if(jug1.equals("tijera") && jug2.equals("papel")){
	  System.out.println("Gana el jugador 1.");
		
	}else if(jug1.equals("tijera") && jug2.equals("piedra")){
	  System.out.println("Gana el jugador 2.");
		
	}else if(jug1.equals("papel") && jug2.equals("tijera")){
	  System.out.println("Gana el jugador 2.");
		
	}else if(jug1.equals("papel") && jug2.equals("piedra")){
	  System.out.println("Gana el jugador 1.");
		
	}else if(jug1.equals("piedra") && jug2.equals("tijera")){
	  System.out.println("Gana el jugador 1.");
		
	}else if(jug1.equals("piedra") && jug2.equals("papel")){
	  System.out.println("Gana el jugador 2.");	
	}
  }
}
