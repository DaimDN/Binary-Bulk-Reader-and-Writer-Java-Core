/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.Collectors;
import sun.rmi.runtime.Log;
import java.util.Arrays;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author Daim
 */
public class Term {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      JOptionPane.showMessageDialog(null, "Welcome to this app");
      
      
        int data = JOptionPane.showConfirmDialog(null, "Do you want to copy");
        
        if(data == 0){
        Readable rs = new Readable();
       String newstr = rs.dataFeed();

       StringBuffer xstr = Parser(newstr);
       
            System.out.println(xstr);
        
        
       //writeable able = new writeable(newstr);
       
       //able.start();
        }
        else if(data == 1){
            System.exit(1);
        }
        else if(data == 2){
            System.exit(1);
        }
        else{
            System.out.println("Invalid");
        }

    }
    
    public static StringBuffer Parser(String str){
       
        String[] array = str.split(" ");
        
        StringBuffer stBuffer = new StringBuffer();
        
        for(int a =0; a < array.length; a++){
        String datafeed = array[a];
        int charCode = Integer.parseInt(datafeed, 2);
        String strs = new Character((char)charCode).toString();
        stBuffer.append(strs);
        } 
       

        return stBuffer;
        
        
    }

}
