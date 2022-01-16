package LinkedList;

public class ListStructure {
	
	public Node headNode = null;
	public Node lastNode = null;

	public void addNewNode(int number) {
		Node newNode = new Node();
		newNode.number = number;
		newNode.nextNode = null;
		
		if(headNode == null) { 
			headNode = newNode;
			lastNode = newNode; 
			headNode.nextNode = lastNode;
			System.out.println("List is created and new node added to top of the list structure");
		}else {
			lastNode.nextNode = newNode; //son node'nin devamına yeni node eklendi
			lastNode = newNode;	//son node güncellendi
			System.out.println("New node added to end of the list structure");
		}
	}
	
	public void writeTheList() {
		if(headNode != null && lastNode != null) {
			Node temp = headNode;
			System.out.print("HEAD -> ");
			while(temp != null) {
				System.out.print(temp.number + " -> ");
				temp = temp.nextNode;
			}
			System.out.print(" LAST ");
		}
	}
}
