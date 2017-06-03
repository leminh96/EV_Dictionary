package DataAccess;

import java.io.*;
import javax.xml.parsers.*;
import java.util.*;
import org.w3c.dom.*;

public class DatabaseAccess 
{
    private static DatabaseAccess instance = null;
    public static DatabaseAccess getInstance() 
    {
      if(instance == null) 
      {
         instance = new DatabaseAccess();
      }
      return instance;
   }
    private final Map <String, String> Edictionary;
    private final Map <String, String> Vdictionary;

    private String[] all_e_words;
    private String[] all_v_words;
    private final Vector<String> favorite_eword = new Vector<>();
    private final Vector<String> favorite_vword = new Vector<>();
    
    public void parseXmlFile(String xml1, String xml2) throws Exception
    {
        File file1 = new File(xml1);
        File file2 = new File(xml2);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(file1);
        
        doc.getDocumentElement().normalize();
        
        NodeList list = doc.getElementsByTagName("record");
        int total_word = list.getLength();
        all_e_words = new String[total_word];
        String word, meaning;
        for (int i = 0; i < total_word; i++)
        {
            Node word_node = list.item(i);
            if (word_node.getNodeType() == Node.ELEMENT_NODE)
            {
                Element e = (Element) word_node;
                word = e.getElementsByTagName("word").item(0).getTextContent();
                meaning = e.getElementsByTagName("meaning").item(0).getTextContent();
                this.Edictionary.put(word, meaning);
                all_e_words[i] = word;
            }
        }
        
        doc = builder.parse(file2);
        doc.getDocumentElement().normalize();
        
        list = doc.getElementsByTagName("record");
        total_word = list.getLength();
        all_v_words = new String[total_word];
        for (int i = 0; i < total_word; i++)
        {
            Node word_node = list.item(i);
            if (word_node.getNodeType() == Node.ELEMENT_NODE)
            {
                Element e = (Element) word_node;
                word = e.getElementsByTagName("word").item(0).getTextContent();
                meaning = e.getElementsByTagName("meaning").item(0).getTextContent();
                this.Vdictionary.put(word, meaning);
                all_v_words[i] = word;
            }
        }
    }

    public DatabaseAccess() 
    {
        this.Vdictionary = new HashMap<>();
        this.Edictionary = new HashMap<>();
    }
    
    public String getHashEMap(String value)
    {
        return this.Edictionary.get(value);
    }
    
    public String getHashVMap(String value)
    {
        return this.Vdictionary.get(value);
    }
    
    public String[] getListEWord()
    {
        return this.all_e_words;
    }
    
    public String[] getListVWord()
    {
        return this.all_v_words;
    }
    
    public Vector<String> getListFavoriteEWord()
    {
        return this.favorite_eword;
    }
    
    public Vector<String> getListFavoriteVWord()
    {
        return this.favorite_vword;
    }
    
    public void readBinFile() throws IOException
    {
        try
        {
            DataInputStream fin = new DataInputStream(new FileInputStream("favorite_e.bin"));
            while(fin.available() > 0)
            {
                String temp = fin.readUTF();
                this.favorite_eword.add(temp);
            }
        }
        catch (IOException ex)
        {
            System.out.print("File input not found");
        }
        try
        {
            DataInputStream fin = new DataInputStream(new FileInputStream("favorite_v.bin"));
            while(fin.available() > 0)
            {
                String temp = fin.readUTF();
                this.favorite_vword.add(temp);
            }
        }
        catch (IOException ex)
        {
            System.out.print("File input not found");
        }
    }
    
    public void writeBinFile() throws IOException
    {
        DataOutputStream fout1 = new DataOutputStream(new FileOutputStream("favorite_e.bin"));
        DataOutputStream fout2 = new DataOutputStream(new FileOutputStream("favorite_v.bin"));
        for (int i = 0; i < this.favorite_eword.size(); i++)
        {
            fout1.writeUTF(this.favorite_eword.get(i));
        }
        for (int i = 0; i < this.favorite_vword.size(); i++)
        {
            fout2.writeUTF(this.favorite_vword.get(i));
        }
    }
}
