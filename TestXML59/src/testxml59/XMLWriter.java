package testxml59;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLWriter {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.newDocument();

            Element root = document.createElement("institution");
            document.appendChild(root);

            Element shamima = document.createElement("student");
            root.appendChild(shamima);

            Element sId = document.createElement("id");
            sId.appendChild(document.createTextNode("1"));
            shamima.appendChild(sId);

            Element sName = document.createElement("name");
            sName.appendChild(document.createTextNode("Shamima Nasrin"));
            shamima.appendChild(sName);

            Element sFaculty = document.createElement("faculty");
            sFaculty.appendChild(document.createTextNode("FFST"));
            shamima.appendChild(sFaculty);
            
            TransformerFactory transformerFactory=TransformerFactory.newInstance();
            Transformer transformer=transformerFactory.newTransformer();
            
            DOMSource source=new DOMSource(document);
            
            StreamResult result=new StreamResult(new File("output.xml"));
            transformer.transform(source, result);
            System.out.println("New XML file is created.");

        } catch (ParserConfigurationException | TransformerException ex) {
            ex.printStackTrace();
        } 
    }
}
