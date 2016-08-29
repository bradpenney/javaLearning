/*
* Demonstrates cipher that uses 8-character string as key.
* Answers Question #7 of Self Test from
* Herbert Schildt's Java: A Beginners Guide
* Adapted from example in text on Page 624
*/

class Encode {
  public static void main(String[] args){
    String msg = "This is a cipher that uses a 8-character string to encode itself.  See if you can crack the cipher!";
    String encmsg = "";
    String decmsg = "";
    String key = "agrivate";
    int keyCounter = 0;

    System.out.println();
    System.out.println("Original message: " + msg);


    //encode the message
    for(int i = 0; i < msg.length(); i++){
      encmsg = encmsg + (char)(msg.charAt(i) ^ key.charAt(keyCounter));
      keyCounter++;
      if (keyCounter == 8){
        keyCounter = 0;
      }
    }

    System.out.println();
    System.out.println("Encoded message: " + encmsg);

    //decode the message
    keyCounter = 0;
    for(int i = 0; i < msg.length(); i++){
      decmsg = decmsg + (char)(encmsg.charAt(i) ^ key.charAt(keyCounter));
      keyCounter++;
      if (keyCounter == 8){
        keyCounter = 0;
      }
    }

    System.out.println();
    System.out.println("Decoded message: " + decmsg);
    System.out.println();

  } // end main
} // end Encode
