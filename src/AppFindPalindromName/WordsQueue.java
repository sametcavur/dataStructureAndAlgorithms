package AppFindPalindromName;

public class WordsQueue {

	int queueSize;
	int count;
	Node frontNode;
	Node rearNode;

	public WordsQueue(int queueSize) {
		this.queueSize = queueSize;
		this.count = 0;
		this.frontNode = null;
		this.rearNode = null;
	}

	void enQueue(char character) {
		if(this.isFull()) {
			System.out.println("Queue is full..!");
		}else {
			Node newNode = new Node(character);
			if(this.isEmpty()) {
				rearNode = newNode;
				frontNode = newNode;
			}else {
				rearNode.nextNode = newNode;
				rearNode = rearNode.nextNode;
			}
			count++;
		}
	}

	char deQueue() {
		char chr ='*';
		if(this.isEmpty()) {
			System.out.println("Queue is empty..!");
		}else {
			chr = frontNode.word;
			frontNode = frontNode.nextNode;
			count--;
		}
		return chr;
	}

	boolean isFull() {
		return count == queueSize;
	}

	boolean isEmpty() {
		return count == 0;
	}

}
