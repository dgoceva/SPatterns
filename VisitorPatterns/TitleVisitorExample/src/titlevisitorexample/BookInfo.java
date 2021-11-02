/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titlevisitorexample;

public class BookInfo extends AbstractTitleInfo {  
   private String author;
    
   public BookInfo(String titleName, String author) {
       this.setTitleName(titleName);
       this.setAuthor(author);
   }    
   
   public void setAuthor(String authorIn) {
       this.author = authorIn;
   }
   public String getAuthor() {
       return this.author;
   }
   
   public void accept(TitleBlurbVisitor titleBlurbVisitor) {
       titleBlurbVisitor.visit(this);
   }
}