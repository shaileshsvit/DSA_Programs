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
public static void main(String[] args) {
	
	int [] arr= {72,5,6,8};
	P1Link1 p1=new P1Link1();
	Node head=p1.convert2Array(arr);
    Traverse(head);
    
    System.out.println("\nLinked List after deletion of head");
    head=removeK(head,3);
    Traverse(head);
    //head=removeTail(head);
    
    
}
}
