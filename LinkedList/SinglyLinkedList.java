package LinkedList;

public class SinglyLinkedList {
    public static void main(String[] args) {
        LL  list=new LL();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertLast(7);


        list.insertAt(6, 5);

        list.display();
        // System.out.println();
        // System.out.println(list.deleteFirst());

        // list.display();
        // System.out.println();

        System.out.println(list.deleteLast());
        list.display();
        // System.out.println();
        // list.deleteAt(2);
        // list.display();
        System.out.println();
        // System.out.println(list.find(2));

        list.reverse();
        list.display();
        
    }
}

    class LL{
        private Node head;
        private Node tail;

        private int size;

        public LL(){
            this.size=0;
        }

        public void insertFirst(int value){
            Node node=new Node(value);
            node.next=head;
            head=node;

            if(tail==null){
                tail=head;
            }
            size+=1;
        }

        public void insertLast(int value){
           if(tail==null){
            insertFirst(value);
           }
            Node node=new Node(value);
            tail.next=node;
            tail=node;
            size++;
        }

        public void insertAt(int value, int index){
            if(index==0){
                insertFirst(value);
            }
            if(index==size){
                insertLast(value);
            }
            Node temp=head;

            for(int i=1;i<index;i++){
                temp=temp.next;

            }
            Node node=new Node(value,temp.next);
            temp.next=node;
            size++;
        }

        public int deleteFirst(){
            int value=head.value;
            head=head.next;

            if(head==null){
                tail=null;
            }
            size--;
            return value;
        }

        public int deleteLast(){
            if(size<=1){
                return deleteFirst();
            }

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

            Node prev=get(index-1);
            int value=prev.next.value;
            prev.next=prev.next.next;
            
            return value;
        }
        public Node get(int index){
            Node node=head;
            for(int i=0; i<index;i++){
                node=node.next;
            }

            return node;
        }

        public Node find(int value){
            Node node=head;

            while (node!=null) {
                if(node.value==value){
                    return node;
                }

                node=node.next;
            }
            return null;
        }

        public void display(){
            Node temp;
            temp=head;
            while(temp!=null){
                System.out.print(temp.value+"->");
                temp=temp.next;
            }
            System.out.print("END");
        }

        public void reverse(){
            Node prev=null;
            Node present=head;
            Node next=present.next;

            while(present!=null){
                present.next=prev;
                prev=present;
                present=next;
                if(next!=null){
                    next=next.next;
                }
            }
            head=prev;
        }
    
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
    }