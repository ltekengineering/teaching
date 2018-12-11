/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class25;
import Class24.*;
import java.net.URL;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;


/**
 *
 * @author lakhan
 */
public class RemoteXML implements Runnable{
    private String url;
    private boolean writefile;
    public RemoteXML(String url,boolean writefile){
        this.url = url;
        this.writefile = writefile;
    }
    
    @Override 
    public void run(){
        
        try {
            
            URL url = new URL(this.url);            
            InputStream inp = url.openStream();
            InputStreamReader inpr = new InputStreamReader(inp);
            BufferedReader bfr = new BufferedReader(inpr);
            FileWriter fw = new FileWriter("C:\\Users\\lakhan\\Downloads\\"+this.url.replace("/","_").replaceAll("[$&+,:;=?@#|]", "_"));
            BufferedWriter bfw = new BufferedWriter(fw);
            
            String line;
            int counter=0;
            while((line=bfr.readLine())!=null){
                if(writefile){
                    bfw.write(line+"\n");
                }                
//                System.out.println(Arrays.toString(line.trim().split(",")));
                counter++;
            }
            bfw.close();
            System.out.printf("There are %d lines in the file\n",counter);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
