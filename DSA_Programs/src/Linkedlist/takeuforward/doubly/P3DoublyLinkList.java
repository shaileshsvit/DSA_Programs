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
		if(arr.length<1)
			return null;
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
	
	static public Node deleteHead(Node head) {
		
		if(head==null || head.next==null)
			return null;
		Node prev=head;
		head=head.next;
		head.back=null;
		prev.next=null;
		
		return head;
	}
	
	public static Node deleteTail(Node head) {

		if(head==null || head.next==null)
			return null;
		
		Node tail=head;
		while(tail.next!=null) {
			tail=tail.next;
		}
		Node prev=tail.back;
		prev.next=null;
		return head;
	}
	
	public static  Node removeKthElement(Node head,int k) {
		if(head==null)
			return null;
		
		int cnt=0;
		Node temp=head;
		while(temp!=null) {
			cnt++;
			
			if(cnt==k) {
	
				
				break;
			}
			temp=temp.next;
		}
		Node prev=temp.back;
		Node Front=temp.next;
		
		if(prev==null && Front==null) {
			return null;
		}
		else if(prev==null) {
		return	deleteHead(head);
		}
		else if(Front==null) {
			return deleteTail(head);
		}
		
		prev.next=Front;
		Front.back=prev;
		temp.next=null;
		temp.back=null;
		return head;
		
	}
	public static void main(String[] args) {
  
		int arr[]= {10,20,30,40};
		Node head=convertArray2DLL(arr);
		print(head);
		//head=deleteHead(head);
		System.out.println();
		//head=deleteTail(head);
		head=removeKthElement(head, 3);
		print(head);
	}
	
}
