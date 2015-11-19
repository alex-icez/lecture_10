package lecture_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream out = new ObjectOutputStream
				(new FileOutputStream("out"));
		Point p = new Point(10,20);
		out.writeObject(p);
		out.close();
		
		
		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("out"));
		Point p2 = (Point)in.readObject();
		System.out.println(p2.x + " " + p2.y);
	}
}
