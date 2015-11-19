package lecture_10;

import java.util.Random;


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
	
	private int d = 0;
	
	private void print(Node node) { // ЛКП
		if (node == null)
			return;
		
		d++;
		print(node.left);
		
		for(int i = 0; i < d - 1; i++)
			System.out.print("\t");
		System.out.println(node.value);
		
		print(node.right);
		d--;
	}
	
	public void print() {
		print(root);
	}
	
}



public class Sample3 {

	public static void main(String[] args) {
		Tree t = new Tree();
		Random r = new Random();
		for(int i = 0; i < 20; i++)
			t.add(r.nextInt() % 1000);
		t.print();

	}

}
