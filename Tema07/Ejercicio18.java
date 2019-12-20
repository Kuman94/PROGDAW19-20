
public class Ejercicio18 {
  public static void main(String[] args){
	int[] n=new int[10];
	int[] menores=new int[10];
	int[] mayores=new int[10];
	int j=0;
	int k=0;
	
	for(int i=0;i<10;i++){
	  n[i]=(int)(Math.random()*201);
	  if(n[i]<=100){
		menores[j]=n[i];
		j++;
	  }else{
		mayores[k]=n[i];
		k++;
	  }
	}
	
	for(int i=0;i<10;i++){
	  System.out.print(n[i]+" ");
	}
	System.out.println("");
	
	j=0;
	k=0;
	for(int i=0;i<10;i++){
	  if(i%2==0){
		 if(menores[j]!=0){
		   n[i]=menores[j];
		   j++;
		 }else{
		   n[i]=mayores[k];
		   k++;
		 }
	  }else{
		if(mayores[k]!=0){
		  n[i]=mayores[k];
		  k++;
		}else{
		  n[i]=menores[j];
		  j++;
		}
	  }
	}
	
	for(int i=0;i<10;i++){
	  System.out.print(n[i]+" ");
	}
	
  }
}
