package my_package;
 
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
 
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
 
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.DOMBuilder;
import org.jdom2.input.SAXBuilder;
import org.jdom2.input.StAXEventBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.xml.sax.SAXException;
 
@SuppressWarnings("unused")
        

public class LireXML 
{       

    NouvellesControleur controleur;
   
    
     public LireXML(NouvellesControleur controleur) {
        this.controleur = controleur;
        
      //  initComponents();
      //  initialiserNouvelles();
    }
    
    public static void getNouvelles(NouvellesControleur controleur){
        
        System.out.println("\n========== START ...\n");
        // lien pour le feed
        String xmlFile = "https://www.teluq.ca/site/infos/rss/communiques.php";
    // String xmlFile = "myxml.xml";
        Document document = getSAXParsedDocument(xmlFile);
        Element rootNode = document.getRootElement();

       List list = rootNode.getChildren("channel");
       for ( int i = 0; i < list.size(); i++ ) {
         Element node = (Element) list.get(i);
         
         controleur.setTitle(node.getChildText("title"));
         controleur.setDescription(node.getChildText("description"));
         List li = node.getChildren("item");  
         
         for ( int j = 0; j < li.size(); j++ ){
            Element itemNode = (Element) li.get(j);
            Nouvelles nouvelle = new Nouvelles();
            nouvelle.setTitle(itemNode.getChildText("title"));
            nouvelle.setLink(itemNode.getChildText("link"));
            nouvelle.setPubDate(itemNode.getChildText("pubDate"));
            nouvelle.setDescription(itemNode.getChildText("description"));
            controleur.ajouterNouvelle(nouvelle);
         }
        }
        System.out.println("\n... END ==============\n");
    }
    
    private static void readChanelNode( Element chanelNode) {
         chanelNode.getChildren("item").forEach(LireXML::readItemNode );
    }
    
    private static Nouvelles readItemNode(Element itemNode) {
        Nouvelles nouvelle = new Nouvelles();
        nouvelle.setTitle(itemNode.getChildText("title"));
        nouvelle.setLink(itemNode.getChildText("link"));
        nouvelle.setPubDate(itemNode.getChildText("pubDate"));
        nouvelle.setDescription(itemNode.getChildText("description"));
        return nouvelle;
    }


    private static Document getSAXParsedDocument(final String fileName) 
    {
        SAXBuilder builder = new SAXBuilder(); 
        Document document = null;
        try
        {
            document = builder.build(fileName);
        } 
        catch (JDOMException | IOException e) 
        {
            e.printStackTrace();
        }
        return document;
    }
     
    private static Document getStAXParsedDocument(final String fileName) 
    {
         
        Document document = null;
        try
        {
            XMLInputFactory factory = XMLInputFactory.newFactory();
            XMLEventReader reader = factory.createXMLEventReader(new FileReader(fileName));
            StAXEventBuilder builder = new StAXEventBuilder(); 
            document = builder.build(reader);
        } 
        catch (JDOMException | IOException | XMLStreamException e) 
        {
            e.printStackTrace();
        }
        return document;
    }
     
    private static Document getDOMParsedDocument(final String fileName) 
    {
        Document document = null;
        try
        {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            //If want to make namespace aware.
            //factory.setNamespaceAware(true);
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            org.w3c.dom.Document w3cDocument = documentBuilder.parse(fileName);
            document = new DOMBuilder().build(w3cDocument);
        } 
        catch (IOException | SAXException | ParserConfigurationException e) 
        {
            e.printStackTrace();
        }
        return document;
    }
    
    // Description
    // exporter la nouvelle sur le fichier selectionner
    public void exporterXML(NouvellesControleur controleur, String path){
        
       //Creer un Root Element
        Element root=new Element("channel");
        Document doc=new Document();
        ArrayList<Nouvelles> nouv = controleur.getListeNouvelle();
        
        // parcourir les nouvelles
        for (int counter = 0; counter < nouv.size(); counter++) { 		      
            Nouvelles nouvelle = nouv.get(counter);
            Element child = new Element("item");
            child.addContent(new Element("title").addContent(nouvelle.getTitle()));
            child.addContent(new Element("link").addContent(nouvelle.getLink()));
            child.addContent(new Element("guid").addContent(nouvelle.getLink()));
            child.addContent(new Element("pubDate").addContent(nouvelle.getPubDate()));
            child.addContent(new Element("description").addContent(nouvelle.getDescription()));
            root.addContent(child);
      }   		
        
        // Definir l'element racine du document
        doc.setRootElement(root);
       
        //Create the XML
        XMLOutputter outter=new XMLOutputter();
        outter.setFormat(Format.getPrettyFormat());
        try {
            outter.output(doc, new FileWriter(new File(path)));
            String message = "Le fichier XML a été enregistré dans le répertoire suivant : \n" + path;
            controleur.afficherMessage(message);

        } catch (IOException ex) {
            Logger.getLogger(LireXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}