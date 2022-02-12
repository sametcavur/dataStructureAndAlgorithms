package LinkedList.LinearListOneWay;

public class ListStructure {
	Node headNode;
	Node lastNode;

	public void addNewNodeToTopOfTheList(int number) {
		Node newNode = new Node();
		newNode.number = number;

		if (headNode == null) {
			headNode = newNode;
			headNode.nextNode = newNode;
			lastNode = newNode;
			System.out.println("doesnt exist a list,and created a new");
		} else {
			newNode.nextNode = headNode;
			headNode = newNode;
			System.out.println("New head node is added");
		}
	}

	public void addNewNodeToEndOfTheList(int number) {
		Node newNode = new Node();
		newNode.number = number;

		if (headNode == null) {
			headNode = newNode;
			headNode.nextNode = newNode;
			lastNode = newNode;
			System.out.println("doesnt exist a list,and created a new");
		} else {
			lastNode.nextNode = newNode;
			lastNode = newNode;
			System.out.println("New tail node is added");
		}
	}

	public void addNewNodeToBetween(int indexNo, int number) {
		Node newNode = new Node();
		newNode.number = number;

		if (headNode == null && indexNo == 0) {// If List doesnt exist,created a new list
			headNode = newNode;
			headNode.nextNode = newNode;
			lastNode = newNode;
			System.out.println("doesnt exist a list,and created a new");
		} else if (headNode != null && indexNo == 0) {// If List exist,but you want to add new node to top of the list
			newNode.nextNode = headNode;
			headNode = newNode;
			System.out.println("New head node is added");
		} else {
			// [1] [2] [x] [3] [4]
			Node firstNode = headNode; // rollback the change on top
			Node secondNode = headNode; // rollback the change on top
			int num = 0;
			while (num < indexNo) {
				secondNode = firstNode;
				firstNode = firstNode.nextNode;
				num++;
			}

			secondNode.nextNode = newNode;
			newNode.nextNode = firstNode;

			System.out.println("New node added instead your index number.!");
		}
	}

	public void removeHeadNode() {
		if (headNode == null) {
			System.out.println("Head Node already doesnt exist..!");
		} else {
			headNode = headNode.nextNode;
			System.out.println("Head Node is removed");
		}
	}

	public void removeTailNode() {
		if (headNode == null) {
			System.out.println("List Structure already doesnt exist..!");
		} else {
			Node refNode1 = headNode;
			Node refNode2 = headNode;
			while (refNode1.nextNode != null) {
				refNode2 = refNode1;
				refNode1 = refNode1.nextNode;
			}
			refNode2.nextNode = null;
			lastNode = refNode2;
			System.out.println("Tail Node is removed");
		}
	}

	public void removeNodeWithIndexNo(int indexNo) {
		if(headNode == null) { //if list structure is empty
			System.out.println("List Structure already doesnt exist..!");
		}else if(headNode.nextNode == null && indexNo == 0) { //if list structure has only one node
			headNode = null;
			lastNode = null;
			System.out.println("List is removed..!");
		}else if(headNode.nextNode != null && indexNo == 0) { //if you want to remove head node
			headNode = headNode.nextNode;
			System.out.println("HeadNode is removed");
		}else {
			int listSize = 0;
			Node tempNode = headNode;
			Node nodeBeforeTemp = headNode;
			
			while(tempNode != null) { 
				nodeBeforeTemp = tempNode;
				tempNode = tempNode.nextNode;
				listSize++;
			}
			if(listSize == indexNo) { //if you want to remove last node
				nodeBeforeTemp.nextNode = null;
				lastNode = nodeBeforeTemp;
				System.out.println("Tail Node is removed");
			}else {
				tempNode = headNode;  //rollback the change on top
				nodeBeforeTemp = headNode;  //rollback the change on top
				//temp = [1]-[2]
				//beforeTemp = [0]-[1]
				int findIndexNo = 0;// 1 2
				while(findIndexNo != indexNo) {// [0] [1] [2] [3] [4]
					findIndexNo++;
					nodeBeforeTemp = tempNode;
					tempNode = tempNode.nextNode;
				}
				nodeBeforeTemp.nextNode = tempNode.nextNode;
				System.out.println("Node which has your index no is removed");
				
			}
		}
	}

	public void writeTheList() {
		if (headNode == null) {
			System.out.println("List doesnt exist");
		} else {
			System.out.print("HEAD - > ");
			Node refNode = headNode;
			while (refNode != null) {
				System.out.print(refNode.number + " - ");
				refNode = refNode.nextNode;
			}
			System.out.print("> LAST");
		}
	}
}
