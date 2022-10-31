
public class LinkedList implements List{
	
	private Node head;

	@Override
	public void add(int value) {
		
		Node newNode = new Node(value);
		
		if(head == null) {
			head = newNode;
		} else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			
			current.next = newNode;
		}
		
	}

	@Override
	public void remove(int value) {
		
	}

	@Override
	public String show() {
		if (this.head == null) {
			return "Lista vazia";
		}

		String output = "";
		Node arr = this.head;

		while (arr != null) {
			output += arr.content + " - ";
			arr = arr.next;
		}

		return output;
	}

	@Override
	public void update(int position, int value) {
		
	}

	@Override
	public int size() {
		int i = 0;

		if (this.head != null) {
			i++;
		}
		return i;
	}
}
