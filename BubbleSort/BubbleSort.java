/*
* BubbleSort - sorts the elements of an array from least to greatest
* From Herbert Schildt's Java: A Beginner's Guide, Page 141
*/

public class BubbleSort {
  public static void main (String args[]){
    int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 587, 49};

    int a, b, t, size;

    size = 10; // number of elements to sort

    System.out.println();

    // display the original array
    System.out.printf("Original array is:");
    for (int i=0; i < size; i++){
      System.out.printf(" " + nums[i]);
	  }

    System.out.println();

    // Bubble Sort
    for (a = 1; a < size; a++){
      for (b=size-1; b >= a; b--){
        if (nums[b-1] > nums[b]){ // if out of order
          // exchange elements
          t = nums[b-1];
          nums[b-1] = nums[b];
          nums[b] = t;
        } // end if
      } // end inner for
    }  // end outer for

    // display the sorted array
    System.out.printf("Sorted array is:");
    for (int i=0; i < size; i++){
      System.out.printf(" " + nums[i]);
    }
    
    System.out.println();
		System.out.println();

  } // end main
} // end BubbleSort
