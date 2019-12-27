
public class Ejercicio13 {
  public static void main(String[] args){
    String[] pais={"España","Rusia", "Japón","Australia"};
    int[][]n=new int[4][10];
    int max;
    int min;
    int med;
    
    System.out.println("                                                      MED MIN MAX");
    for(int i=0;i<4;i++){
      max=0;
      min=240;
      med=0;
      System.out.printf("%10s: ",pais[i]);
      for(int j=0;j<10;j++){
    	n[i][j]=(int)(Math.random()*70+140);
    	System.out.print(n[i][j]+" ");
    	if(n[i][j]<min){
    	  min=n[i][j];
    	}
    	if(n[i][j]>max){
    	  max=n[i][j];
    	}
    	med+=n[i][j];
      }
      System.out.print("| "+(med/10)+" "+min+" "+max+"\n");
    }
    
  }
}
