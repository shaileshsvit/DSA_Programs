package Linkedlist.takeuforward;
import Linkedlist.takeuforward.*;

public class P2InsertDelete {
	
	static Node removeHead(Node head) {
		if(head==null)
			return head;
	Node temp=head;
	head=head.next;
	return head;
		
	}

static void Traverse(Node head) {
	Node temp=head;
	System.out.println();
	while(temp!=null) {

		System.out.print(temp.data+"---->");
		temp=temp.next;
	
	}
}


public static Node removeTail(Node head) {
	
	if(head==null || head.next==null)
		return head;
	Node temp=head;
	while(temp.next.next!=null) {
		temp=temp.next;
	}
temp.next=null;
return head;
}

public static Node removeK(Node head,int k) {
	if(head==null)
		return null;
	if(k==1)
	{
		head=head.next;
		return head;
	}
	int cnt=0;
	Node temp=head;
	Node prev=null;
	while(temp!=null) {
		cnt++;
		if(cnt==k) {
			prev.next=prev.next.next;
			break;
		}
		prev=temp;
		temp=temp.next;
	}
	return  head;
}

public static Node removeBack(Node head) {
	Node temp=head;
	if(head==null || head.next==null )
		return null;
	while(temp.next.next!=null) {
		temp=temp.next;
	}
	temp.next=null;
	
	
	return head;
	
}
public static Node removeFront(Node head) {
	if(head==null)
		return null;
	head=head.next;
	
	return head;
}

public static Node removePos(Node head,int k) {
	if(head==null)
		return head;
	if(k==1) {
		head=head.next;
		return head;
	}
	
	int cnt=0;
	Node prev=null,temp=head;
	while(temp!=null) {
		cnt++;
		if(cnt==k) {
			prev.next=prev.next.next;
			break;
		}
		prev=temp;
		temp=temp.next;
		
	}
	
	
	return head;
}

public static Node insertHead1(Node head,int val) {
	Node temp=new Node(val);
	temp.next=head;
	head=temp;
	return temp;
}
public static Node insertHead(Node head,int val) {
	Node temp=new Node(val,head);
	return temp;
	
}

public static Node insertLast(Node head,int val) {
	
	if(head==null)
	{
		return new Node(val);
	}
	
	Node temp=head;
	
	while(temp.next!=null) {
		temp=temp.next;
	}
	Node newNode=new Node(val);
	temp.next=newNode;
	return head;
}

public static Node insertPos(Node head,int el,int k) {
	if(head==null) {
	if(k==1)
		return new Node(el);
	else 
		return head;
	}
	if(k==1) {
		
		Node newNode=new Node(el,head);
	}
	int cnt=0;
	Node temp=head;
	while(temp!=null) {
		cnt++;
		if(cnt==k-1) {
			Node x=new Node(el,temp.next);
			temp.next=x;
		}
		temp=temp.next;
	}
	return head;
}

public static Node insertBeforeValue(Node head,int el,int val) {
	if(head==null) {
	return null;
	}
	if(head.data==val) {
		
		Node newNode=new Node(el,head);
	}
	Node temp=head;
	while(temp.next!=null) {
		if(temp.next.data==val) {
			Node x=new Node(el,temp.next);
			temp.next=x;
			break;
		}
		temp=temp.next;
	}
	return head;
}


public static void main(String[] args) {
	
	int [] arr= {10,20,30,40};
	P1Link1 p1=new P1Link1();
	Node head=p1.convert2Array(arr);
    Traverse(head);
    
    System.out.println("\nLinked List after deletion of head");
    head=insertBeforeValue(head, 101, 20);

    Traverse(head);
//        head=insertPos(head, 100, 5);

    
//head=insertLast(head,100);
    
    
    //head=removeK(head,3);
    //head=removeBack(head);
     
    //head=removeTail(head);
    
    
}
}
