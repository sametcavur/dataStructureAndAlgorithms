package LinkedList.CircularListDoubleWay;


public class ListStructure {
	Node headNode;
	Node tailNode;
	
	
	void addNewNodeTopOfList(int data) {
		Node newNode = new Node(data);
		
		if(headNode == null) {  // if list is empty,create new list structure..!
			headNode = newNode;
			tailNode = newNode;
			
			headNode.nextNode = tailNode;
			headNode.prevNode = tailNode;
			tailNode.nextNode = headNode;
			tailNode.prevNode = headNode;
		}else {	// if list is exist,but you want to add new node top of the list..!
			newNode.nextNode = headNode;
			headNode.prevNode = newNode;
			headNode = newNode;
			headNode.prevNode = tailNode;
			tailNode.nextNode = headNode;
		}
	}
	
	void addNewNodeEndOfTheList(int data) {
		Node newNode = new Node(data);
		if(headNode == null) {	// if list is empty,create new list structure..!
			headNode = newNode;
			tailNode = newNode;
			
			headNode.nextNode = tailNode;
			headNode.prevNode = tailNode;
			tailNode.nextNode = headNode;
			tailNode.prevNode = headNode;
		}else {
			tailNode.nextNode = newNode;
			newNode.prevNode = tailNode;
			tailNode = newNode;
			tailNode.nextNode = headNode;
			headNode.prevNode = tailNode;
			
		}
	}
	
	void addNewNodeBetween(int indexNo,int data) {
		Node newNode = new Node(data);
		if(headNode == null && indexNo == 0) {	// if list is empty,create new list structure..!
			headNode = newNode;
			tailNode = newNode;
			
			headNode.nextNode = tailNode;
			headNode.prevNode = tailNode;
			tailNode.nextNode = headNode;
			tailNode.prevNode = headNode;
		}else if(headNode != null && indexNo == 0) { // if list is not empty,but you want to add new node to top of the list..!
			newNode.nextNode = headNode;
			headNode.prevNode = newNode;
			headNode = newNode;
			headNode.prevNode = tailNode;
			tailNode.nextNode = headNode;
		}else {
			int listOfSize = 0;
			Node tempNode = headNode;
			Node tempNode2 = headNode;
			while(tempNode != tailNode) {
				tempNode = tempNode.nextNode;
				listOfSize++;
			}
			listOfSize++;
			if((listOfSize-1) < indexNo) { // You want to add new node to end of the list..!
				tailNode.nextNode = newNode;
				newNode.prevNode = tailNode;
				tailNode = newNode;
				tailNode.nextNode = headNode;
				headNode.prevNode = tailNode;
			}else {
				tempNode = headNode;
				tempNode2 = headNode;
				int number = 0;
				while(number < indexNo) { 
					tempNode2 = tempNode;
					tempNode = tempNode.nextNode;
					number++;
				}
				// 0 1 2 3 4
				tempNode2.nextNode = newNode;
				newNode.prevNode = tempNode2;
				
				newNode.nextNode = tempNode;
				tempNode.prevNode = newNode;
				
				
			}
		}
	}

	void removeNodeTopOfTheList() {
		if(headNode == null) {
			System.out.println("List is already empty..!");
		}else {
			headNode = headNode.nextNode;
			headNode.prevNode = tailNode;
			tailNode.nextNode = headNode;
		}
	}
	
	void removeNodeEndOfTheList() {
		if(headNode == null) {
			System.out.println("List is already empty..!");
		}else {
			tailNode = tailNode.prevNode;
			tailNode.nextNode = headNode;
			headNode.prevNode = tailNode;
		}
	}
	
	void removeBetween(int indexNo) {
		Node tempNode = headNode;
		Node tempNode2 = headNode;
		if(headNode == null) { //if list is empty
			System.out.println("List is already empty..!");
		}else if(indexNo == 0) {//if you want to remove head node
			headNode = headNode.nextNode;
			headNode.prevNode = tailNode;
			tailNode.nextNode = headNode;
		}else {
			int listOfSize = 0;
			tempNode = headNode;
			while(tempNode != tailNode) {
				tempNode = tempNode.nextNode;
				listOfSize++;
			}
			listOfSize++;
			
			if((listOfSize-1) <= indexNo) { // if you want to remove tail node
				tailNode = tailNode.prevNode;
				tailNode.nextNode = headNode;
				headNode.prevNode = tailNode;
			}else {
				int number = 0;      //0 1 2 3
				tempNode = headNode; //0 1 2 3
				tempNode2 = headNode;//0 1 2
				//0 1 2 3 4 5        //3
				while(number < indexNo) {
					tempNode2 = tempNode;
					tempNode = tempNode.nextNode;
					number++;
				}
				tempNode2.nextNode = tempNode.nextNode;
				tempNode.nextNode.prevNode = tempNode2;
			}
		}
	}
	
	void writeTheList() {
		//0 1 2 3 4
		Node tempNode = headNode;
		if(headNode == null) {
			System.out.println("List is empty..!");
		}else {
			while(tempNode != tailNode) {
				System.out.println(tempNode.data);
				tempNode = tempNode.nextNode;
			}
			System.out.println(tempNode.data);
		}
	}

}
