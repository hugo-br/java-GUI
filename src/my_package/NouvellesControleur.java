/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_package;

import java.text.MessageFormat;
import java.util.ArrayList;
import javax.xml.parsers.ParserConfigurationException;
/**
 *
 * @author hugob
 */

public final class NouvellesControleur {
    
    ArrayList<Nouvelles> nouvelles = new ArrayList<Nouvelles>();
    protected String title;
    protected String description;
    FluxInterface fluxInterface; 
    AjoutInterface ajoutInterface;
    ModifInterface editInterface;
    ExportInterface exportInterface;
    LireXML reader;
    Date date;
    
    
    public NouvellesControleur() throws ParserConfigurationException {
      
      // aller chercher le feed   
      reader = new LireXML(this);
      reader.getNouvelles(this);
     
      fluxInterface = new FluxInterface(this);
      ajoutInterface = new AjoutInterface(this);
      editInterface = new ModifInterface(this);
      exportInterface = new ExportInterface(this);
      
      date = new Date();
  
     System.out.println("\n.....Initialiser l'application....\n");
     fluxInterface.setVisible(true);
     ajoutInterface.setVisible(false);
     editInterface.setVisible(false);
     exportInterface.setVisible(false);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParserConfigurationException {
        
        NouvellesControleur controleur = new NouvellesControleur();

    }
    
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    } 
    
     public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }    
        
 // Ajout de la nouvelle   
  public void ajouterNouvelle(Nouvelles nouvelle) {    
        nouvelles.add(nouvelle);  
  }
  
  // Enlever la nouvelle de la liste
   public void supprimerNouvelle(Integer i) {
        
        
        Nouvelles nouv = this.getNouvelle(i);
        String message = nouv.getTitle() + " a été supprimé de la liste.";
        nouvelles.remove(nouv); 
        
        // Mise a jour la liste 
       this.mettreAJour();  
       
       // afficher message
       this.afficherMessage(message);
  } 
  
    // Description : retourner toutes les nouvelles <ArrayList>
   public ArrayList<Nouvelles> getListeNouvelle() {
        return nouvelles;
    }
    
    // Description : retourner une nouvelle particuliere
    public Nouvelles getNouvelle(int i){
         ArrayList<Nouvelles> nouv = this.nouvelles;
         return nouv.get(i);
    }
    
    // Description : afficher l'interface pour l'ajout
    public void afficherAjout(){
       ajoutInterface.setVisible(true);
    }
    
    // Description : afficher l'interface pour l'ajout
    public void afficherExport(){
       exportInterface.setVisible(true);
    }
    
    // Description : mettre à jour la liste graphique des nouvelles
    public void mettreAJour(){
       fluxInterface.mettreAJourListing();
       String message = "La nouvelle a été mise à jour!";
       this.afficherMessage(message);
    }
    
    
     // Description : afficher l'interface pour la modification
    public void afficherEdit(int r){
        if(r >= 0){
         editInterface.afficherModifNouvelle(r);
         editInterface.setVisible(true);
        }
    }
    
    /* Description :
            Convertir une date
    */
    public String convertDate(String longDate){
       return date.convertDate(longDate);
    }
    
    // Description : retourner la date <String>
     public String getDate(){
        // return "text";
        return date.getDate();
     }
     
      // Description : creer et exporter un fichier XML
     public void exporterXML(String path){
           String replacePath = path.replace("\\", "\\\\");  
           replacePath = replacePath + "\\monFeed.xml";
           reader.exporterXML(this, replacePath);
     }
     
     public void afficherMessage(String message){
       fluxInterface.afficherMessage(message);
     }
}
