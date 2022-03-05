package DataStructures.HashTable;

public class Table {
	Node[] nodeList;
	int size;
	
	public Table(int size) {
		this.size = size;
		this.nodeList = new Node[size];
		for (int i = 0; i < size; i++) {
			nodeList[i] = new Node();
		}
	}
	
	int calculateIndex(int key) {
		return key % size;
	}
	
	void addNewNode(int key, String value) {
		int indexNo = calculateIndex(key);
		
		Node node = new Node(key, value);
		
		Node tempNode = nodeList[indexNo];
		
		while(tempNode.nextNode != null) {
			tempNode = tempNode.nextNode;
		}
		
		tempNode.nextNode = node;
		
		System.out.println("New node is added..!");
	}

	public void delete(int key) {
		int deletingIndex = this.calculateIndex(key);
		
		Node tempNode = nodeList[deletingIndex];
		Node tempNode2 = tempNode;
		
		if(tempNode.nextNode == null) {
			System.out.println("Cant found any item..!");
		}
		else {
			while(tempNode.key != key) {
				tempNode2 = tempNode;
				tempNode = tempNode.nextNode;
			}
				System.out.println(tempNode.key + " is deleted..!");
				tempNode2.nextNode = tempNode.nextNode;
		}
	}
	
	public void writeTheList() {
		for (int i = 0; i < size; i++) {
			Node tempNode = new Node();
			tempNode = nodeList[i];
			System.out.print("Array["+i+"] : ");
			
			if(tempNode.nextNode != null) {
				while(tempNode.nextNode != null) {
					
					System.out.print(tempNode.nextNode.value + " -> ");
					tempNode = tempNode.nextNode;
				}
			}
			System.out.println();
		}
	}
}