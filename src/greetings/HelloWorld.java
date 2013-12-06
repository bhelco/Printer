package greetings;

import printing.BWCartridge;
import printing.ColorCartridge;
import printing.Printer;


public class HelloWorld 
{
    public static void main(String[] args)
    {
        Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true, "My Printer", new ColorCartridge());
        
        //printer.printUsingCartridge(new ColorCartridge(), "hi");
        printer.print(1);
        Printer<BWCartridge> printer1 = new Printer<BWCartridge>(true, "My Printer", new BWCartridge());
        printer1.loadPaper(10);
        //printer.printUsingCartridge(new ColorCartridge(), "hi");
        printer1.print(5);
        printer1.print(6);
    }

}
