import java.util.Arrays;

public class MyStack {
    int top;
    int capacity;
    int[] stack;

    // constructor
    MyStack() {
        top = -1; 
        capacity = 10; 
        stack = new int[capacity];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
    
    public int push(int data){
        if(isFull()){
            return -1; // return -1 to show stack is full
        }
        return stack[++top] = data;
    }

    public int pop(){
        if(isEmpty()){
            return -1; // stack is empty 
        }
        else{
            return stack[top--]; 
        }
    }

    public int peek(){
        if(isEmpty()){
            return -1; // stack is empty
        }
        else{
            return stack[top];
        }
    }

    public void display(){
        //display all of the elements that were push into the stack
        int[] copiedStack = Arrays.copyOfRange(stack, 0, top + 1);
        System.out.println(Arrays.toString(copiedStack));
    }
}