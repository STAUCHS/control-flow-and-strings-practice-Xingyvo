class A3Within10 extends ConsoleProgram {

  /**
  * Given 2 int values via user input, output whichever value is nearest to the value 10, or output  
  * 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
  * @author: B. Yu
  */
  
  public void run() {

    // Declare variables and receive input
    int intFirst = readInt("Enter the first integer: ");
    int intSecond = readInt("Enter the second integer: "); 

    // Determine which value is nearest to the value 10
    int diffA = Math.abs(intFirst - 10);
    int diffB = Math.abs(intSecond - 10);
      
    if (diffA < diffB) {
      System.out.println(intFirst + " is closer to 10.");
    } else if (diffB < diffA) {
      System.out.println(intSecond + " is closer to 10.");
    } else if (diffB == diffA) {
      System.out.println("0");
    }
  }
}

