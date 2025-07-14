package LinkedList;

public class CircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList list=new CircularLinkedList();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.display();

        list.delete(4);
        list.display();
        list.find(3);
}

    private Node head;
    private Node tail;

    public void insertFirst(int value){

        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
            return;
        }

        tail.next=node;
        node.next=head;
       tail=node;
    }

    public void delete(int value){
        Node node=head;
        if(node==null){
            return;
        }
        if(node.value==value){
            head=head.next;
            tail.next=head;
        }

        do{
            Node n=node.next;
            if(n.value==value){
                node.next=n.next;
                break;
            }
            node=node.next;
        }while(node!=head);
    }
    public void display(){
        Node temp=head;
        if(head!=null){
          do {
            System.out.print(temp.value+"->");
            temp=temp.next;
           } while (temp!=head);
           System.out.println("END");
        }
    }

    public void find(int value){
        Node node=head;
        do{
            if(node.value==value){
                System.out.println("FOund "+value);
                return;
            }
            node=node.next;
        }while(node!=head);

        System.out.println("NOtFOund "+value);

    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        // public Node(int value,Node next){
        //     this.value=value;
        //     this.next=next;
        // }
    }
}
