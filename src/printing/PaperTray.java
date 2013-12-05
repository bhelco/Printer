package printing;

public class PaperTray 
{
    int pages = 0;
    
    public void addPaper(int count)
    {
        pages += count;
    }
    
    public void usePage()
    {
        pages--;
    }
    
    public boolean isEmptyPT()
    {
        return pages > 0;
    }
}
