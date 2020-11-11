 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daim
 */
public class Readable{
        
     public String dataFeed(){
        String data = "";
           try {
              data = filereader();
         } catch (IOException ex) {
             Logger.getLogger(Readable.class.getName()).log(Level.SEVERE, null, ex);
         }
           return data;
     }
     
     public String filereader() throws IOException{
         String str = "";
         FileReader reader = null;
         int ch;
        try
        {             
           reader = new FileReader("test.bin");            
          while ((ch=reader.read())!=-1) {
              str = str + (char)ch;
          }
            reader.close();
        } 
        catch (FileNotFoundException fe) 
        { 
            System.out.println("File not found"); 
        } 
         return str ;
         
     }
    
}
