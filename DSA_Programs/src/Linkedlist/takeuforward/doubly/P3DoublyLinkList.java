package Linkedlist.takeuforward.doubly;


class Node{
	int data;
	Node next;
	Node back;
	Node(int data,Node next,Node back){
		this.data=data;
		this.next=next;
	    this.back=back;
	
	}
	
	Node(int data){
		this.data=data;
		this.next=null;
		this.back=null;
	}
}



public class P3DoublyLinkList {
	public static Node convertArray2DLL(int [] arr) {
		
		Node head=new Node(arr[0]);
		Node prev=head;
		for(int i=1;i<arr.length;i++) {
			Node temp=new Node(arr[i],null,prev);
			prev.next=temp;
		   prev=temp;
		}
		return head;
	}
	
	public static void print(Node head) {
		while(head!=null) {
			System.out.print(head.data+"-->");
			head=head.next;
		}
	}
	public static void main(String[] args) {
  
		int arr[]= {12,5,8,15};
		Node head=convertArray2DLL(arr);
		print(head);
	}
}
