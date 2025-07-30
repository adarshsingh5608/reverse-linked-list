package linkedlistnew;


class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		this.next=null;
	}
}
public class revlink {
	static node reverse(node head) {
		node curr= head;
		node prev=null;
		node temp;
		while(curr!=null) {
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		return prev;
	}
	public static void print(node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head= head.next;
		}
		System.out.println();	}
	public static void main(String args[]) {
		node head= new node(10);
		head.next= new node(20);
		head.next.next= new node(30);
		head.next.next.next= new node(50);
		head.next.next.next.next = new node(50);
		head.next.next.next.next.next = new node(60);
		System.out.print("Original list: ");
		print(head);
		System.out.print("Reversed list: ");
		head= reverse(head);
		print(head);
		
	}

}
