package OneWay.LinkedList;

public class ListStructure {
	
	Node headNode;
	Node lastNode;
	
	
	public void addNewNodeToTopOfTheList(int number) {
		Node newNode = new Node();
		newNode.number = number;

		if(headNode == null) {
			headNode = newNode;
			headNode.nextNode = newNode;
			lastNode = newNode;
			System.out.println("doesnt exist a list,and created a new");
		}else {
			newNode.nextNode = headNode;
			headNode = newNode;
			System.out.println("New head node is added");
		}
	} 
	
	public void addNewNodeToEndOfTheList(int number) {
		Node newNode = new Node();
		newNode.number = number;

		if(headNode == null) {
			headNode = newNode;
			headNode.nextNode = newNode;
			lastNode = newNode;
			System.out.println("doesnt exist a list,and created a new");
		}else {
			lastNode.nextNode = newNode;
			lastNode = newNode;
			System.out.println("New tail node is added");
		}
	}
	
	public void addNewNodeToBetween(int indexNo,int number) {
		Node newNode = new Node();
		newNode.number = number;
		
		if(headNode == null && indexNo == 0) {//If List doesnt exist,created a new list
			headNode = newNode;
			headNode.nextNode = newNode;
			lastNode = newNode;
			System.out.println("doesnt exist a list,and created a new");
		}else if(headNode != null && indexNo == 0) {//If List exist,but you want to add new node to top of the list
			newNode.nextNode = headNode;
			headNode = newNode;
			System.out.println("New head node is added");
		}else {
//			int indexLenght = 0;
//			Node firstNode = headNode;
//			Node secondNode = headNode;
//			while(secondNode.nextNode != null) {
//				secondNode = secondNode.nextNode;
//				firstNode = secondNode;
//				indexLenght++;//inquire size of list
//			}
			
			Node firstNode = headNode;	//rollback the change on top
			Node secondNode = headNode;	//rollback the change on top
			int num = 0;
			while(num < indexNo) {
				secondNode = firstNode;
				firstNode = firstNode.nextNode;
				num++;
			}
			
			secondNode.nextNode = newNode;
			newNode.nextNode = firstNode;
			
			System.out.println("New node added instead your index number.!");
		}
		
	}
	
	public void writeTheList() {
		
		if(headNode == null) {
			System.out.println("List doesnt exist");
		}else {
			System.out.print("HEAD - > ");
			Node refNode = headNode;
			while(refNode != null) {
				System.out.print(refNode.number +" - ");
				refNode = refNode.nextNode;
			}
			System.out.print("> LAST");
		}
	}

}
