package bt1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class docfile {
public static void main(String[] args) throws IOException {
	File file = new File("text.txt");
	FileInputStream fileInputStream = new FileInputStream(file);
	 int c  = fileInputStream.read();
	 while (c!=-1) {
		 System.out.print((char)c);
		 c= fileInputStream.read();
		 
		 
	 }
	 fileInputStream.close();
}
}
