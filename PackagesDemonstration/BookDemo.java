/*
* BookDemo - a demonstration of how a packages work in Java
* From Herbert Schildt's Java: A Beginner's Guide, 6th ed.
* Page 270-271
*/

package bookpack;

class Book{
  private String title;
  private String author;
  private int pubDate;

  Book(String t, String a, int d){
    title = t;
    author = a;
    pubDate = d;
  }

  void show(){
    System.out.println(title);
    System.out.println(author);
    System.out.println(pubDate + "\n");
  }
} // end Book

class BookDemo{
  public static void main(String args[]){
    Book books[] = new Book[5];

	// Just some books lying around on my desk!!
    books[0] = new Book("Java, A Beginners Guide", "Schildt", 2014);
    books[1] = new Book("The Art of Learning", "Waitzkin", 2007);
    books[2] = new Book("Zen Mind, Beginner's Mind", "Suzuki", 1970);
    books[3] = new Book("The Magic of Reality", "Dawkins", 2011);
    books[4] = new Book("Mind Change", "Greenfield", 2015);

    System.out.println();
    for(int i = 0; i < books.length; i++){
      books[i].show();
    }
  } // end main
} // end BookDemo
