package printing;

public class Printer<T extends ICartridge> implements IMachine
{

    private String modelNumber;
    private PaperTray paperTray = new PaperTray();
    private Machine machine;
    private T cartridge;
    

    
    public Printer(boolean isOn, String modelNumber, T cartridge)
    {
        machine = new Machine(isOn);
        this.modelNumber = modelNumber;
        this.cartridge = cartridge;
    }
    

    
    public void print(int copies)
    {
        System.out.println(cartridge.getFillPercentage());  // Prints the type of cartridge, this is for generic types

        String powerStatus = "off.";  // Sets powerStatus to correct status based on isOn()
        if(isOn())
        {
            powerStatus = "on.";
        }

        int copiesCount = 1; // just a tracking variable to allow printing the copy being printed.
        while(copies > 0 && paperTray.isEmptyPT() && machine.isOn) // print the # copies specified by copies
        {
            System.out.println(copiesCount + ": The printer: " + modelNumber + " is " + powerStatus);
            copies --;
            copiesCount ++;
            paperTray.usePage();
        }
        
        if(!paperTray.isEmptyPT())
            System.out.println("papertray is empty");
        if(machine.isOn)
        {
            System.out.println("Printer is on");
        }

  //      if( paperTray.isEmptyPT() && machine.isOn) // if the paperTray is empty or the 
  //          System.out.println("paper tray is NOT empty");
  //      else if(!paperTray.isEmptyPT() || !machine.isOn)
  //          System.out.println("paper is empty, or the printer is turned off");
  //      System.out.println(paperTray.isEmptyPT());

    }
    
    public void setModelNumber(String mNum)
    {
        modelNumber = mNum;
    }
    
    public String getModelNumber()
    {
        return modelNumber;
    }

    public void loadPaper(int count) 
    {
        paperTray.addPaper(count);    
    }

    public <U extends ICartridge> void printUsingCartridge(U cartridge, String message)
    {
        System.out.println(cartridge.toString());
        System.out.println(message);
        System.out.println(cartridge.toString());
    }
    
    @Override
    public void TurnOn()
    {
        System.out.println("Warming up printer");
        machine.TurnOn();
    }
    
    @Override
    public void TurnOff() 
    {
        machine.TurnOff();        
    }



    @Override
    public boolean isOn() {
        return machine.isOn();
    }
}
