import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
class Node{
    char value;
    Node left;
    Node right;
    
    public Node (char value){
        this.value=value;
    }    
   
    
}

class LeetCodeDemo {
    public static void main(String[] args) {
        Node A=new Node('A');
        A.left=null;
        A.right=null;
        
        Node C=new Node('C');
        C.left=null;
        C.right=null;
        
        Node E= new Node('E');
        E.left=null;
        E.right=null;
        
        Node I =new Node('I');
        I.left=null;
        I.right=null;
        
        Node K =new Node('K');
        K.left=null;
        K.right=null;
         
        Node B=new Node('B');
        B.left=A;
        B.right=C;
        
        Node G= new Node('G');
        G.left=null;
        G.right=I;
        
        Node J=new Node('J');
        J.left=G;
        J.right=K;
        
        Node D = new Node('D');
        D.left=B;
        D.right=E;
        
        Node F= new Node('F');
        F.left=D;
        F.right=J;
        
       Preorder(F);
       System.out.println("Now the results of iterative preorder");
       IterativePreorder(F);
       System.out.println("Now the results of recursive inorder");
       Inorder(F);
        //Inorder print out 
        //preorder print out
        //postorder print out
        
        
        
        
        
    }   

    private static void Preorder(Node root) {
        if (root==null) return;
        System.out.println(root.value);
        Preorder(root.left);
        Preorder(root.right);
    
    }   
    
    private static void IterativePreorder(Node root){
        Stack<Node> PreOrderStack= new Stack<>();
        PreOrderStack.push(root);        
        while (!PreOrderStack.isEmpty()){
            Node popItem=PreOrderStack.pop();
            System.out.println(popItem.value);
            if(popItem.right!=null) PreOrderStack.push(popItem.right);
            if (popItem.left!=null )PreOrderStack.push(popItem.left);
        }
    }
    
    private static void Inorder(Node root) {
        if (root==null) return;        
        Inorder(root.left);
        System.out.println(root.value);
        Inorder(root.right);    
    }   
}
