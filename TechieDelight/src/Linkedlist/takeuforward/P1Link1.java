package Linkedlist.takeuforward;

class Node{
	int data;
	Node next;
	Node(int data,Node next){
		this.data=data;
		this.next=next;
	}
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}


public class P1Link1 {

static	Node convert2Array(int [] arr) {
	  Node head=new Node(arr[0]);
	  Node mover=head;
	  for(int i=1;i<arr.length;i++) {
		  Node temp=new Node(arr[i]);
		  System.out.print(temp.data+"  --> ");
		  mover.next=temp;
		  mover=temp;
	  }
	  return head;
	
	}

	
	public static void main(String[] args) {
		int [] arr= {72,5,6,8};
		Node head=convert2Array(arr);
		System.out.println(head.data);
		
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" -- >");
			temp=temp.next;
		}
		
		/*
		 * Node y=new Node(arr[3]); System.out.println(y.data);
		 */
		
	}
}
