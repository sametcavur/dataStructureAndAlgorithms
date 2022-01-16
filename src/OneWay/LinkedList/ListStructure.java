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
			System.out.println("doesnt exist a list,and create a new");
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
			System.out.println("doesnt exist a list,and create a new");
		}else {
			lastNode.nextNode = newNode;
			lastNode = newNode;
			System.out.println("New tail node is added");
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
