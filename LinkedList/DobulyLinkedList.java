package LinkedList;

public class DobulyLinkedList
 {
    public static void main(String[] args) {
     DobulyLinkedList
      list=new DobulyLinkedList
     ();

        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertLast(6);
        list.insertAt(7,3 );
        list.display();
        // System.out.println(list.deleteAt(2));
        list.display();
        list.find(2);
    }
    

    private Node head;
    private Node tail;

    private int size;

    
    public DobulyLinkedList
    () {
        this.size=0;
        
    }

    public void insertFirst(int value){
        Node node=new Node(value);
        
        node.next=head;
        if(head!=null){
            head.prev=node;
        }
       
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int value){
        Node node=new Node(value);
    //   if tail is present 
        // if(tail==null){
        //     insertFirst(value);
        //     return;
        // }
        // tail.next=node;
        // node.prev=tail;
        // tail=node;

        // size++;

        Node last=head;
        if(head==null){
            node.prev=null;
            head=node;
            tail=node;
            size++;
            return;
           
        }

        while(last.next!=null){
            last=last.next;
        }

        last.next=node;
        node.prev=last;
        tail=node;

         size++;

         
    }

    public void insertAt(int value, int index){

        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node temp=head;

        for(int i=1;i<index;i++){
            temp=temp.next;
        }

        Node node=new Node(value);
        node.next=temp.next;
        temp.next=node;
        node.prev=temp;
        node.next.prev=node;
        size++;


    }

    public int deleteFirst(){
        if(head==null){
            System.out.println("The list is empty");
        }
        int value=head.value;

        head=head.next;
        if(head!=null) head.prev=null;
        else tail=null;
        
        
        size--;
        return value;
    }
    public int deleteLast(){
        Node secondLast=get(size-2);
        int value=tail.value;

        tail=secondLast;
        tail.next=null;
        return value;
    }

    public int deleteAt(int index){
        if(index==0){
            deleteFirst();
        }
        if(index==size){
            deleteLast();
        }
        Node prevNode=get(index-1);
        int value=prevNode.next.value;
        Node deleteNode=prevNode.next;

        prevNode.next=deleteNode.next;
        deleteNode.next.prev=prevNode;


        return value;

    }
    public Node get(int index){
        Node node=head;
        for(int i=0; i<index; i++){
            node=node.next;
        }
        return  node;
    }

    public void display(){
        Node temp=head;

        while (temp!=null) {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");

        Node last=tail;

        while (last!=null) {
            System.out.print(last.value+"->");
            last=last.prev;
        }
        System.out.println("START");
    }
    public void find(int value){
        Node node=head;

        while (node!=null) {
            if(node.value==value){
                System.out.println("FOUND");
                return;
            }
            node=node.next;
        }
        System.out.println("Not");
    }


    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value=value;
        }

        // public Node(int value, Node next, Node prev){
        //     this.value=value;
        //     this.next=next;
        //     this.prev=prev;
        // }
    }
}
