package DataStructures.LinkedList.CircularListOneWay;

public class ListStructure {
	Node headNode;
	Node tailNode;

	void addNewNodeToTopOfTheList(int data) {
		Node newNode = new Node(data);

		if (headNode == null) { // if list is empty,create new list structure..!
			headNode = newNode;
			tailNode = newNode;
			tailNode.nextNode = headNode;
		} else { // if list is exist,but you want to add new node top of the list..!
			newNode.nextNode = headNode;
			headNode = newNode;
			tailNode.nextNode = headNode;
		}
	}

	void addNewNodeToEndOfTheList(int data) {
		Node newNode = new Node(data);

		if (headNode == null) { // if list is empty,create new list structure..!
			headNode = newNode;
			tailNode = newNode;
			tailNode.nextNode = headNode;
		} else {
			tailNode.nextNode = newNode;
			tailNode = newNode;
			tailNode.nextNode = headNode;
		}
	}

	void addNewNodeToBetweenOfTheList(int indexNo, int data) {
		Node newNode = new Node(data);

		if (headNode == null) { // if list is empty,create new list structure..!
			headNode = newNode;
			tailNode = newNode;
			tailNode.nextNode = headNode;
		} else if (indexNo == 0) {// if list is exist,but you want to add new node top of the list..!
			newNode.nextNode = headNode;
			headNode = newNode;
			tailNode.nextNode = headNode;
		} else {
			Node tempNode = headNode;
			Node tempNode2 = headNode;
			int sizeOfList = 0;
			while (tempNode != tailNode) {
				tempNode = tempNode.nextNode;
				sizeOfList++;
			}
			sizeOfList++;

			if (indexNo >= (sizeOfList - 1)) { // you want to add new node end of the list..!
				tailNode.nextNode = newNode;
				tailNode = newNode;
				tailNode.nextNode = headNode;
			} else { // add new node to between..!
				tempNode = headNode;
				tempNode2 = headNode;
				int number = 0;
				while (number < indexNo) {
					tempNode2 = tempNode;
					tempNode = tempNode.nextNode;
					number++;
				}
				tempNode2.nextNode = newNode;
				newNode.nextNode = tempNode;
			}
		}
	}

	void removeHeadNode() {
		if (headNode == null) {
			System.out.println("HeadNode already doesnt exist..!");
		} else {
			headNode = headNode.nextNode;
			tailNode.nextNode = headNode;
		}
	}

	void removeTailNode() {
		if (headNode == null) {
			System.out.println("HeadNode already doesnt exist..!");
		} else { // [0] - [1] - [2] - [3]
			Node tempNode = headNode;// 0 1 2
			while (tempNode.nextNode != tailNode) {
				tempNode = tempNode.nextNode;
			}
			tailNode = tempNode;
			tailNode.nextNode = headNode;
		}
	}

	void removeBetween(int indexNo) {
		// 0 1 2 3 4
		if (headNode == null) { // if list already doesnt exist..!
			System.out.println("HeadNode already doesnt exist..!");
		} else if (indexNo == 0) { // if you want to remove head node
			headNode = headNode.nextNode;
			tailNode.nextNode = headNode;
		} else { // 0 1 2 3 4
			Node tempNode = headNode; // 0 1 2 3 4
			Node tempNode2 = headNode;
			int listOfSize = 0; // 0 1 2 3 4 5
			while (tempNode != tailNode) {
				tempNode = tempNode.nextNode;
				listOfSize++;
			}
			listOfSize++;

			if ((listOfSize - 1) <= indexNo) { // if you want to remove tail node..!
				tempNode = headNode;
				while (tempNode.nextNode != tailNode) {
					tempNode = tempNode.nextNode;
				}
				tailNode = tempNode;
				tailNode.nextNode = headNode;

			} else {
				// [0] - [1] - [2] - [3]
				tempNode = headNode; // 0 1 2
				tempNode2 = headNode; // 0 1
				int number = 0; // 0 1 2
				while (number < indexNo) { // 2
					tempNode2 = tempNode;
					tempNode = tempNode.nextNode;
					number++;
				}
				tempNode2.nextNode = tempNode.nextNode;
			}
		}
	}

	void writeTheList() {
		int number = 0;
		Node tempNode = headNode;
		if (headNode == null) {
			System.out.println("List is empty...!");
		} else {
			while (tempNode != tailNode) {
				System.out.println(tempNode.data);
				tempNode = tempNode.nextNode;
			}
			System.out.println(tempNode.data);
		}
	}
}
