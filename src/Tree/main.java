package Tree;

public class main {

	public static void main(String[] args) {
		Tree tree = new Tree();

		tree.root = tree.insertData(tree.root, 10);
		tree.root = tree.insertData(tree.root, 8);
		tree.root = tree.insertData(tree.root, 15);
		tree.root = tree.insertData(tree.root, 5);
		tree.root = tree.insertData(tree.root, 12);
		tree.root = tree.insertData(tree.root, 20);
		tree.root = tree.insertData(tree.root, 9);
		tree.root = tree.insertData(tree.root, 25);
		
		tree.root = tree.delete(tree.root, 10);
		tree.root = tree.delete(tree.root, 15);
		System.err.println(tree.root.data);

		System.out.print("Pre Order Sorting : ");
		tree.preOrder(tree.root);
		System.out.println();
		
		System.out.print("In Order Sorting : ");
		tree.inOrder(tree.root);
		System.out.println();
		
		System.out.print("Post Order Sorting : ");
		tree.postOrder(tree.root);
		System.out.println();
		
		System.out.print("Height Of Tree : " + tree.height(tree.root));
		System.out.println();
		System.out.println("Size Of Tree : " + tree.size(tree.root));
		System.out.println();
		
	}
}
