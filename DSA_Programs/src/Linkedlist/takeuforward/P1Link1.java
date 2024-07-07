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

	
public static int lengthLL(Node head) {
	int len=0;
	Node temp=head;
	while(temp!=null) {
		temp=temp.next;
		len++;
	}
	
	return len;
	
}

static int checkIFPresent(Node head,int val) {
	Node temp=head;
	while(temp!=null) {
if(temp.data==val)
	return 1;
		
		temp=temp.next;
	
	}
	return 0;
}
	public static void main(String[] args) {
		int [] arr= {72,5,6,8};
		Node head=convert2Array(arr);
		System.out.println(lengthLL(head));
		
		System.out.println(checkIFPresent(head, 69));
		/*
		 * Node y=new Node(arr[3]); System.out.println(y.data);
		 */
		
	}
}
