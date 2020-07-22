/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_package;

/**
 *
 * @author hugob
 */
public class Nouvelles {
   
    protected String title;
    protected String link;
    protected String pubDate;
    protected String description;
    
   /* return data */
    public String getTitle() {
        return title;
    }
    
   public String getLink() {
        return link;
    }
        
    public String getPubDate() {
        return pubDate;
    }
            
    public String getDescription() {
        return description;
    }
   
   /* set data */
    public void setTitle(String title) {
        this.title = title;
    }
        
    public void setLink(String link) {
        this.link = link;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void afficher(){
        System.out.println(this.title);
    }
    
    
    
}