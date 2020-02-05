import matematicas.matematicas;
public class Ejercicio16 {
  public static void main(String[] args){
	for(int i=1;i<=99999;i++){
	  if(matematicas.esCapicua(i)){
		System.out.print(i+" ");
	  }
	}
  }
}
