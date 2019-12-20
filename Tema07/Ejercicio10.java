
public class Ejercicio10 {
  public static void main(String[] args){
	int[] n=new int[20];
	int[] par=new int[20];
	int[] impar=new int[20];
	int pares=0;
	int impares=0;
	int j=0;
	
	for(int i=0;i<20;i++){
	  n[i]=(int)(Math.random()*101);
	  System.out.print(n[i]+" ");
	  
	  if(n[i]%2==0){
		 par[pares]=n[i];
		 pares++;
	  }else{
		  impar[impares]=n[i];
		  impares++;
	  }
	}
	
	System.out.println("");
	
	for(int i=0;i<pares;i++){
	  n[i]=par[i];
	}
	
	for(int i=pares;i<20;i++){
	  n[i]=impar[j];
	  j++;
	}
	
	for(int i=0;i<20;i++){
		System.out.print(n[i]+" ");
	}
  }
}
