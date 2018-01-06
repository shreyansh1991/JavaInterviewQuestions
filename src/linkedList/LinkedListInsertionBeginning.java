package linkedList;

class ListNode {
	public int data;
	public ListNode next;

	ListNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

}

public class LinkedListInsertionBeginning {
	ListNode head;
	int length = 0;
	String data = "";
	ListNode temp;

	public static void main(String[] args) {
		LinkedListInsertionBeginning obj = new LinkedListInsertionBeginning();
		obj.insertNodeAtBeginning(5);
		obj.insertNodeAtBeginning(6);
		obj.insertNodeAtBeginning(7);
		obj.insertNodeAtBeginning(8);
		System.out.println(obj);

		/*
		 * LinkedListInsertionBeginning obj2 = new
		 * LinkedListInsertionBeginning(); obj2.insertNodeAtLast(2);
		 * obj2.insertNodeAtLast(3); obj2.insertNodeAtLast(4); //
		 * obj.insertNodeAtBeginning(8); System.out.println(obj2);
		 * 
		 * obj2.insertNodeAtIndex(120, 1); System.out.println(obj2);
		 * obj2.insertNodeAtIndex(12, 1); System.out.println(obj2);
		 */ }

	private void insertNodeAtBeginning(int data) {

		ListNode node = new ListNode(data);
		node.setNext(head);
		head = node;
		length++;

	}

	private void insertNodeAtLast(int data) {

		ListNode temp1, temp2;
		ListNode node = new ListNode(data);
		if (head == null)
			head = node;
		else {
			for (temp1 = head; (temp2 = temp1.getNext()) != null; temp1 = temp2) {

			}
			temp1.setNext(node);

		}
		length++;

	}

	private void insertNodeAtIndex(int data, int index) {
		ListNode temp1, temp2;
		ListNode node = new ListNode(data);
		if (head == null) {
			head = node;

		}
		temp1 = head;
		for (int i = 1; i < index; i++) {
			temp1 = temp1.getNext();
		}
		node.next = temp1.getNext();
		temp1.setNext(node);
		length++;
	}

	public String toString() {
		String data = "[";
		data = data + head.getData();
		temp = head.getNext();
		System.out.println("Temp - " + temp.getData());
		// System.out.println("temp - " + temp.hashCode());
		while (temp != null) {
			System.out.println("Temp - " + temp.getData());
			data = data + "------" + temp.getData();
			temp = temp.getNext();
			// System.out.println("tempp - " + temp.hashCode());
		}
		return data + "]";

	}
}
