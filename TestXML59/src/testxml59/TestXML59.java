package testxml59;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

public class TestXML59 {

    public static void main(String[] args) {
        SAXParserFactory spf = SAXParserFactory.newInstance();
        spf.setNamespaceAware(true);
        spf.setValidating(true);

        System.out.println("Parser will " + (spf.isNamespaceAware() ? "" : "not ") + "be namespace aware");
        System.out.println("Parser will " + (spf.isValidating() ? "" : "Not")  +" validate XML");
        SAXParser parser=null;
        try {
            parser=spf.newSAXParser();
        } catch (ParserConfigurationException ex) {
            java.util.logging.Logger.getLogger(TestXML59.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            System.exit(1);
        } catch (SAXException ex) {
            java.util.logging.Logger.getLogger(TestXML59.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            System.exit(1);
        }
        
        System.out.println("Parser object is: "+parser);
    }

}
