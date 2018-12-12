/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class25;
import java.net.URL;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

//XML related imports
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

//W3C Document Object Model standard or in short DOM
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;



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
            //Reader info
            URL url = new URL(this.url);            
            InputStream inp = url.openStream();            
            //Writing mechanism
            FileWriter fw = new FileWriter("C:\\Users\\lakhan\\Downloads\\"+this.url.replace("/","_").replaceAll("[$&+,:;=?@#|]", "_"));
            BufferedWriter bfw = new BufferedWriter(fw);            
            //XML realted code
            DocumentBuilderFactory domBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = domBuilderFactory.newDocumentBuilder();
            Document doc = documentBuilder.parse(inp);//this is the line that parses the xml file.
            doc.getDocumentElement().normalize();
            
            System.out.println("Initial node name: "+doc.getDocumentElement().getNodeName());
            System.out.println("Initial node type: "+doc.getDocumentElement().getNodeType());
            System.out.println("Initial node value: "+doc.getDocumentElement().getNodeValue());
            
            NodeList nodeList = doc.getElementsByTagName("row");
            
            for(int i = 0;i<nodeList.getLength();i++){
                Node eachRow = nodeList.item(i);
                
                NodeList childNodes = eachRow.getChildNodes();
                String line = "";
                for (int j = 0; j < childNodes.getLength(); j++) {
                    Node node  = childNodes.item(j);
                   line+=  node.getNodeName()+" : "+node.getTextContent()+". ";
                }
                System.out.println(line);
//                System.out.printf("Zipe code: %s. "
//                        + "Total Population: %s. "
//                        + "Median Age: %s. "
//                        + "Total Males: %s."
//                        + "Total Females: %s."
//                        + "Total Household: %s."
//                        + "Average Household Size: %s. \n",eachRow.getFirstChild().getTextContent(),
//                        eachRow.getFirstChild().getNextSibling().getTextContent(),
//                        eachRow.getFirstChild().getNextSibling().getNextSibling().getTextContent(),
//                        eachRow.getFirstChild().getNextSibling().getNextSibling().getNextSibling().getTextContent(),
//                        eachRow.getFirstChild().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getTextContent(),
//                        eachRow.getFirstChild().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getTextContent(),
//                        eachRow.getFirstChild().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getTextContent());                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
