package lecture_10;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample4 {

	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("test");
		BufferedOutputStream bout = new BufferedOutputStream(out, 1000);
		byte arr[] = "qwerty on".getBytes();
		bout.write(arr);
		bout.close();
		
		
		FileInputStream in = new FileInputStream("test");
		BufferedInputStream bin = new 
		int ch;
		while((ch = in.read()) != -1) {
			System.out.print((char)ch);
		}
		

	}

}
