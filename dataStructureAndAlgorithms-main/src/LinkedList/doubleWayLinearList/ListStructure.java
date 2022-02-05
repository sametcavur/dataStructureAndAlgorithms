package LinkedList.doubleWayLinearList;

public class ListStructure {
	
	Node headNode;
	Node tailNode;
	
	void addNewNodeTopOfTheList(int number) {
		Node node = new Node(number);
		if(headNode == null) {
			headNode = node;
			headNode.nextNode = node;
			tailNode = node;
			System.out.println("List is empty and new list is created..!");
		}else {
			node.nextNode = headNode;
			headNode.prevNode = node;
			headNode = node;
			System.out.println("New node is defined top of the list..!");
		}
	}
	
	void addNewNodeEndOfTheList(int number) {
		Node node = new Node(number);
		if(headNode == null) {
			headNode = node;
			headNode.nextNode = node;
			tailNode = node;
			System.out.println("List is empty and new list is created..!");
		}else {
			tailNode.nextNode = node;
			node.prevNode = tailNode;
			tailNode = node;
			System.out.println("New node is defined end of the list..!");
		}
	}
	
	void addNewNodeToBetween(int indexNo, int number) {
		Node node = new Node(number);
		if(headNode == null || indexNo == 0) {
			headNode = node;
			headNode.nextNode = node;
			tailNode = node;
			System.out.println("List is empty and new list is created..!");
		}else if(headNode != null && indexNo == 0) {
			node.nextNode = headNode;
			headNode.prevNode = node;
			headNode = node;
			System.out.println("New node is defined top of the list..!");
		}else {
			// 0 - 1 - 2 - 3 - 4 - 5
			int num = 0; 				//0 1 
			Node tempNode = headNode;	//0 1 2
			Node tempNode2 = headNode;  //0 1
			while(num < indexNo) {
				num++;
				tempNode2 = tempNode; //1
				tempNode = tempNode.nextNode; //2
			}
			tempNode2.nextNode = node;
			node.prevNode = tempNode2;
			
			tempNode.prevNode = node;
			node.nextNode = tempNode;
			System.out.println("New node is defined to selection index");
		}
	}
	
	void removeHeadNode() {
		if (headNode == null) {
			System.out.println("List is not exist..!");
		}else {
			headNode = headNode.nextNode;
			headNode.prevNode = null;
			System.out.println("Head Node is removed..!");
		}
	}
	
	void removeTailNode() {
		if (headNode == null) {
			System.out.println("List is not exist..!");
		}else {
			tailNode = tailNode.prevNode;
			tailNode.nextNode = null;
		}
	}
	
	void removeNodeBetween(int indexNo) {
		if (headNode == null) { // if list structure is empty
			System.out.println("List Structure already doesnt exist..!");
		} else if (headNode.nextNode == null && indexNo == 0) { // if list structure has only one node
			headNode = null;
			tailNode = null;
			System.out.println("List is removed..!");
		} else if (headNode.nextNode != null && indexNo == 0) { // if you want to remove head node
			headNode = headNode.nextNode;
			headNode.prevNode = null;
			System.out.println("HeadNode is removed");
		} else {
			// 0 1 2 3
			// refNode = 	0 1 2
			int num = 0; // 0 1 2
			Node tempNode = headNode; // 0
			while(num < indexNo) {
				num++;
				tempNode = tempNode.nextNode;
			}
			tempNode.nextNode.prevNode = tempNode.prevNode;
			tempNode.prevNode.nextNode = tempNode.nextNode;
		}
	}
	void writeTheList() {
		System.out.println("List is writed");
		while(headNode != null) {
			System.out.println(headNode.number);
			headNode = headNode.nextNode;
		}
	}

}
