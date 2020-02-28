package fileManager;


import java.util.*;

public class Main {

	public static void main(String[] args) {
//		List<TreeNode> child;
//		child.add();

		BinaryTree tree = new BinaryTree();
		
//		TreeNode tree2 = new TreeNode("hey",child);
		
//		root  = tree.insert(root, "hey");
//		root  = tree.insert(root, "hello");
		
		tree.root = new Node("Start");
		
		tree.root.left = new Node("one left");
		tree.root.right = new Node("one right");
		
		tree.printtree(tree.root, 2);
	}
	

}
