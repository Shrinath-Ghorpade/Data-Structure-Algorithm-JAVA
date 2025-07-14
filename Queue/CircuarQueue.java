package Queue;

public class CircuarQueue {
    public static void main(String[] args) {
        CircuarQueue obj=new CircuarQueue(5);
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);
        obj.display();
        // System.out.println(obj.dequeue());
        obj.dequeue();
        obj.display();
    }

    protected int[] data;
    protected int front=0;
    protected int rear=-1;
    protected int size=0;

    public CircuarQueue(int size){
        this.data=new int[size];
    }

    public void enqueue(int item){
        if(isFull()){
            System.out.println("The queue is full");
            return;
        }
        rear = (rear + 1) % data.length;  // Circular increment
        data[rear] = item;
        size++;
        System.out.println("element inserted"+item);
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("EMpty");
            return-1;
        }

        int removed=data[front];
        // front++;
        front=(front+1) % data.length;
        size--;
        return removed;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
    //    int i=front;
    //    do{
    //     System.out.print(data[i]+" ");
    //     i++;
    //     i%=data.length;
    //    }while(i!=rear);
    for (int i = 0; i < size; i++) {
        System.out.print(data[(front + i) % data.length] + " ");  // Correct circular display
    }

       System.out.println("END");
    }
    private boolean isEmpty() {
        // TODO Auto-generated method stub
       return rear==-1;
    }

    private boolean isFull() {

        return rear==data.length-1;
        
    }

    
}
