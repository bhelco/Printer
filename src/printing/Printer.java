package printing;

public class Printer extends Machine
{

    private String modelNumber;
    private PaperTray paperTray = new PaperTray();
    
    public Printer(boolean isOn, String modelNumber)
    {
        super(isOn);
        this.modelNumber = modelNumber;
    }
    
    public void print(int copies)
    {

        String powerStatus = "off.";
        if(this.isOn)
        {
            powerStatus = "on.";
        }

        int copiesCount = 1;

        while(copies > 0 && paperTray.isEmptyPT() && this.isOn)
        {
            System.out.println(copiesCount + ": The printer: " + modelNumber + " is " + powerStatus);
            copies --;
            copiesCount ++;
            paperTray.usePage();
        }
        
        if( paperTray.isEmptyPT() && this.isOn)
            System.out.println("paper tray is NOT empty");
        else if(!paperTray.isEmptyPT() || !this.isOn)
            System.out.println("paper is empty, or the printer is turned off");
        System.out.println(paperTray.isEmptyPT());

    }
    
    public void printColors()
    {
        String[] colors = new String[] { "Red", "Blue", "Green", "Yellow", "Orange" };
        
        for(String currentColor : colors)
        {
            System.out.println(currentColor);

        }
    }
    
    public void print(String text)
    {
        System.out.println(text);
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
}
