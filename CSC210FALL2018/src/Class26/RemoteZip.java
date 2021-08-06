/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class26;

import java.net.URL;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

//Zip related imports
import java.util.zip.ZipFile;
import  java.util.zip.ZipEntry;



/**
 *
 * @author lakhan
 */
public class RemoteZip implements Runnable{
    private String url;
    private boolean writefile;
    private HashMap<String,Integer> names;
    private HashMap<String,Integer> gender;
    public RemoteZip(String url,boolean writefile){
        this.url = url;
        this.writefile = writefile;
        this.names = new HashMap<>();
        this.gender = new HashMap<>();
    }
    
    @Override 
    public void run(){
        
        try {                                  
            int counter = 0;
            String lineArray[];
            BufferedReader bfr;
            InputStreamReader inpr;
            String line;
            
            ZipFile zipfile = new ZipFile(url);//url here is your local path to the zip folder. 
            ZipEntry entry;//An object to handle each file in the zip folder
            Enumeration<? extends ZipEntry> entries  = zipfile.entries();//an enumeration object like a list for looping 
            while(entries.hasMoreElements()){//while there is a next file in that zip folder.
                entry = entries.nextElement();//this is like the scanners nextInt() so its the next file.
                if(entry.getName().contains("txt")){//the zip folder has txt files and a pdf files but we are only interested in the txt file
                    inpr = new InputStreamReader(zipfile.getInputStream(entry));//unzipping the file is a streaming procedure we need a inputstreamreader
                    bfr = new BufferedReader(inpr);//finally a buffered reader to read the files.                                        
                    while((line=bfr.readLine())!=null){
                        lineArray = line.split(",");
                        if(names.containsKey(lineArray[0])){
                            Integer temp = names.get(lineArray[0]);
                            temp += Integer.parseInt(lineArray[2]);
                            names.put(lineArray[0], temp);
                        }else{
                            names.put(lineArray[0], Integer.parseInt(lineArray[2]));
                        }
                        
                        if(gender.containsKey(lineArray[1])){
                            Integer temp = gender.get(lineArray[1]);
                            temp += Integer.parseInt(lineArray[2]);
                            gender.put(lineArray[1], temp);
                        }else{
                            gender.put(lineArray[1], Integer.parseInt(lineArray[2]));
                        }
                    }
                    
                }//end of if statement to control on the txt files
                
            }//end of all the files in the zip file                                
            
            System.out.printf("There are %,d female credit card applicators \n",gender.get("F"));
            System.out.printf("There are %,d male credit card applicators \n",gender.get("M"));
            
            //Writing mechanism
            FileWriter fw = new FileWriter("C:\\Users\\lakhan\\Downloads\\consumer.csv");
            BufferedWriter bfw = new BufferedWriter(fw);
            bfw.write("Name,Value\n");
            for (Map.Entry<String, Integer> entry1 : names.entrySet()) {
                bfw.write(entry1.getKey()+","+entry1.getValue()+"\n");
                
            }
            bfw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
