package OneWay.LinkedList;

public class main {

	public static void main(String[] args) {

		ListStructure listStructure = new ListStructure();
		
		listStructure.addNewNodeToTopOfTheList(1);
		
		listStructure.addNewNodeToEndOfTheList(2);
		
		listStructure.addNewNodeToTopOfTheList(3);
		
		listStructure.addNewNodeToBetween(2, 6);
		
		listStructure.addNewNodeToBetween(0, 9);
		
		listStructure.addNewNodeToBetween(1, 7);
		
		
		listStructure.writeTheList();
		
	}
}
