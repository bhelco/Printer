package greetings;

import printing.Printer;


public class HelloWorld 
{
    public static void main(String[] args)
    {
        Printer myP = new Printer(true, "My Printer");
        myP.print(2);
        myP.loadPaper(5);
        myP.print(2);
        myP.turnOff();
        myP.print(1);
    }

}
