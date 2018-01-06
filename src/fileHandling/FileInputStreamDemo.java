package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Selenium\\xpath.txt");
		FileInputStream fis=new FileInputStream(file);
		
		byte fileContent[] = new byte[(int) file.length()];
		fis.read(fileContent);
	     
	       //create string from byte array
	       String strFileContent = new String(fileContent);
	     
	       System.out.println("File content : ");
	       System.out.println(strFileContent);
	     
		
		/*int a=fis.read();
		while(a!=-1)
		{
			
			//System.out.print((char) content);
			
			System.out.print ((char)a+" ");
			a=fis.read();
		}*/
	}

}
