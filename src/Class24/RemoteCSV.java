/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class24;
import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

        
/**
 *
 * @author lakhan
 */
public class RemoteCSV implements Runnable{
    private String url;
    public RemoteCSV(String url){
        this.url = url;
    }
    
    @Override 
    public void run(){
        
        try {
            URL url = new URL(this.url);            
            InputStream inp = url.openStream();
            InputStreamReader inpr = new InputStreamReader(inp);
            BufferedReader bfr = new BufferedReader(inpr);
            String line;
            int counter=0;
            while((line=bfr.readLine())!=null){
//                System.out.println(Arrays.toString(line.trim().split(",")));
                counter++;
            }
            System.out.printf("There are %d lines in the file\n",counter);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
