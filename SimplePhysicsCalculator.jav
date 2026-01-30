class SimplePhysicsCalculator
{
  public static void main( String[] args )
  {
   int contin = 1; 
    while ( contin == 1 ) {
   
      

    //asks user to pick a mass density or volume
    System.out.println ("Welcome to the simple calculator: ");
    int condition = 0;
    System.out.println ("Pick 1: for mass, 2: for density, 3: for volume. ");
    int choice = Console.readInt ();
    
    //while loop for if none of the options are picked 
      while (choice != 1  && choice != 2 && choice != 3) {
     System.out.print ("You didnt choose 1, 2 or 3. Try again: ");
     int choose = Console.readInt ();
     choice = choose;
     
    }
    
    //actual calculations 
    // I = if statment
    while (condition == 0){
      if (choice == 1) {
       System.out.print ("You wanna find mass: enter your density first. ");
       double denisity_I_1 = Console.readDouble ();
       System.out.print ("Now enter your Volume. ");
       double Volume_I_1 = Console.readDouble ();
       System.out.print ("the mass is equal to " + (denisity_I_1 * Volume_I_1));
       condition++;
      }
      else if (choice == 2){
        System.out.print ("You wanna find density: enter your mass first. ");
        double mass_I_2 = Console.readDouble ();
        System.out.print ("Now enter your Volume. ");
        double Volume_I_2 = Console.readDouble ();
        System.out.print ("the density is equal to " + (mass_I_2 / Volume_I_2));
       condition++;
      }
      
      else if (choice == 3) {
        System.out.print ("You wanna find volume: enter your mass first. ");
        double mass_I_3 = Console.readDouble ();
        System.out.print ("Now enter your density. ");
        double density_I_3 = Console.readDouble ();
        System.out.print ("the volume is equal to " + (mass_I_3 / density_I_3));
        condition++;
      
      }
    }
    
    System.out.print ("would you like to continue yes or no: ");
    String yesno = Console.readString ();
    
    if (yesno.equalsIgnoreCase ("no")) {
    contin = 0;
    }
    
    
    
    }
    
    
    
    
    
    
  }
}
