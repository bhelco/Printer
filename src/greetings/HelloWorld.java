package greetings;

import printing.Printer;


public class HelloWorld 
{
    public static void main(String[] args)
    {
        Printer myP = new Printer(true, "My Printer");
        
        
        myP.print(10);
      
    }

}
