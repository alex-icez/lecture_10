package lecture_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sample5 {
	public static void main(String args[]) throws FileNotFoundException, IOException {
		ObjectOutputStream out = new ObjectOutputStream
				(new FileOutputStream("out"));
		out.writeByte(123);
		out.close();
	}
}
