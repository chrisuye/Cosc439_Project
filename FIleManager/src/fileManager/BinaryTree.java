package fileManager;

public class BinaryTree {
	Node root;
	
	BinaryTree(String key){
		root = new Node(key);
	}
	
	BinaryTree(){
		root = null;
	}
	
//	public Node createnewNode(String key) {
//		Node a = new Node();
//		a.key = key;
//		a.left = null;
//		a.right = null;
//		return a;
//		
//	}
//	
//	public Node insert(Node node, String key) {
//		if(node == null) {
//			return createnewNode(key);
//		}
//		
//		if(key < node.key) {
//			node.
//		}
//		
//		return node;
//	}
	
	public void printtree(Node node, int level) {
		if(node == null) {
			return;
		}
		
		if(level == 1) {
			System.out.print(node.key + "  ");
		}
		
		printtree(node.left,level-1);
		printtree(node.right,level-1);
	}


}
