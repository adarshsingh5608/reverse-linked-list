package linkedlistnew;

import recursionrewind.node;

class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		this.next=null;
	}
}
public class middlelle {
	public static int getlen(node head) {
		node curr=head;
		int len=0;
		while(curr!=null) {
			len++;
			curr= curr.next;
		}
		return len;
	}
public static int middle(node head) {
	int len=getlen(head);
	int mid=len/2;
	int i=0;
	while(i<mid) {
		head=head.next;
		i++;
	}
	return head.data;
}
public static void main(String args[]) {
	node head= new node(10);
	head.next= new node(20);
	head.next.next= new node(30);
	head.next.next.next= new node(50);
	head.next.next.next.next = new node(50);
	
	System.out.println(middle(head));
}
}
