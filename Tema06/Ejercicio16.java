
public class Ejercicio16 {
  public static void main(String[] args){
	int f1=(int)(Math.random()*5);
	int f2=(int)(Math.random()*5);
	int f3=(int)(Math.random()*5);
	String fig1="";
	String fig2="";
	String fig3="";
	
	
	switch(f1){
	  case 0:
		fig1="corazón";
	    break;
	  
	  case 1:
	    fig1="diamante";
		break;
		
	  case 2:
		fig1="herradura";
		break;
		
	  case 3:
		fig1="campana";
		break;
		    
	  case 4:
		fig1="limón";
		break;
	}
	
	switch(f2){
	  case 0:
		fig2="corazón";
	    break;
	  
	  case 1:
	    fig2="diamante";
		break;
		
	  case 2:
		fig2="herradura";
		break;
		
	  case 3:
		fig2="campana";
		break;
		    
	  case 4:
		fig2="limón";
		break;
	}
	
	switch(f3){
	  case 0:
		fig3="corazón";
	    break;
	  
	  case 1:
	    fig3="diamante";
		break;
		
	  case 2:
		fig3="herradura";
		break;
		
	  case 3:
		fig3="campana";
		break;
		    
	  case 4:
		fig3="limón";
		break;	    
	}
	
	System.out.println(fig1+" "+fig2+" "+fig3);
	
	if(f1==f2 && f1==f3){
	  System.out.println("Enhorabuena, ha ganado 10 monedas");
	}else if(f1==f2 || f1==f3 || f2==f3){
	  System.out.println("Bien, ha recuperado su moneda");
	}else{
	  System.out.println("Lo siento, ha perdido");
	}
  }
}
