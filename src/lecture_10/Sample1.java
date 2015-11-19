package lecture_10;

public class Sample1 {

	public static void main(String[] args) {
		String sample = "abbaa";
		String text = "abbaa aabababababa ababab "
				+ "abbabbbabab abbaa bbabbaa";
		int pos = -1;
		while(true) {
			pos = text.indexOf(sample, pos + 1);
			if (pos < 0) 
				break;
			System.out.println(pos);
		}
		

	}

}
