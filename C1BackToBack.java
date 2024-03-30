class C1BackToBack extends ConsoleProgram {

  /**
  * Given a string, take the last character and print a new string with the last character added at the front and 
  * back, so "cat" yields "tcatt". The original string will be length 1 or more.
  * @author: B. Yu
  */
  
  public void run() {
    
    // Declare variables
    String strInput;
    int intLength;
    String newString;

    // Receive string from user
    strInput = readLine("Enter a word(s): ");

    // Determine last character of the string
    strLength = strInput.length();

    while (true) {
      if (intLength == 1) {
        strInput = readLine("Enter a string with at least two characters: ");
        intLength = strInput.length();
      } else if (intLength > 1) {
        break;
      }
    }
    
    intLength = intLength - 1;

    // Print the new string with the last character added at the front and back
    System.out.println("New word(s) is: " + strInput.substring(strLength) + strInput + strInput.substring(strLength));





  }
}
