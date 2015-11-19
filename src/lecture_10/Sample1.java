package lecture_10;

public class Sample1 {

	public static void main(String[] args) {
		String sample = "abbaa";
		String text = "aabababababa ababab "
				+ "abbabbbabab abbaa bbabbaa";
		int pos = 0;
		while(true) {
			pos = text.indexOf(sample, pos + 1);
			if (pos < 0) 
				break;
			System.out.println(pos);
		}
		

	}

}
