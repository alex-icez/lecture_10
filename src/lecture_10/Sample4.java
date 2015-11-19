package lecture_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample4 {

	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("test");
		byte arr[] = "qwerty on".getBytes();
		out.write(arr);
		out.close();
		
		
		FileInputStream in = new FileInputStream("test");
		int ch;
		while((ch = in.read()) != -1) {
			System.out.print((char)ch);
		}
		

	}

}
