package Queue;

public class Structure {
	Node frontNode;
	Node rearNode;
	int count;
	int structureSize;

	public Structure(int structureSize) {
		this.frontNode = null;
		this.rearNode = null;
		this.count = 0;
		this.structureSize = structureSize;
	}

	void enQueue(int data) {
		Node newNode = new Node(data);
		if (this.isFull()) {
			System.out.println("Structure is already full..!");
		} else {
			if(count == 0) {
				System.out.println("New node is added to top of the queue..!");
				frontNode = newNode;
				rearNode = newNode;
			}else {
				System.out.println("New node is added to queue..!");
				rearNode.nextNode = newNode;
				rearNode = newNode;
			}
			count++;
		}
	}

	void deQueue() {
		if (this.isEmpty()) {
			System.out.println("Queue has not any node to remove ..!");
		} else {
			frontNode = frontNode.nextNode;
			count--;
		} // f 1 2 3 4 5 r
	}

	void writeTheQueue() {
		Node tempNode = frontNode;
		if(this.isEmpty()) {
			System.out.println("Queue has not any node for showing ..!");
		}else {
			while(tempNode != null) {
				System.out.println("Item : " + tempNode.data);
			tempNode = tempNode.nextNode;
		}
		}
		
	}

	boolean isFull() {
		return count == structureSize;
	}

	boolean isEmpty() {
		return count == 0;
	}

}
