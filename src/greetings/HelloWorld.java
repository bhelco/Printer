package greetings;

import printing.IMachine;
import printing.Printer;


public class HelloWorld 
{
    public static void main(String[] args)
    {
        IMachine myMachine = new Printer(true, "My Printer");
        myMachine.TurnOn();
        System.out.println(myMachine.isOn());
//        IMachine myMachine1 = new IMachine(false);
        myMachine.TurnOff();
        System.out.println(myMachine.isOn());
    }

}
