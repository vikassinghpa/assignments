package OOPS;

public class nodes {
	public static class node{
		int data;
		node next;
	}
	public static void printList( node n) {
		while(n!=null) {
			System.out.println(n.data +" ");
			n=n.next;
		}
		
	}

	public static void main(String[] args) {
		node head=null;
		node second=null;
		node third=null;
		
		head=new node();
		second =new node();
		third =new node();
		
		head.data=1;
		head.next =second;
		
		second.data = 2;
        second.next = third;
		
		third.data=3;
		third.next=null;
		
		printList(head);
		

	}

}
