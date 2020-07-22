package my_package;
 
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
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
 
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.filter.Filters;
import org.jdom2.input.DOMBuilder;
import org.jdom2.input.SAXBuilder;
import org.jdom2.input.StAXEventBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;
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
        
        System.out.println("\n=================================\n");
        String xmlFile = "https://www.teluq.ca/site/infos/rss/communiques.php";
        Document document = getSAXParsedDocument(xmlFile);
        Element rootNode = document.getRootElement();
     //   System.out.println("Root Element :: " + rootNode.getName());
        
     //   rootNode.getChildren("channel").forEach( LireXML::readChanelNode(controleur) );
       Date date = new Date();
     
       List list = rootNode.getChildren("channel");
       for ( int i = 0; i < list.size(); i++ ) {
         Element node = (Element) list.get(i);
         
         controleur.setTitle(node.getChildText("title"));
         controleur.setDescription(node.getChildText("description"));
         

         List li = node.getChildren("item");       
         for ( int j = 0; j < li.size(); j++ ){
            Element itemNode = (Element) li.get(j);
           //  news = readItemNode(itemNode);
           // news.afficher();
            
        Nouvelles nouvelle = new Nouvelles();
        
        
        nouvelle.setTitle(itemNode.getChildText("title"));
        nouvelle.setLink(itemNode.getChildText("link"));
        // convert date
        String pubDate = itemNode.getChildText("pubDate");
        String test = date.convertDate(pubDate);
        
        nouvelle.setPubDate(test);
        
        nouvelle.setDescription(itemNode.getChildText("description"));
        
        controleur.ajouterNouvelle(nouvelle);
        
          //  String title = itemNode.getChildTextTrim("title");
          //  System.out.println(title);
         }
        }
        System.out.println("\n=================================\n");
        
    }
    
    private static void readChanelNode( Element chanelNode) {
       //  System.out.println("\n tttt=   \n");
      //  System.out.println("title : " + chanelNode.getAttributeValue("title"));
      //  System.out.println("title : " + chanelNode.getChildText("title"));
         // get all
         chanelNode.getChildren("item").forEach(LireXML::readItemNode );
    }
    
    private static Nouvelles readItemNode(Element itemNode) {
        Nouvelles nouvelle = new Nouvelles();
        nouvelle.setTitle(itemNode.getChildText("title"));
        nouvelle.setLink(itemNode.getChildText("link"));
        nouvelle.setPubDate(itemNode.getChildText("pubDate"));
        nouvelle.setDescription(itemNode.getChildText("description"));
        return nouvelle;
        
      //  nouvelle.afficher();
       // controleur.ajouterNouvelle(nouvelle);
    }
    
    
     private static void addNews(NouvellesControleur controleur){
        Nouvelles nouvelle = new Nouvelles();
        nouvelle.setTitle("title");
        nouvelle.setLink("link");
        nouvelle.setPubDate("pubDate");
        nouvelle.setDescription("description");
        
         controleur.ajouterNouvelle(nouvelle);
     
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
    
    public void exporterXML(NouvellesControleur controleur, String path){
        
        
       //Root Element
        Element root=new Element("channel");
        Document doc=new Document();
        
         ArrayList<Nouvelles> nouv = controleur.getListeNouvelle();
        
        // loop les nouvelles
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
        
        
        
        //Define root element like root
        doc.setRootElement(root);
       
        //Create the XML
        XMLOutputter outter=new XMLOutputter();
        outter.setFormat(Format.getPrettyFormat());
        try {
         // Writer fileWriter = new FileWriter("C:\\Users\\hugob\\Documents\\"+doc);
            outter.output(doc, new FileWriter(new File(path)));
         //   fileWriter.write(doc);
       //   fileWriter.close();

        } catch (IOException ex) {
            Logger.getLogger(LireXML.class.getName()).log(Level.SEVERE, null, ex);
        }

 
    
    }
    
    
     
    /*private static String readFileContent(String filePath) 
    {
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8)) 
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }*/
}