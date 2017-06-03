package Business;

import DataAccess.DatabaseAccess;
import javax.swing.JOptionPane;

public class Process 
{
    private static Process instance = null;
    public static Process getInstance()
    {
      if(instance == null) 
      {
         instance = new Process();
      }
      return instance;
   }
    
    public boolean isWordInDatabase(String value)
    {
        String str = DatabaseAccess.getInstance().getHashEMap(value);
        String str1 = DatabaseAccess.getInstance().getHashVMap(value);
        if (str == null && str1 == null)
        {
            JOptionPane.showMessageDialog(null, "This word doesn't exist in database");
            return false;
        }
        return true;
    }
    
    public boolean isWordInFavorite(String value)
    {
        return true;
    }
}
