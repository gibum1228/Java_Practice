package SList;

public class SMain {
	public static void main(String[] args) {

		SList<String> s = new SList<String>();  // ���� ����Ʈ ��ü s ����
        s.insertFront("orange"); s.insertFront("apple");
		s.insertAfter("cherry",s.head.getNext()); 
		s.insertFront("pear"); 			
		s.print();
		System.out.println(": s�� ���� = "+s.size()+"\n"); 
		System.out.println("ü���� \t"+s.search("cherry")+"��°�� �ִ�.");
		System.out.println("Ű���� \t"+s.search("kiwi")+"��°�� �ִ�.\n");
		s.deleteAfter(s.head);
		s.print(); 
		System.out.println(": s�� ���� = "+s.size());System.out.println();
		s.deleteFront();
		s.print(); 
		System.out.println(": s�� ���� = "+s.size());System.out.println();
		
		SList<Integer> t = new SList<Integer>();  // ���� ����Ʈ ��ü t ����
		t.insertFront(500); t.insertFront(200);	
		t.insertAfter(400,t.head); 
		t.insertFront(100); 
		t.insertAfter(300,t.head.getNext()); 
		t.print();
		System.out.println(": t�� ����  = "+t.size());
		SList<Integer> x = new SList<Integer>();  // ���� ����Ʈ ��ü t ����
		x.insertFront(550); x.insertFront(375);	
		x.insertFront(350); x.insertFront(175);	x.insertFront(150);
		x.print();
		System.out.println(": x�� ����  = "+x.size()); System.out.println("-----------------------");
		SList<Integer> m = new SList<Integer>();
		m.setHead(m.mergeTwoLists(t.getHead(),x.getHead()));
		m.print();

		m.setHead(m.reverseList(m.getHead()));
		System.out.println("������ ����Ʈ: ");
		m.print();   System.out.println("-----------------------");

		SList<Integer> y = new SList<Integer>();  // ���� ����Ʈ ��ü y ����
		y.insertFront(450); y.insertFront(175);		y.insertFront(200); y.insertFront(50); y.insertFront(575);	y.insertFront(600);
		y.insertFront(350);y.insertFront(101); y.insertFront(575);	y.insertFront(150); y.insertFront(900);y.insertFront(10); y.insertFront(30);y.insertFront(70);
		y.print();
		System.out.println("�߰� ����� �� = "+y.findMiddleNode(y.getHead()).getItem());  System.out.println("-----------------------");

		SList<Integer> l1 = new SList<Integer>(); 
		SList<Integer> l2 = new SList<Integer>(); 
		y.splitList(y.getHead(),200, l1, l2);
		System.out.println("200�� �������� �� ���� ����Ʈ�� �и�: ");
		l1.print(); 
		l2.print(); System.out.println("-----------------------");
		
		SList<Integer> w = new SList<Integer>();  // ���� ����Ʈ ��ü w ����
		w.insertFront(900); w.insertFront(800);		w.insertFront(600); w.insertFront(540); w.insertFront(530);	w.insertFront(500);
		w.insertFront(400);w.insertFront(330); w.insertFront(310);	w.insertFront(220); w.insertFront(100);w.insertFront(50);
		w.print();
		SList<Integer> u = new SList<Integer>();  // ���� ����Ʈ ��ü u ����
		u.insertFront(600); u.insertFront(550);		u.insertFront(500); u.insertFront(450); u.insertFront(400);	u.insertFront(350);
		u.insertFront(300);u.insertFront(250); u.insertFront(200);	u.insertFront(150); u.insertFront(100);
		u.print();
		System.out.println("���� ���� ��="+u.commonSum(w));  System.out.println("-----------------------");
		
		System.out.println("����Ŭ:"+w.cycleDetector());
		w.createCycle();
		System.out.println("����Ŭ:"+w.cycleDetector());
		

		
		
	}
}
