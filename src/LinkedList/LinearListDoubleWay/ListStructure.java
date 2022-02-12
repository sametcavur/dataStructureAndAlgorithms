package LinkedList.LinearListDoubleWay;

public class ListStructure {

	Node headNode;
	Node tailNode;
	
	void addNewNodeTopOfTheList(int number) {
		Node node = new Node(number);
		if(headNode == null) {
			headNode = node;
			headNode.nextNode = node;
			headNode.prevNode = null;
			tailNode = node;
			tailNode.prevNode = node;
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
		//NOT: 
		//Tek yönlü listelerde araya ekleme ve aradan silme yaparken işlem yapmak istediğimiz indeks'teki
		//elemanı ve bu elemanın bir öncekini bulurduk fakat burada prev yani önceki node'yi tuttuğumuz için
		//önceki elemanı bulan temp Node2 'ye gerek duymuyoruz.
		
		Node newNode = new Node(number);
		if(headNode == null && indexNo == 0) { //If List doesnt exist, create new list
			headNode = newNode;
			headNode.nextNode = newNode;
			tailNode = newNode;
			System.out.println("List is empty and new list is created..!");
		}else if(headNode != null && indexNo == 0) { //If list already exist but you want to add new node top of the list.
			newNode.nextNode = headNode;
			headNode.prevNode = newNode;
			headNode = newNode;
			System.out.println("New node is defined top of the list..!");
		}else {
		// 0 - 1 - 2 - 3 - 4 - 5
		int numara = 0;				// 0 1 2
		Node tempNode1 = headNode;  // 0 1 2
		while(numara < indexNo) {
			tempNode1 = tempNode1.nextNode;
			numara++;
		}
		newNode.prevNode = tempNode1.prevNode;
		tempNode1.prevNode.nextNode = newNode;
		newNode.nextNode = tempNode1;
		tempNode1.prevNode = newNode;
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
		//NOT: 
		//Tek yönlü listelerde araya ekleme ve aradan silme yaparken işlem yapmak istediğimiz indeks'teki
		//elemanı ve bu elemanın bir öncekini bulurduk fakat burada prev yani önceki node'yi tuttuğumuz için
		//önceki elemanı bulan temp Node2 'ye gerek duymuyoruz.
		
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
