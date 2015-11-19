package lecture_10;


class Tree {
	private class Node {
		int value;
		Node left;
		Node right;
		public Node(int value) {
			this.value = value;
		}
	}
	
	private Node root = null;
	
	public void add(int value) {
		Node node = new Node(value);
		if (root == null) {
			root = node;
			return;
		}
		Node iter = root;
		
		
	
	}
	
	
}



public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
