package LinkedList.CircularListOneWay;

public class main {

	public static void main(String[] args) {
		
		ListStructure listStructure = new ListStructure();
		
		listStructure.addNewNodeToTopOfTheList(30);
		listStructure.addNewNodeToEndOfTheList(40);
		listStructure.addNewNodeToTopOfTheList(20);
		listStructure.addNewNodeToEndOfTheList(50);
		listStructure.addNewNodeToBetweenOfTheList(2, 35);
		
		listStructure.removeHeadNode();
		listStructure.removeTailNode();
		
		listStructure.removeBetween(1);
		
		
		listStructure.writeTheList();
		
	}

}
