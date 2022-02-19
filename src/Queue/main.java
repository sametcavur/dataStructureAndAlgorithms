package Queue;

public class main {

	public static void main(String[] args) {

		Structure structure = new Structure(5);
		structure.enQueue(10);
		structure.enQueue(20);
		structure.enQueue(30);
		structure.enQueue(40);
		structure.enQueue(50);
		structure.deQueue();
		structure.deQueue();
		structure.deQueue();
			
		structure.writeTheQueue();
	}
}