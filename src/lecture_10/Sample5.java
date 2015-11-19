package lecture_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Point {
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Sample5 {
	public static void main(String args[]) throws FileNotFoundException, IOException {
		ObjectOutputStream out = new ObjectOutputStream
				(new FileOutputStream("out"));
		out.writeByte(123);
		out.close();
	}
}
