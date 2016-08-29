/*
* RecursionDemo - when a method calls itself
* Answers Question #6 of Chapter 6 Self Test
* From Herbert Schildt's Java: A Beginner's Guide, 6th ed.
*/

class RecursionDemo {

  String stringToReverse;

  RecursionDemo(String x){
      stringToReverse = x;
  }

  public void reverse(int index){
    if (index != stringToReverse.length() -1){
      reverse (index+1);
    }
    System.out.print(stringToReverse.charAt(index));
  }

  public static void main (String[] args){

    RecursionDemo demonstrateRecursion = new RecursionDemo("Java is Spectacular!!");

    System.out.println("\n" + "The original statement is: " + demonstrateRecursion.stringToReverse);
    System.out.printf("After being reversed via recurision it becomes: ");
    demonstrateRecursion.reverse(0);
    System.out.println("\n");

  } // end main
} // end RecursionDemo
