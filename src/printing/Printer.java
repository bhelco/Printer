package printing;

public class Printer implements IMachine
{

    private String modelNumber;
    private PaperTray paperTray = new PaperTray();
    private Machine machine;
    

    
    public Printer(boolean isOn, String modelNumber)
    {
        machine = new Machine(isOn);
        this.modelNumber = modelNumber;
    }
    

    
    public void print(int copies)
    {

        String powerStatus = "off.";
        if(isOn())
        {
            powerStatus = "on.";
        }

        int copiesCount = 1;

        while(copies > 0 && paperTray.isEmptyPT() && machine.isOn)
        {
            System.out.println(copiesCount + ": The printer: " + modelNumber + " is " + powerStatus);
            copies --;
            copiesCount ++;
            paperTray.usePage();
        }
        
        if( paperTray.isEmptyPT() && machine.isOn)
            System.out.println("paper tray is NOT empty");
        else if(!paperTray.isEmptyPT() || !machine.isOn)
            System.out.println("paper is empty, or the printer is turned off");
        System.out.println(paperTray.isEmptyPT());

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
