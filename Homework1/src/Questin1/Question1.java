package text;
		import java.io.File;
		import java.io.IOException;
		import java.io.FileWriter;
		
		public class Text
		{
		    public static void main( String[] args )
		    {  
		        try {
		        	FileWriter fw = new FileWriter("e:\\1020.txt");
		              fw.write("MOHAMMED HESSEN" + "HATEM HAMAD" + "MAHDI FARES" + "NEZAR MOHAMMED" + "HASSAN MOHAMMED"
		        	+ " ALI HUSSAIN ");
		              fw.close();
		             		               		              
		        } catch (IOException e) {
		              System.out.println("e.getmassege");
		        }
		    }
		}
		



	


