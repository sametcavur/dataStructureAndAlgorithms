package DataStructures.HashTable;

public class Node {
	int key;
	String value;
	Node nextNode;
	
	public Node() {
		this.nextNode = null;
	}

	public Node(int key, String value) {
		this.key = key;
		this.value = value;
		this.nextNode = null;
	}
}
