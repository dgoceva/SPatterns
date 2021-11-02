/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titlevisitorexample;

public abstract class TitleBlurbVisitor {
   String titleBlurb;
   public void setTitleBlurb(String blurbIn) {
       this.titleBlurb = blurbIn;
   }
   public String getTitleBlurb() {
       return this.titleBlurb;
   }
    
   public abstract void visit(BookInfo bookInfo);
   public abstract void visit(DvdInfo dvdInfo);   
   public abstract void visit(GameInfo gameInfo);
}  