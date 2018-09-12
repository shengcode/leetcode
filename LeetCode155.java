
import java.util.Stack;
class MinStack {
    /** initialize your data structure here. */
    private Stack<Integer> myStack ;
	private Stack <Integer>minStack;
	
	public MinStack() {
		myStack=new Stack<>();
		minStack=new Stack<>();
    }
    
    public void push(int x) {
        myStack.push(x);
		if(minStack.isEmpty()){
			minStack.push(x);
		}
		else if(!minStack.isEmpty()){
			if(x<=minStack.peek()){
				minStack.push(x);
			}			
		}
    }
    /* why the top */
    public void pop() {
		int val = myStack.pop();		
		if (!minStack.empty()){
			if(val==minStack.peek()){
				minStack.pop();
			}
		}
	
    }
    /* get the top element not remove */
    public int top() {
		int val=myStack.peek();
		/*if (!minStack.empty()){
			if(val==minStack.peek()){
				minStack.pop();
			}
		}*/
        
		return val;
    }
    
    public int getMin() {
		int val=minStack.peek();
        return val;
    }
}

public class LeetCode155{
	public static void main (String [] args){
		System.out.println("hello");
	}
}