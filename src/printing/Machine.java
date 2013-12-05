package printing;

public class Machine 
{
    protected boolean isOn;
    public Machine(boolean isOn)
    {
        this.isOn = isOn;
    }
    public void turnOn()
    {
        isOn = true;
    }
    
    public void turnOff()
    {
        isOn = false;
    }
}
