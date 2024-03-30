class A1FreezingHot extends ConsoleProgram {

  /**
  * Given two temperatures via user input, output 
  * true if one is less than 0 and the other is greater than 100.
  * @author: B. Yu
  */
  
  public void run() {

    // Declare variables and receive value via user input
    int intTemp1 = readInt("Enter the first temperature: ");
    int intTemp2 = readInt("Enter the second temperature: ");

    // Output true of one is less than 0 and the other is greater than 100
    if ((intTemp1 < 0 || intTemp1 > 100) && (intTemp2 < 0 || intTemp2 > 100)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
    
  }
}
