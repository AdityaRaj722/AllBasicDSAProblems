package Stack;

public class Stack {
    private int maxsize;
    private int[] array;
    private int top;
    public Stack(int size){
        this.maxsize=size;
        this.array=new int[maxsize];
        this.top=-1;

    }
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            array[++top] = value; // Increment top and then add value
        }
    }
    public int pop(){
        if (isEmpty()) {
            System.out.println("Stcak is empty");
            return -1;
        }else{
            return array[top--];
        }
    }
    public int peek(){
        if (isEmpty()) {
            System.out.println("Stack id=s empty nothing to peek");
            return -1;
        }else{
            return array[top];
        }
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public  boolean isFull() {
        return (top==maxsize-1);
    }

    public static void main(String[] args) {
        Stack stack=new Stack(5);
        stack.push(10);
        stack.push(40);
        stack.push(30);
        stack.push(50);
        stack.push(20);
        stack.push(70);
        System.out.println(stack.pop());

    }
}
