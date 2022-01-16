package OneWay.LinkedList;

public class main {

	public static void main(String[] args) {

		ListStructure listStructure = new ListStructure();
		
		listStructure.addNewNodeToTopOfTheList(10);
		listStructure.addNewNodeToTopOfTheList(50);
		
		listStructure.addNewNodeToEndOfTheList(55);
		listStructure.addNewNodeToEndOfTheList(23);
		listStructure.addNewNodeToEndOfTheList(10);
		listStructure.addNewNodeToTopOfTheList(3);
		
		listStructure.writeTheList();
		
	}
}
