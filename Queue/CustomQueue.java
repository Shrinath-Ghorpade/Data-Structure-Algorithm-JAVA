package Queue;

public class CustomQueue {
    public static void main(String[] args) {
        CustomQueue queue=new CustomQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.dequeue());
        queue.display();
        
    }

    private int[] data;
    int  front=0; 
    int rear=-1;

    public CustomQueue(int size){
        this.data=new int[size];
    }

    public void  enqueue(int item){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        data[++rear]=item;
        System.out.println("Element inserted:"+item);

    }
    public int dequeue(){

        if(isEmpty()){
            System.out.println("Queue is full");
            return-1;
        }
        int removed=data[front];

        for(int i=1; i<data.length;i++){
            data[i-1]=data[i];
        }
        rear--;
        return removed;

    }
    public int peek(){
        return data[0];
    }

    public void display(){
        if(isEmpty()){
            return;
        }
        for(int i=0;i<=rear;i++){
            System.out.print(data[i]+" ");

        }
        System.out.println("end");
    }

    public boolean isFull(){
        return rear==data.length-1;
    }

    public boolean isEmpty(){
        return rear==-1;}


}
