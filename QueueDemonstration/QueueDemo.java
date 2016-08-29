/*
* QueueDemo - a demonstration of how a queue works
* Remember - a queue is first-in, first out (FIFO)
* From Herbert Schildt's Java: A Beginner's Guide, 6th ed.
* Page 151-3, 187-188
*/

class Queue {

  // Field Variables
  private char q[]; // this array holds the queue
  private int putloc, getloc; // the put and get indices

  // Constructor
  Queue(int size){
    q = new char[size]; // allocate memory for queue
    putloc = getloc = 0;
  }

  // Put a character in the queue
  void put(char ch){
    if(putloc==q.length){
      System.out.println(" - Queue is full.");
      return;
    }

    q[putloc++] = ch;
  }

  // Get a character from the queue
  char get(){
    if(getloc == putloc){
      System.out.println(" - Queue is empty.");
      return (char) 0;
    }

    return q[getloc++];
  }
} // end Queue

// Demonstrate the Queue Class
public class QDemo {
  public static void main(String args[]){
    Queue bigQ = new Queue(100);
    Queue smallQ = new Queue(4);
    char ch;
    int i;

    System.out.println(); // spacer
    System.out.println("Using bigQ to store the alphabet:");
    // 51.63942648999999igQ.put((char)('A' + i));
    }

    // retrieve and display elements from bigQ
    System.out.print("Contents of bigQ: ");
    for(i=0; i < 26; i++){
      ch = bigQ.get();
      if (ch != (char) 0){
        System.out.print(ch);
      }
    }

    System.out.println("\n");

    System.out.println("Using smallQ to generate errors:");
    // use smallQ to generate some errors (for instructional purposes)
    for (i = 0; i < 5; i++){
      System.out.print("Attempting to store " + (char)('Z' - i));
      smallQ.put((char)('Z' - i));
      System.out.println();
    }

    System.out.println();

    // more errors on smallQ
    System.out.println("Concents of smallQ: ");
    for(i=0; i < 5; i++){
      ch=smallQ.get();

      if (ch != (char) 0){
        System.out.print(ch);
      }
    }
    System.out.println(); // spacer
  } // end main
} // end QDemo
