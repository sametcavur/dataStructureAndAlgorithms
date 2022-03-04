package Tree;

public class Tree {

	Node root;

	public Tree() {
		this.root = null;
	}

	Node newNode(int data) {
		root = new Node(data);
		return root;
	}

	Node insertData(Node root, int data) {

		if (root != null) {
			if (root.data > data) {
				root.leftNode = insertData(root.leftNode, data);
			} else {
				root.rightNode = insertData(root.rightNode, data);
			}
		} else {
			root = newNode(data);
		}
		return root;
	}

	Node delete(Node root, int data) {
		Node tempNode1;
		Node tempNode2;
		
		if (root == null) {
			return null;
		} else if (root.data == data) {
			if (root.leftNode == root.rightNode) { //If there is no leaf node..!
				root = null;
				return null;
			} else if (root.leftNode == null) {
				tempNode1 = root.rightNode;
				return tempNode1;
			} else if (root.rightNode == null) {
				tempNode1 = root.leftNode;
				return tempNode1;
			} else {
				tempNode1 = tempNode2 = root.rightNode;
				while (tempNode1.leftNode != null) {
					tempNode1 = tempNode1.leftNode;
				}
				tempNode1.leftNode = root.leftNode;
				return tempNode2;
			}
		} else {
			if (data < root.data) {
				root.leftNode = delete(root.leftNode, data);
			} else {
				root.rightNode = delete(root.rightNode, data);
			}
			return root;
		}
	}

	int height(Node root) {
		int left = 0;
		int right = 0;

		if (root == null) {
			return 0;
		} else {
			left = height(root.leftNode);
			right = height(root.rightNode);

			if (left > right)
				return left + 1;
			else
				return right + 1;
		}
	}

	int size(Node root) {
		if (root == null)
			return 0;
		else
			return size(root.leftNode) + 1 + size(root.rightNode);

	}

	void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.data + "-");
			preOrder(root.leftNode);
			preOrder(root.rightNode);
		}
	}

	void inOrder(Node root) {
		if (root != null) {
			inOrder(root.leftNode);
			System.out.print(root.data + "-");
			inOrder(root.rightNode);
		}
	}

	void postOrder(Node root) {
		if (root != null) {
			postOrder(root.leftNode);
			postOrder(root.rightNode);
			System.out.print(root.data + "-");
		}
	}

}
