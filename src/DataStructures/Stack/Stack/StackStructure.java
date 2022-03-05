package DataStructures.Stack.Stack;

public class StackStructure {
	int stackSize;
	int indexNo;
	Node topNode;

	public StackStructure(int stackSize) {
		this.stackSize = stackSize;
		this.indexNo = 0;
		this.topNode = null;
	}

	void push(int data) {
		Node newNode = new Node(data);
		if (this.isFull()) {
			System.out.println("Stack is already full..!");
		} else {
			if (this.isEmpty()) {
				topNode = newNode;
			} else {
				newNode.nextNode = topNode;
				topNode = newNode;
			}
			indexNo++;
		}
	}

	void pull() {
		if (this.isEmpty()) {
			System.out.println("Stack is empty..!");
		} else {
			System.out.println("Item is removed : " + topNode.data);
			topNode = topNode.nextNode;
			indexNo--;
		}
	}

	void writeTheList() {
		if (this.isEmpty()) {
			System.out.println("Stack is already empty..!");
		} else {
			Node tempNode = topNode;
			while (tempNode != null) {
				System.out.println(tempNode.data);
				tempNode = tempNode.nextNode;
			}
		}
	}

	boolean isFull() {
		return indexNo == stackSize;
	}

	boolean isEmpty() {
		return indexNo == 0;
	}
}
