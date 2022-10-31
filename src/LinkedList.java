
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
		// verficar se a lista é nula
		if (this.head == null) {
			return;
		} 
		
		int maxPosition = this.size();
		if (position < 1 || position > maxPosition) {
			return;
		}

		Node arr = this.head;
		int i = 1;
		while (arr != null) {
			if (i == position) {
				arr.content = value;
				break;
			}
			i++;
			arr = arr.next;
		}

	}

	@Override
	public int size() {
		Node arr = this.head;
		int i = 0;

		while (arr != null) {
			i++;
			arr = arr.next;
		}
		return i;
	}
}
