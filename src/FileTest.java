import java.io.FileWriter;
import java.io.FileReader;
import java.io.StringReader;
import java.io.LineNumberReader;
import java.io.IOException;

public class FileTest
{
	final static String FILENAME = "/storage/emulated/0/AppProjects/JavaLab/JavaLab/output/filetest.txt";
	
	public void helloWorld()
	{
		System.out.println("Hello World, I am " + this.getClass().getName() + "!");
		System.out.println("----------------------------------");
	}
	
	public void run(){
		try
		{
			System.out.println("Demo FileWriter");
			FileWriter fileWriter = new FileWriter(FILENAME);
			fileWriter.write("Hello World,I am " + FILENAME);
			fileWriter.close();
			
			System.out.println("Demo FileReader and lineNumberReader");
			FileReader fileReader = new FileReader(FILENAME);
			LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
			System.out.println(lineNumberReader.readLine());
			
			
		}
		catch (IOException e)
		{System.out.println(e.getMessage());}
		
		
		
	}
}
