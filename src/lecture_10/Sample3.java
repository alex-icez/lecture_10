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
		while(true) {
			if (value > iter.value) {
				if (iter.right != null) 
					iter = iter.right;
				else {
					iter.right = node;
					break;
				}
			} else {
				if (iter.left != null)
					iter = iter.left;
				else {
					iter.left = node;
					break;
				}
			}
		}
	}
	
	private void print(Node node) { // ЛКП
		if (node == null)
			return;
		print(node.left);
		System.out.println(node.value);
		print(node.right);
	}
	
	public void print() {
		print(root);
	}
	
}



public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
