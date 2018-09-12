
class ListNode {
		int val;
		ListNode next;
		public ListNode(int x) { val = x; }
}

public class LeetCode148{
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
		ListNode l=MergeSort(l1);		
		//Print the final results 
		ListNode cursor=l;
		while(cursor!=null){
			System.out.println(cursor.val);
			cursor=cursor.next;
		}
	}
	public static ListNode MergeSort(ListNode l){
		if (l==null || l.next==null) return l;
		ListNode left=l;
		ListNode middle =getMiddle(l);		
		ListNode right=middle.next;
		middle.next=null;
		MergeSort(left);
		MergeSort(right);
		return Merge(left,right);
	}
	public static ListNode Merge(ListNode left, ListNode right){
		ListNode cur_left=left;
		ListNode cur_right=right;
		ListNode head=null;
		if (left==null && right==null) return head;
		if (left==null && right!=null) {head=right; return head;}
		if (left!=null && right==null){head=left; return head;}
		if (cur_left.val<cur_right.val){
			head = cur_left;
			cur_left=cur_left.next;
		}
		else {
			head=cur_right;
			cur_right=cur_right.next;
		}
		ListNode head_cursor=head;		
		while(cur_left!=null && cur_right!=null){
			if (cur_left.val<cur_right.val){
				head_cursor.next=cur_left;
				cur_left=cur_left.next;
				head_cursor=head_cursor.next;
			}
			else {
				head_cursor.next=cur_right;
				cur_right=cur_right.next;
				head_cursor=head_cursor.next;				
			}
		}
		if (cur_left!=null) head_cursor.next=cur_left;
		if(cur_right!=null) head_cursor.next=cur_right;
		return head;
	}
	public static ListNode getMiddle(ListNode l){
		ListNode fast=l;
		ListNode slow=l;
		while (fast.next.next!=null && slow.next !=null){
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
	}
}	