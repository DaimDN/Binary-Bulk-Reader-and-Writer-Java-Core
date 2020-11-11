/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daim
 */
class writeable extends Thread implements Runnable {
    
    public String datafeed;
    
    public writeable(String datafeed){
        this.datafeed = datafeed;
        
    }
    public void run(){
        try {
            writer();
        } catch (IOException ex) {
            Logger.getLogger(writeable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void writer() throws IOException{
       
         String str = this.datafeed;

        FileWriter writer =new FileWriter("output.bin"); 
        
        for (int i = 0; i < str.length(); i++) 
            writer.write(str.charAt(i)); 
  
        System.out.println("File has been written successfully");
        
        writer.close(); 
    }
    
}
