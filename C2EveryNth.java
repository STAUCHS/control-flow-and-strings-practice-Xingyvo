class C2EveryNth extends ConsoleProgram {

  /**
  * Given a non-empty string and an int N, return the string made starting with character 0, 
  * and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
  * @author: B. Yu
  */
  
  public void run() {
    
    // Declare variables and receive values from user
    String strInput = readLine("Enter a string: ");
    int intN = readInt("Enter an int N: ");
    int intLength;
    int intTime = 0;

    // Check if int N is 1 or more
    while (true) {
      if (intN < 1) {
        intN = readInt("Enter an int N that is 1 or more: ");
      } else if (intN >= 1) {
      break;
      }
    }

    // Output every Nth character of the string starting at the character 0
    intLength = strInput.length();

    for (int i = 0; i <= intLength; i += intN) {
      int intFirst = intTime * intN;
      int intSecond = intTime * intN;
      
      System.out.println(strInput.substring(intFirst, intSecond + 1));
      intTime++;
    }
  


  }
}
