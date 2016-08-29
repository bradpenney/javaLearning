/*
* StackDemo - a demonstration of how a stack works
* Remember - a stack is last-in, last-out (LILO)
* From Herbert Schildt's Java: A Beginner's Guide, 6th ed.
* Page 628-629
*/

class Stack {
  private char stack[]; // this array holds the stack
  private int tos; // top of stack

  // Construct an empty Stack given its size
  Stack(int size){
    stack = new char[size]; // allocate memory for stack
    tos = 0;
  }

  // Construct a Stack from a Stack
  Stack (Stack ob){
    tos = ob.tos;
    stack = new char [ob.stack.length];

    // copy elements
    for (int i=0; i < tos; i++){
      stack[i] = ob.stack[i];
    }
  }

  // Construct a stack with initial values
  Stack(char a[]){
    stack = new char[a.length];

    for (int i = 0; i < a.length; i++){
      push(a[i]);
    }
  }

  // Push characters onto the stack
  void push(char ch){
    if (tos == stack.length){
      System.out.println(" -- Stack is full.");
      return;
    }

    stack[tos] = ch;
    tos++;
  }

  // Pop a character from the stack
  char pop(){
    if (tos == 0){
      System.out.println(" -- Stack is empty.");
      return (char) 0;
    }

    tos--;
    return stack[tos];
  }

} // end Stack

// Demonstrate the Stack Class
public class StackDemo {
  public static void main(String args[]){
      // construct a 10-element empty stack
      Stack stack1 = new Stack(10);

      char name[] = {'B', 'r', 'a', 'd'};

      // construct stack from array
      Stack stack2 = new Stack(name);

      char ch;
      int i;

      // put some characters into stack1
      for (i=0; i < 10; i++){
        stack1.push((char)('1' + i));
      }

      // construct stack from another stack
      Stack stack3 = new Stack(stack1);

      System.out.println();

      // show the stacks
      System.out.printf("Contents of stack1: ");
      for (i=0; i < 10; i++){
        ch = stack1.pop();
        System.out.print(ch);
      }

      System.out.println("\n");

      System.out.printf("Contents of stack2: ");
      for (i=0; i< 4; i++){
        ch = stack2.pop();
        System.out.print(ch);
      }

      System.out.println("\n");

      System.out.printf("Contents of stack3: ");
      for(i=0; i < 10; i++){
        ch = stack3.pop();
        System.out.print(ch);
      }

      System.out.println("\n");
  } // end main
} // end StackDemo
