package lecture_10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample4 {

	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("test");
		byte arr[] = "qwerty on вапвпав".getBytes();
		out.write(arr);
		out.close();
		
		
		//	FileInputStream in = new FileInputStream();

	}

}
