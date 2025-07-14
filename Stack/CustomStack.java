package Stack;

public class CustomStack {
    public static void main(String[] args) {
        CustomStack stack=new CustomStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());

    }

    protected int[] data;

    private static final int DEFAULT_SIZE=10;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data=new int[size];
    }

    int top=-1;
    public boolean push(int item){

        if(isFull()){
            System.out.println("The stack is full");
            return false;
        }
        top++;
        data[top]=item;
        return true;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        // int remove=data[top];
        // top--;
        // return remove;
        return data[top--]; 

    }
    public int peek(){
        return data[top];
    }

    public boolean isFull(){
        return top==data.length-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

}
