/*
* VarargsDemo - variable-length arguments
* Answers Question #13 of Chapter 6 Self Test
* From Herbert Schildt's Java: A Beginner's Guide, 6th ed.
*/

class VarargsDemo{

  static int sumOfInts = 0;

  public static int sum(int ... v){
    for (int i =0; i < v.length; i++){
      sumOfInts += v[i];
    }
    return sumOfInts;
  }

  public static void main(String[] args){

    sum(53, 97, 412);

    System.out.println();
    System.out.println("The sum of the integers is: " + sumOfInts + "\n");

  } // end main
} // end VarargsDemo
