/*
* BubbleSortString - sorts the Strings of an array from least to greatest first letter
* Answer of Question #4 of Self-Test
* From Herbert Schildt's Java: A Beginner's Guide (Page 178)
* Adapted from BubbleSort (Page 141)
* Also consulted http://stackoverflow.com/questions/12986386/sorting-an-array-of-strings-with-java
*/

public class BubbleSortString {
  public static void main (String args[]){
    String words[] = {"Live", "Long", "And", "Prosper"};

    int a, b;

    String t;

    System.out.println();
    // display the original array
    System.out.printf("Original array is:");
    for (int i=0; i < words.length; i++){
      System.out.printf(" " + words[i]);
    }
    System.out.println();

    // Bubble Sort
    for (a = 1; a < words.length; a++){
      for (b=words.length-1; b >= a; b--){
        if (words[b-1].compareTo(words[b]) > 0){ // if out of order
          // exchange elements
          t = words[b-1];
          words[b-1] = words[b];
          words[b] = t;
        } // end if
      } // end inner for
    }  // end outer for

    // display the sorted array
    System.out.printf("Sorted array is:");
    for (int i=0; i < words.length; i++){
      System.out.printf(" " + words[i]);
    }
    System.out.println();
    System.out.println();

  } // end main
} // end BubbleSortString
