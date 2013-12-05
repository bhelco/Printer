package printing;

public class Printer 
{
    public boolean isOn;
    public String modelNumber;
    
    public Printer(boolean isOn, String modelNumber)
    {
        this.isOn = isOn;
        this.modelNumber = modelNumber;
    }
    
    public void print()
    {
        String power = "off.";
        if( this.isOn)
        {
            power = "on.";
        }
        
        System.out.println("The printer: " + modelNumber + " is " + power);
       
    }
    
    public void print(String text)
    {
        System.out.println(text);
    }
    
    public String getModelNumber()
    {
        return modelNumber;
    }
}
