package printing;

public class BWCartridge implements ICartridge
{
    @Override
    public String toString()
    {
        return "BW cartridge";
    }
    
    @Override
    public String getFillPercentage()
    {
        return "50%";
    }
}
