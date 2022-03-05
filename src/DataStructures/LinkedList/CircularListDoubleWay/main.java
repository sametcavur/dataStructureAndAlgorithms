package DataStructures.LinkedList.CircularListDoubleWay;

public class main {

	public static void main(String[] args) {
		
		ListStructure listStructure = new ListStructure();
		
		listStructure.addNewNodeTopOfList(20);
		
		listStructure.addNewNodeTopOfList(10);
		
		listStructure.addNewNodeBetween(1, 15);
		
		listStructure .addNewNodeEndOfTheList(25);
		
		listStructure.removeBetween(1);
		
		
		
		
		
		listStructure.writeTheList();

	}

}
