import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String addBorderLine = "*******************************************"; /// this is used to display a border
        boolean isRunning = true;
        MyStack myStack = new MyStack();

        System.out.println(addBorderLine); // border line style
        System.out.println("press 1 to push to stack");
        System.out.println("press 2 to pop from stack");
        System.out.println("press 3 to peek at top of stack");
        System.out.println("press 4 to check if stack is empty");
        System.out.println("press 5 exit");
        System.out.println(addBorderLine); // border line style

        while (isRunning) {

            Scanner userInput = new Scanner(System.in);
            int userChoice = userInput.nextInt();

            if (userChoice == 1) { //push
                System.out.println("enter number value to push to stack");
                Scanner userInput1 = new Scanner(System.in);
                int userChoice1 = userInput1.nextInt();

                int stack = myStack.push(userChoice1);

                if(stack == -1){
                    System.out.println("Stack is full");
                }
                else{
                    System.out.print(myStack.peek());
                    System.out.println(" Pushed on Stack"); 
                }
                userChoices();

            } else if(userChoice == 2){ //pop
                int stackElement = myStack.pop();

                if(stackElement == -1){
                    System.out.println("Stack is empty");
                }
                else {
                    System.out.print(stackElement);
                    System.out.println(" Popped off of Stack");
                }
                userChoices();
            }
            else if(userChoice == 3){ //peek
                int stackElement = myStack.peek();
                //if empty print stack is empty
                
                if(stackElement == -1){
                    System.out.println("Stack is empty");
                }
                else {
                    //else stack is not empty print top of stack
                    System.out.print(myStack.peek());
                    System.out.println(" is on top of stack");
                }
                userChoices();
            }
            else if(userChoice == 4){ //check if empty
                //if empty print stack is empty
                if(myStack.isEmpty()){
                    System.out.println("Stack is empty");
                }else{
                    //else stack is not empty print the stack
                    System.out.print("Stack is not empty.The STACK: ");
                    myStack.display();
                }
                userChoices();
            }
            else if(userChoice == 5){ //exit
                isRunning = false;
                System.out.println("Thank you for using the stack");
                System.out.println("Goodbye !!!!!");
            }
        }
    }

    public static void userChoices(){
        String addBorderLine = "*******************************************";

        System.out.println(addBorderLine); // border line style
        System.out.println("press 1 to push to stack");
        System.out.println("press 2 to pop from stack");
        System.out.println("press 3 to peek at top of stack");
        System.out.println("press 4 to check if stack is empty");
        System.out.println("press 5 exit");
        System.out.println(addBorderLine); // border line style
    }
}