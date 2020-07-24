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
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  
import java.util.Locale;

/**
 *
 * @author hugob
 */
public class Date
{       
    
  public String getDate(){
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EE, DD MMM YYYY HH:MM:SS", Locale.ENGLISH);
    LocalDateTime now = LocalDateTime.now();
    return dtf.format(now);     
  }
 
 public String convertDate(String date){
    
   /*  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss", Locale.CANADA_FRENCH);
       LocalDateTime dateTime = LocalDateTime.parse(date, dtf);
       return dtf.format(dateTime);
*/ return date;
  } 
}