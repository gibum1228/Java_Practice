package SList;

import java.util.NoSuchElementException;

public class SList <E extends Comparable<E>> {
	
	protected Node head;  // ���� ����Ʈ�� ù ��� ����Ŵ
	private   int  size;
	public Node getHead() { return head; }
	public void setHead(Node n) { head= n;}
	public SList(){       // ���� ����Ʈ ������
		head = null;
		size = 0;
	}
	public int size() { return size; }
	public boolean isEmpty() { return size == 0; }

	public void insertFront(E newItem){ // ���Ḯ��Ʈ �� �տ� �� ��� ����
		head = new Node(newItem, head);
		size++;
	}
	
	public void insertAfter(E newItem, Node p){ // ��� p �ٷ� ������ �� ��� ����
		p.setNext(new Node(newItem, p.getNext()));
		size++;
	}
	
	public void deleteFront(){       // ����Ʈ�� ù ��� ����
		if (isEmpty()) throw new NoSuchElementException();
		head = head.getNext();
		size--;
	}
	
	public void deleteAfter(Node p){ // p�� ����Ű�� ����� ���� ��带 ����
		if (p == null) throw new NoSuchElementException();
		Node t = p.getNext();
		p.setNext(t.getNext());
		t.setNext(null);
		size--;
	}

	 public int search(E target) {   // target�� Ž��  
		 Node p = head;
		 for (int  k = 0; k < size ;k++){
			 if (target == p.getItem()) return k;
			 p = p.getNext(); 
		 }
		 return -1; // Ž���� ������ ��� -1 ����
	 }
	 public Node mergeTwoLists(Node p1, Node p2){ //�������� 2-17 �ΰ��� ���ĵ� ����Ʈ �պ�
		 Node head = new Node(0, null);
		 Node p = head;
		 while(p1!=null && p2!=null){
			 int c =  p1.getItem().compareTo(p2.getItem());
			 if (c < 0) {
				 p.setNext(p1);
				 p1=p1.getNext();
			 }
			 else{
				 p.setNext(p2);
				 p2=p2.getNext();
			 }
			 p = p.getNext();
		 }
		 if(p1 != null) p.setNext(p1);
		 if(p2 != null) p.setNext(p2);
		 return head.getNext();
	 }

	 public static Node reverseList(Node currentNode){  //�������� 2-19 ������ ����Ʈ
		 Node previousNode=null;  
		 Node nextNode;  
		 while(currentNode!=null){  
			 nextNode=currentNode.getNext();  
			 currentNode.setNext(previousNode);  // ��ũ ������
			 previousNode=currentNode;  
			 currentNode=nextNode;  
		 }  
		 return previousNode;  
	 }
	 
	 //�������� 2-20 k�� ���ų� ���� ����Ʈ�� k���� ū ����Ʈ�� �и�
	 public void splitList(Node p, int k, SList l1, SList l2){ 
		 Node head1 = new Node(0, null);
		 Node head2 = new Node(0, null);
		 Node p1 = head1;
		 Node p2 = head2;
		 while(p !=null){
			 int c =  p.getItem().compareTo(k);
			 if (c <= 0) {
				 p1.setNext(p);
				 p1=p1.getNext();
			 }
			 else{
				 p2.setNext(p);
				 p2=p2.getNext();
			 }
			 p = p.getNext();
		 }
		 p1.setNext(null);
		 p2.setNext(null);
		 l1.setHead(head1.getNext());
		 l2.setHead(head2.getNext());
	 }

	 // �������� 2-21 ����� ������ ��
	 public int commonSum(SList l2){ 
		 int sum = 0;
		 Node p1 = head;
		 Node p2 = l2.getHead();
		 while(p1 !=null && p2 != null){
			 int c =  p1.getItem().compareTo(p2.getItem());
			 if (c == 0) {
				 sum += (int) p1.getItem();
				 p1=p1.getNext();
				 p2=p2.getNext();
			 }
			 else if (c  < 0) 	p1=p1.getNext();
			 else 				p2=p2.getNext();  
		 }
		 return sum;
	 }

	 // �������� 2-22 �߰� ��� ã��
	 public Node findMiddleNode(Node head){  
		 Node slowPointer, fastPointer;   
		 slowPointer = fastPointer = head;    
		 while(fastPointer != null) {   
			 fastPointer = fastPointer.getNext();   
			 if(fastPointer != null && fastPointer.getNext() != null) {   
				 slowPointer = slowPointer.getNext();   
				 fastPointer = fastPointer.getNext();   
			 }   
		 }   
		 return slowPointer;
	 } 

	 // �������� 2-23 ����Ŭ �˻�
	 public boolean cycleDetector() {  
		 Node fastPtr = head;  
		 Node slowPtr = head;  
		 while (fastPtr != null && fastPtr.getNext() != null) {  
			 fastPtr = fastPtr.getNext().getNext();  
			 slowPtr = slowPtr.getNext();  
			 if (slowPtr == fastPtr)  
				 return true;  	  
		 }  
		 return false;  
	 }
	 
	 public void createCycle(){  // ȯ������Ʈ �����
		 Node p = head;
		 Node q = null;
		 while(p != null){
			 q = p;
			 p = p.getNext();
		 }
		 q.setNext(head);
	 }

	public void print(){  // ���� ����Ʈ ������ �׸���� ���ʷ� ���
		for (Node p = head; p != null; p = p.getNext()) 
			System.out.print(p.getItem()+"\t ");
		System.out.println();
	}
}

