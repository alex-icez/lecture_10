package lecture_10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sample4 {

	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("test");
		BufferedOutputStream bout = 
				new BufferedOutputStream(out, 1000);
	
		OutputStreamWriter out = new OutputStreamWriter(bout, "cp1251")ж
		
		
		PrintWriter p = new PrintWriter(out);
		
		p.println("Hello World!!");
		p.close();
		
		
		FileInputStream in = new FileInputStream("test");
		BufferedInputStream bin = new BufferedInputStream(in, 1000);
		Scanner s = new Scanner(bin);
		while(s.hasNextLine()) {
			System.out.print(s.nextLine());
		}
		
		s.close();
		
		
		
		
		
		
		
		
		
	}

}
