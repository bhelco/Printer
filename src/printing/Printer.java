package printing;

public class Printer 
{
    public boolean isOn;
    private String modelNumber;
    
    public Printer(boolean isOn, String modelNumber)
    {
        this.isOn = isOn;
        this.modelNumber = modelNumber;
    }
    
    public void print(int copies)
    {

        String powerStatus = "off.";
        if(this.isOn)
        {
            powerStatus = "on.";
        }

        for(int i = 0; i < copies; i++)
        {
            System.out.println(i + 1 + ": The printer: " + modelNumber + " is " + powerStatus);
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
}
