package HashTable;

public class Main {
	public static void main(String[] args) {
		Table table = new Table(5);
		
		table.addNewNode(0, "Hakan");
		table.addNewNode(5, "2.Hakan");
		
		table.addNewNode(1, "Samet");
		
		table.addNewNode(2, "Mehmet");
		table.addNewNode(7, "2.Mehmet");
		table.addNewNode(12, "3.Mehmet");
		
		
		System.out.println("*********************");
		//System.out.println(table.nodeList[2].nextNode.nextNode.nextNode.value); //3.Mehmet
		System.out.println("*********************");
		
		
		table.writeTheList();
	}
}
