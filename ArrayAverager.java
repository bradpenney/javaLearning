/*
* Averages any number of double values entered by the programmer into the array below
* Answer to Question #3 of
* Herbert Schildt's Java: A Beginners Guide (Page 178)
*/

class ArrayAverager {

  public static void main(String args[]){
    double values[] = {12.47, 45.29, 88.33, 67.478565, 89.127845, 48.0, 3.14, 89.66, 45.8878549, 27.01};
    double sum = 0;

    for (int i=0; i&lt;values.length; i++){
	    sum += values[i];
	  }

	  System.out.println(sum/values.length);

  } // end main
} // end ArrayAverager
