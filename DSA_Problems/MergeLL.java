

public class MergeLL {
    public static void main(String[] args) {

        // MergeLL first=new MergeLL();
 
        // MergeLL second=new MergeLL();

        // first.insertLast(1);
        // first.insertLast(3);
        // first.insertLast(2);

        // second.insertLast(1);
        // second.insertLast(2);
        // second.insertLast(4);
        // second.insertLast(3);
        
        // MergeLL ans=MergeLL.merge(first, second);
        // ans.display();

        // System.out.println(detect(second.head));
    }

public Node head;
private Node tail;

public void insert(int value){
    Node node=new Node(value);
    node.next=head;
    head=node;
    if(tail==null){
        tail=head;
    }
    
}
public void insertLast(int value){
    Node node=new Node(value);

    if(tail==null){
        head=node;
        tail=node;
    }
     tail.next=node;
     tail=node;
     
 }

public void display(){
    Node temp= head;

    while (temp!=null) {
        System.out.print(temp.value+"->");
        temp=temp.next;
    }
    System.out.print("END");

}
public static MergeLL merge(MergeLL first, MergeLL second){
    Node f=first.head;
    Node s=second.head;

    MergeLL ans=new MergeLL();

    while (f!=null && s!=null) {
        if(f.value<s.value){
            ans.insertLast(f.value);
            f=f.next;
        }else{
            ans.insertLast(s.value);
            s=s.next;
        }
    }
    while (f!=null) {
        ans.insertLast(f.value);
        f=f.next;
    }
    while ((s!=null)) {
        ans.insertLast(s.value);
        s=s.next;
    }
    return ans;
}

public static boolean detect(Node head){
    Node fast=head;
    Node slow=head;

    while (fast!=null&& fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;

        if(slow==fast){
            return true;
        }
    }
    return false;

    
}



private class Node{

    private int value;
    private Node next;

    public Node(int value){
        this.value=value;
    }
    // public Node(int value, Node )
}
}
