package printing;

public class ColorCartridge implements ICartridge
{
    @Override
    public String toString()
    {
        return "Color cartridge";
    }
    @Override
    public String getFillPercentage()
    {
        return "97%";
    }
}
