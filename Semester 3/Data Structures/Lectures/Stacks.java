package DS;

class Stacks {
private int arr[];
private int top;
private int capacity;

// Creating a stack
Stacks(int size) {
 arr = new int[size];
 capacity = size;
 top = -1;
}

// Add elements into stack
public void push(int x) {
 if (isFull()) {
   System.out.println("OverFlow\nProgram Terminated\n");
   System.exit(1);
 }

 System.out.println("Inserting " + x);
 arr[++top] = x;
}

// Remove element from stack
public int pop() {
 if (isEmpty()) {
   System.out.println("STACK EMPTY");
   System.exit(1);
 }
 return arr[top--];
}

// Utility function to return the size of the stack


// Check if the stack is empty
public Boolean isEmpty() {
 return top == -1;
}

// Check if the stack is full
public Boolean isFull() {
 return top == capacity - 1;
}

public void printStack() {
 for (int i = 0; i <= top; i++) {
   System.out.println(arr[i]);
 }
}

public static void main(String[] args) {
 Stacks stack = new Stacks(5);

 stack.push(1);
 stack.push(2);
 stack.push(3);
 stack.push(4);

 stack.pop();
 stack.printStack();
 System.out.println("\nAfter popping out");
 
 while (!stack.isEmpty()) {
     System.out.printf(" %d", stack.pop());
 }
 
 stack.printStack();

}
}