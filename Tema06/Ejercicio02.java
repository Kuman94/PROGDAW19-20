
public class Ejercicio02 {
  public static void main(String[] args){
    String carta ="";
    String palo ="";
  
    int n=(int)(Math.random()*13+1);
    
    switch(n){    
      case 1:
        carta="A";
        break; 
      
      case 11:
        carta="J";
        break;
      
      case 12:
        carta="Q";
        break;
        
      case 13:
        carta="K";
        break;
        
      default:
    	carta=String.valueOf(n);   
    }
    n=(int)(Math.random()*4);
    
    switch(n){    
      case 0:
        palo="picas";
        break; 
    
      case 1:
        palo="corazones";
        break;
    
      case 2:
        palo="diamantes";
        break;
      
      case 3:
        palo="tréboles";
        break;
    
    }
    
    System.out.print(carta+" de "+palo);
  }  
}
