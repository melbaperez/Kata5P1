package kata5p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {
    
    public static boolean isMail(String line){
       return line.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
    }
    
    public static List<String> read(String fileName){
        List<String> list = new ArrayList<>();
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            while(true){
                String line = reader.readLine();
                if (line == null) break;
                if(MailListReader.isMail(line))
                    list.add(line);
            }
        }
        catch(FileNotFoundException exception){
            System.out.println("ERROR MailListReader::read (FileNotFoundException)" 
                    + exception.getMessage());
        }
        catch(IOException exception){
            System.out.println("ERROR MailListReader::read (IOException)" 
                    + exception.getMessage());
        }
        
        return list;
    }

}
