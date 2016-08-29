/*
* SwapMethodDemo - create a method that swaps
*                 values of fields within an object
* Answer to Question #4 of Chapter 6 Self-Test
* From Herbert Schildt's Java: A Beginner's Guide, 6th ed.
*/

class SwapMethodDemo{

  int a = 0;

  SwapMethodDemo(int i){
    a = i;
  }

  // Swap contents of 2 test objects
  static void swap(SwapMethodDemo x, SwapMethodDemo y){
    SwapMethodDemo temp = new SwapMethodDemo(0);
    SwapMethodDemo temp01 = x;
    SwapMethodDemo temp02 = y;
    temp.a = temp01.a;
    temp01.a = temp02.a;
    temp02.a = temp.a;
  }

  public static void main(String[] args){

    SwapMethodDemo firstObj = new SwapMethodDemo(1);
    SwapMethodDemo secondObj = new SwapMethodDemo(2);

    System.out.println();
    System.out.println("Value of firstObj: " + firstObj.a);
    System.out.println("Value of secondObj: " + secondObj.a + "\n");

    SwapMethodDemo.swap(firstObj, secondObj);

    System.out.println("Value of firstObj: " + firstObj.a);
    System.out.println("Value of secondObj: " + secondObj.a + "\n");

  } // end main
} // end SwapMethodDemo
