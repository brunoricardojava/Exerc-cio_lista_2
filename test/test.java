import java.io.*;

/*public class test{
	public static void main(String args[]){
		int a = 60;
		int b = 1;
		int c = 0;

		//c = ;

		System.out.println(a);

	}
}
*/

public class test{
   public static void main (String[]args){

   	String arqui="";
      try{
         BufferedReader br = new BufferedReader(new FileReader("c:/bruno/bruno.txt"));
         while(br.ready()){
            String linha = br.readLine();
            arqui = linha;
            System.out.println(linha);
         }
         br.close();
      }catch(IOException ioe){
         ioe.printStackTrace();
      }


      System.out.println(~arqui);




   }
}