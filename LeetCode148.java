
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
		MergeSort(l1);
		
		ListNode cursor=l1;
		while(l1!=null){
			System.out.println(cursor.val);
			cursor=cursor.next;
		}
	}
	public static void splitList(ListNode l, ListNode left, ListNode right) {
        int length=0;
		ListNode cur_count=l;
		while(cur_count!=null){
			length++;
			cur_count=cur_count.next;
		}
		//get the lengt value
		ListNode cur=l;
		int pos_id=1;
		while (pos_id<=length/2){
			left=cur;
			left=left.next;
			cur=cur.next;
			pos_id++;
		}		
		while(pos_id<length){
			right=cur;
			right=cur.next;
			cur=cur.next;
			pos_id++;
		}
    }
	public static void MergeSort(ListNode l){
		if (l==null) return;
		else {
			//ListNode left=null;
			//ListNode right=null;
			//splitList(l,left,right);
			
			MergeSort(left); MergeSort(right); Merge(l,left,right);
		}
	}
	public static void Merge(ListNode l, ListNode l1, ListNode l2){
		ListNode cur=l;
		ListNode cur_1=l1;
		ListNode cur_2=l2;
		while(l1!=null && l2!=null){
			 if(cur_1.val<cur_2.val){
				 cur.next=cur_1;
				 cur=cur.next;
				 cur_1=cur_1.next;
			 }
			 else {
				 cur.next=cur_2;
				 cur=cur.next;
				 cur_2=cur_2.next;
			 }
		}
		if (cur_1!=null) cur.next=cur_1;
		if (cur_2!=null) cur.next=cur_2;
	}
}