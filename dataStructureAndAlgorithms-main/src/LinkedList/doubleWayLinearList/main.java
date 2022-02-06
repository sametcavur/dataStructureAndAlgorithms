package LinkedList.doubleWayLinearList;

public class main {

	public static void main(String[] args) {
			ListStructure listStructure = new ListStructure();
			listStructure.addNewNodeTopOfTheList(20);
			
			listStructure.addNewNodeEndOfTheList(30);
			
			listStructure.addNewNodeTopOfTheList(10); 
			
			listStructure.addNewNodeEndOfTheList(50); 
			
			listStructure.addNewNodeToBetween(3, 40);
			
			listStructure.addNewNodeToBetween(1, 15);
			
			listStructure.removeHeadNode();
			
			listStructure.removeTailNode();
			
			listStructure.removeNodeBetween(2);
			
			listStructure.writeTheList();
	}
}
