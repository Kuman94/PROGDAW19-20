import java.util.Scanner;
public class Ejercicio10 {
  public static void main(String[] args){
	
	Scanner s=new Scanner(System.in);
	Scanner i=new Scanner(System.in);
	
	System.out.println("Este prohrama mostrara tu horoscopo segun tu mes y dia de nacimiento.\nIntroduce tu mes de nacimiento.");
	String mes=s.nextLine();
	System.out.println("Ahora introduce tu dia de nacimiento.");
	int dia=i.nextInt();
	
	switch(mes){
	
	  case "enero":
		if(dia>=1 && dia<=20){
		  System.out.println("Su signo del zodiaco es Capricornio.");	
		}else if(dia>=21 && dia <=31){
		  System.out.println("Su signo del zodiaco es Acuario.");
		}else{
		  System.out.println("El dia introducido no es válido.");  
		}
	  break;
	  
	  case "febrero":
		if(dia>=1 && dia<=19){
		  System.out.println("Su signo del zodiaco es Acuario.");	
		}else if(dia>=20 && dia <=28){
		  System.out.println("Su signo del zodiaco es Piscis.");
		}else{
		  System.out.println("El dia introducido no es válido.");  
		}
	  break;
			  
	  case "marzo":
		if(dia>=1 && dia<=20){
		  System.out.println("Su signo del zodiaco es Piscis.");	
		}else if(dia>=21 && dia <=31){
		  System.out.println("Su signo del zodiaco es Aries.");
		}else{
		  System.out.println("El dia introducido no es válido.");  
		}
	  break;
			  
	  case "abril":
		if(dia>=1 && dia<=20){
		  System.out.println("Su signo del zodiaco es Aries.");	
		}else if(dia>=21 && dia <=30){
		  System.out.println("Su signo del zodiaco es Tauro.");
		}else{
		  System.out.println("El dia introducido no es válido.");  
		}
	  break;
			  
	  case "mayo":
		if(dia>=1 && dia<=21){
		  System.out.println("Su signo del zodiaco es Tauro.");	
		}else if(dia>=22 && dia <=31){
		  System.out.println("Su signo del zodiaco es Géminis.");
		}else{
		  System.out.println("El dia introducido no es válido.");  
		}
	  break;
			  
	  case "junio":
		if(dia>=1 && dia<=21){
		  System.out.println("Su signo del zodiaco es Géminis.");	
		}else if(dia>=22 && dia <=30){
		  System.out.println("Su signo del zodiaco es Cancer.");
		}else{
		  System.out.println("El dia introducido no es válido.");  
		}
	  break;
			  
	  case "julio":
		if(dia>=1 && dia<=23){
		  System.out.println("Su signo del zodiaco es Cancer.");	
		}else if(dia>=24 && dia <=31){
		  System.out.println("Su signo del zodiaco es Leo.");
		}else{
		  System.out.println("El dia introducido no es válido.");  
		}
	  break;
			  
	  case "agosto":
		if(dia>=1 && dia<=23){
		  System.out.println("Su signo del zodiaco es Leo.");	
		}else if(dia>=24 && dia <=31){
		  System.out.println("Su signo del zodiaco es Virgo.");
		}else{
		  System.out.println("El dia introducido no es válido.");  
		}
	  break;
			  
	  case "septiembre":
		if(dia>=1 && dia<=23){
		  System.out.println("Su signo del zodiaco es Virgo.");	
		}else if(dia>=24 && dia <=30){
		  System.out.println("Su signo del zodiaco es Libra.");
		}else{
		  System.out.println("El dia introducido no es válido.");  
		}
	  break;
			  
	  case "octubre":
		if(dia>=1 && dia<=23){
		  System.out.println("Su signo del zodiaco es Libra.");	
		}else if(dia>=24 && dia <=31){
		  System.out.println("Su signo del zodiaco es Escorpio.");
		}else{
		  System.out.println("El dia introducido no es válido.");  
		}
	  break;
			  
	  case "noviembre":
		if(dia>=1 && dia<=22){
		  System.out.println("Su signo del zodiaco es Escorpio.");	
		}else if(dia>=23 && dia <=30){
		  System.out.println("Su signo del zodiaco es Sagitario.");
		}else{
		  System.out.println("El dia introducido no es válido.");  
		}
	  break;
			  
	  case "diciembre":
		if(dia>=1 && dia<=21){
		  System.out.println("Su signo del zodiaco es Sagitario.");	
		}else if(dia>=22 && dia <=31){
		  System.out.println("Su signo del zodiaco es Capricornio.");
		}else{
		  System.out.println("El dia introducido no es válido.");  
		}
	  break;
	  
	  default:
		System.out.println("El mes introducido no es valido."); 
			  
	}
  }
}
