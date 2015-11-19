package lecture_10;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String sample = s.nextLine();
		String text = s.nextLine();
		int pos = -1;
		while(true) {
			pos = text.indexOf(sample, pos + 1);
			if (pos < 0) 
				break;
			System.out.println(pos);
		}
		

	}

}
