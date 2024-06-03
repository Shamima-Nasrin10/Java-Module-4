
package testxml59;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class XMLReader {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=factory.newDocumentBuilder();
             org.w3c.dom.Document document = builder.parse("student.xml");
             
             document.getDocumentElement().normalize();
             
             Element root=document.getDocumentElement();
             System.out.println("Root element: "+root.getNodeName());
             
             NodeList nodeList=document.getElementsByTagName("student");
             
             for(int i=0; i<nodeList.getLength();i++){
                 Node node=nodeList.item(i);
                 if(node.getNodeType()==Node.ELEMENT_NODE){
                    Element element=(Element) node;
                    
                    String id=element.getElementsByTagName("id").item(0).getTextContent();
                    String name=element.getElementsByTagName("name").item(0).getTextContent();
                    String faculty=element.getElementsByTagName("faculty").item(0).getTextContent();
                    
                     System.out.println("Student ID: "+id);
                     System.out.println("Student Name: "+name);
                     System.out.println("Student Faculty: "+faculty);
                 }
             }
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XMLReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(XMLReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XMLReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
