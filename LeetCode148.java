
public class LeetCode148{
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public static void main(String [] args){
		//4->2->1->3
		//-1->5->3->4->0		
		ListNode l1=new ListNode(4);
		ListNode l1_1=new ListNode(2);
		l1.next=l1_1;
		ListNode l1_2=new ListNode(1);
		l1_1.next=l1_2;
		ListNode l1_3=new ListNode(3);
		l1_2.next=l1_3;
		l1_3.next=null;
	}
	public static void Sort(){
		
	}
	public static void Merge(){
		
	}
}