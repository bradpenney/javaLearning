/*
* QuickSort - recusively sorts the elements of an array
*              from least to greatest
* From Herbert Schildt's Java:
*         A Beginner's Guide
* Page 212-213
*/

class QuickSort {
  // Set up a call to the actual QuickSort method
  static void qSort(char items[]){
    qs(items, 0, items.length-1);
  }

  // A recursive version of QuickSort for characters.
  private static void qs(char items[], int left, int right){
    int i, j;
    char x, y;

    i = left;
    j = right;

    x = items[(left+right)/2];

    do {
      while ((items[i] < x) &amp;&amp; (i < right)){
        i++;
      }
      while ((x < items[j]) &amp;&amp; (j > left)){
        j--;
      }

      if (i <= j){
        y = items[i];
        items[i] = items[j];
        items[j] = y;
        i++;
        j--;
      }
    } while (i <= j);

    if (left < j) qs(items, left, j);
    if (i < right) qs(items, i, right);
  }
} // end QuickSort

class QSDemo {
  public static void main(String[] args){
    char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
    int i;

    System.out.println();

    System.out.printf("Original array: ");
    for (i=0; i < a.length; i++){
      System.out.print(a[i]);
    }

    System.out.println();

    // Sort the array
    QuickSort.qSort(a);

    System.out.printf("Sorted array: ");
    for(i=0; i < a.length; i++){
      System.out.print(a[i]);
    }

    System.out.println();
    System.out.println();

  } // end main
} // end QSDemo
